.class public final Lio/sentry/android/core/internal/util/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/p0;
.implements Lio/sentry/android/core/b0;


# static fields
.field public static final L:Lio/sentry/util/a;

.field public static volatile M:Landroid/net/ConnectivityManager;

.field public static final N:Lio/sentry/util/a;

.field public static final O:Ljava/util/ArrayList;

.field public static final P:[I

.field public static final Q:[I


# instance fields
.field public final E:Ljava/util/ArrayList;

.field public final F:Lio/sentry/util/a;

.field public volatile G:Lio/sentry/android/core/internal/util/b;

.field public volatile H:Landroid/net/NetworkCapabilities;

.field public volatile I:Landroid/net/Network;

.field public volatile J:J

.field public final K:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final w:Landroid/content/Context;

.field public final x:Lio/sentry/q6;

.field public final y:Lio/sentry/android/core/k0;

.field public final z:Lio/sentry/android/core/internal/util/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lio/sentry/android/core/internal/util/c;->L:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lio/sentry/android/core/internal/util/c;->N:Lio/sentry/util/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/sentry/android/core/internal/util/c;->O:Ljava/util/ArrayList;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x2

    filled-new-array {v0, v1, v2, v3}, [I

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/internal/util/c;->P:[I

    new-array v0, v3, [I

    sput-object v0, Lio/sentry/android/core/internal/util/c;->Q:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/q6;Lio/sentry/android/core/k0;)V
    .locals 3

    sget-object v0, Lio/sentry/android/core/internal/util/d;->w:Lio/sentry/android/core/internal/util/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lio/sentry/util/a;

    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/internal/util/c;->F:Lio/sentry/util/a;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lio/sentry/android/core/internal/util/c;->J:J

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/android/core/internal/util/c;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object p1, v1

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    iput-object p2, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    iput-object p3, p0, Lio/sentry/android/core/internal/util/c;->y:Lio/sentry/android/core/k0;

    iput-object v0, p0, Lio/sentry/android/core/internal/util/c;->z:Lio/sentry/android/core/internal/util/d;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/util/c;->E:Ljava/util/ArrayList;

    sget-object p1, Lio/sentry/android/core/internal/util/c;->Q:[I

    const/16 p2, 0xc

    aput p2, p1, v2

    const/4 p2, 0x1

    const/16 p3, 0x10

    aput p3, p1, p2

    new-instance p1, Lio/sentry/android/core/internal/util/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/sentry/android/core/internal/util/a;-><init>(Lio/sentry/android/core/internal/util/c;I)V

    invoke-virtual {p0, p1}, Lio/sentry/android/core/internal/util/c;->T(Ljava/lang/Runnable;)V

    sget-object p1, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    invoke-virtual {p1, p0}, Lio/sentry/android/core/e0;->b(Lio/sentry/android/core/b0;)V

    return-void
.end method

.method public static J(Landroid/content/Context;Lio/sentry/v0;)Landroid/net/ConnectivityManager;
    .locals 3

    sget-object v0, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    sget-object p0, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;

    return-object p0

    :cond_0
    sget-object v0, Lio/sentry/android/core/internal/util/c;->L:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;

    if-eqz v1, :cond_1

    sget-object p0, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_1
    :try_start_1
    const-string v1, "connectivity"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    sput-object p0, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;

    sget-object p0, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;

    if-nez p0, :cond_2

    sget-object p0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "ConnectivityManager is null and cannot check network status"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, p0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    sget-object p0, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-object p0

    :goto_0
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
.end method

.method public static b(Landroid/content/Context;Lio/sentry/v0;Lio/sentry/android/core/k0;Landroid/net/ConnectivityManager$NetworkCallback;)Z
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lwb3/f;->F(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string p2, "No permission (ACCESS_NETWORK_STATE) to check network status."

    const/4 p3, 0x0

    new-array v0, p3, [Ljava/lang/Object;

    invoke-interface {p1, p0, p2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return p3

    :cond_0
    sget-object p0, Lio/sentry/android/core/internal/util/c;->N:Lio/sentry/util/a;

    invoke-virtual {p0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p0

    :try_start_0
    sget-object p1, Lio/sentry/android/core/internal/util/c;->O:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lio/sentry/s;->close()V

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public static s(Landroid/net/NetworkCapabilities;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "ethernet"

    return-object p0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "wifi"

    return-object p0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "cellular"

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final G()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->z:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/sentry/android/core/internal/util/c;->J:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1d4c0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/util/c;->b0(Landroid/net/NetworkCapabilities;)V

    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/core/internal/util/c;->x()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final K0(Lio/sentry/o0;)Z
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/internal/util/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    invoke-virtual {p0}, Lio/sentry/android/core/internal/util/c;->h()V

    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final T(Ljava/lang/Runnable;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    invoke-interface {v1, p1}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "AndroidConnectionStatusProvider submit failed"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final W0(Lio/sentry/o0;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/internal/util/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final a0(Z)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->E:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;

    if-eqz p1, :cond_2

    iget-object v2, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    iget-object v3, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    invoke-static {v2, v3}, Lio/sentry/android/core/internal/util/c;->J(Landroid/content/Context;Lio/sentry/v0;)Landroid/net/ConnectivityManager;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    :try_start_1
    invoke-virtual {v2, p1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_2
    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v4, "unregisterNetworkCallback failed"

    invoke-interface {v3, v2, v4, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    iput-object v1, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    iput-object v1, p0, Lio/sentry/android/core/internal/util/c;->I:Landroid/net/Network;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lio/sentry/android/core/internal/util/c;->J:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network callback unregistered"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final b0(Landroid/net/NetworkCapabilities;)V
    .locals 6

    const-string v0, "Cache updated - Status: "

    iget-object v1, p0, Lio/sentry/android/core/internal/util/c;->F:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iput-object p1, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    invoke-static {p1}, Lwb3/f;->F(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "No permission (ACCESS_NETWORK_STATE) to check network status."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v4, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object v3, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->z:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lio/sentry/android/core/internal/util/c;->J:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/s;->close()V

    return-void

    :cond_1
    :try_start_1
    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->y:Lio/sentry/android/core/k0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    iget-object v4, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    invoke-static {p1, v4}, Lio/sentry/android/core/internal/util/c;->J(Landroid/content/Context;Lio/sentry/v0;)Landroid/net/ConnectivityManager;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v4}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v3

    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    goto :goto_1

    :cond_3
    iput-object v3, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    :goto_1
    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->z:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lio/sentry/android/core/internal/util/c;->J:J

    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/android/core/internal/util/c;->m()Lio/sentry/n0;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", Type: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/sentry/android/core/internal/util/c;->x()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v4, v0, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    :try_start_2
    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v4, "Failed to update connection status cache"

    invoke-interface {v0, v2, v4, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v3, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    iget-object p1, p0, Lio/sentry/android/core/internal/util/c;->z:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lio/sentry/android/core/internal/util/c;->J:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    invoke-virtual {v1}, Lio/sentry/s;->close()V

    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {v1}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
.end method

.method public final close()V
    .locals 2

    new-instance v0, Lio/sentry/c7;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/util/c;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h()V
    .locals 6

    invoke-static {}, Lio/sentry/android/core/j0;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :cond_2
    :try_start_1
    new-instance v1, Lio/sentry/android/core/internal/util/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/sentry/android/core/internal/util/b;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    iget-object v3, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    iget-object v4, p0, Lio/sentry/android/core/internal/util/c;->y:Lio/sentry/android/core/k0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, Lio/sentry/android/core/internal/util/c;->J(Landroid/content/Context;Lio/sentry/v0;)Landroid/net/ConnectivityManager;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lwb3/f;->F(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "No permission (ACCESS_NETWORK_STATE) to check network status."

    new-array v4, v5, [Ljava/lang/Object;

    invoke-interface {v3, v1, v2, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_4
    :try_start_2
    invoke-virtual {v4, v1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iput-object v1, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;

    iget-object v1, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Network callback registered successfully"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :catchall_1
    move-exception v1

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v4, "registerDefaultNetworkCallback failed"

    invoke-interface {v3, v2, v4, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v1, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Failed to register network callback"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_3
    :try_start_4
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/sentry/android/core/internal/util/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/sentry/android/core/internal/util/a;-><init>(Lio/sentry/android/core/internal/util/c;I)V

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/util/c;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->G:Lio/sentry/android/core/internal/util/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/sentry/android/core/internal/util/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/sentry/android/core/internal/util/a;-><init>(Lio/sentry/android/core/internal/util/c;I)V

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/util/c;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l()Lio/sentry/n0;
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->z:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/sentry/android/core/internal/util/c;->J:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1d4c0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/util/c;->b0(Landroid/net/NetworkCapabilities;)V

    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/core/internal/util/c;->m()Lio/sentry/n0;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lio/sentry/n0;
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    iget-object v3, p0, Lio/sentry/android/core/internal/util/c;->y:Lio/sentry/android/core/k0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v2, :cond_2

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lio/sentry/android/core/internal/util/c;->P:[I

    array-length v3, v2

    :goto_0
    if-ge v1, v3, :cond_2

    aget v4, v2, v1

    invoke-virtual {v0, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v0, Lio/sentry/n0;->CONNECTED:Lio/sentry/n0;

    return-object v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v0, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;

    return-object v0

    :cond_3
    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    iget-object v2, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    invoke-static {v0, v2}, Lio/sentry/android/core/internal/util/c;->J(Landroid/content/Context;Lio/sentry/v0;)Landroid/net/ConnectivityManager;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v2, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    iget-object v3, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    invoke-static {v2}, Lwb3/f;->F(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "No permission (ACCESS_NETWORK_STATE) to check network status."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v3, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lio/sentry/n0;->NO_PERMISSION:Lio/sentry/n0;

    return-object v0

    :cond_4
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-nez v0, :cond_5

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "NetworkInfo is null, there\'s no active network."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v3, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lio/sentry/n0;->CONNECTED:Lio/sentry/n0;

    return-object v0

    :cond_6
    sget-object v0, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :goto_2
    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Could not retrieve Connection Status"

    invoke-interface {v3, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lio/sentry/n0;->UNKNOWN:Lio/sentry/n0;

    return-object v0

    :cond_7
    sget-object v0, Lio/sentry/n0;->UNKNOWN:Lio/sentry/n0;

    return-object v0
.end method

.method public final x()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->H:Landroid/net/NetworkCapabilities;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/sentry/android/core/internal/util/c;->s(Landroid/net/NetworkCapabilities;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/internal/util/c;->w:Landroid/content/Context;

    iget-object v1, p0, Lio/sentry/android/core/internal/util/c;->x:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/android/core/internal/util/c;->y:Lio/sentry/android/core/k0;

    invoke-static {v0, v1}, Lio/sentry/android/core/internal/util/c;->J(Landroid/content/Context;Lio/sentry/v0;)Landroid/net/ConnectivityManager;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lwb3/f;->F(Landroid/content/Context;)Z

    move-result v0

    const/4 v5, 0x0

    if-nez v0, :cond_2

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "No permission (ACCESS_NETWORK_STATE) to check network status."

    new-array v3, v5, [Ljava/lang/Object;

    invoke-interface {v1, v0, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    :cond_2
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "Network is null and cannot check network status"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-interface {v1, v0, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "NetworkCapabilities is null and cannot check network type"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-interface {v1, v0, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    :cond_4
    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v3

    invoke-virtual {v0, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v2, :cond_5

    const-string v0, "ethernet"

    return-object v0

    :cond_5
    if-eqz v3, :cond_6

    const-string v0, "wifi"

    return-object v0

    :cond_6
    if-eqz v0, :cond_7

    const-string v0, "cellular"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :cond_7
    :goto_0
    return-object v4

    :goto_1
    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to retrieve network info"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v4
.end method
