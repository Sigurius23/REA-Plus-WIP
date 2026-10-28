.class Lcom/mapbox/common/module/okhttp/LazyClient;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final DEFAULT_CONNECT_TIMEOUT_SEC:J = 0x1eL

.field private static final DEFAULT_READ_TIMEOUT_SEC:J = 0x3cL

.field private static final connectionPool:Lud3/q;


# instance fields
.field private volatile client:Lud3/l0;

.field private final disableHttp2:Z

.field private maxRequestsPerHost:B

.field private final socketFactory:Ljavax/net/SocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lud3/q;

    invoke-direct {v0}, Lud3/q;-><init>()V

    sput-object v0, Lcom/mapbox/common/module/okhttp/LazyClient;->connectionPool:Lud3/q;

    return-void
.end method

.method public constructor <init>(Ljavax/net/SocketFactory;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->maxRequestsPerHost:B

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->socketFactory:Ljavax/net/SocketFactory;

    iput-boolean p2, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->disableHttp2:Z

    return-void
.end method

.method private static buildOkHttpClient(Ljavax/net/SocketFactory;Z)Lud3/l0;
    .locals 4

    new-instance v0, Lud3/k0;

    invoke-direct {v0}, Lud3/k0;-><init>()V

    sget-object v1, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->FACTORY:Lud3/z;

    const-string v2, "eventListenerFactory"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lud3/k0;->e:Lud3/z;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3, v1}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    sget-object v1, Lcom/mapbox/common/module/okhttp/LazyClient;->connectionPool:Lud3/q;

    const-string v2, "connectionPool"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lud3/k0;->b:Lud3/q;

    if-eqz p0, :cond_2

    instance-of v1, p0, Ljavax/net/ssl/SSLSocketFactory;

    if-nez v1, :cond_1

    iget-object v1, v0, Lud3/k0;->p:Ljavax/net/SocketFactory;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, v0, Lud3/k0;->E:Lzd3/t;

    :cond_0
    iput-object p0, v0, Lud3/k0;->p:Ljavax/net/SocketFactory;

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "socketFactory instanceof SSLSocketFactory"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    sget-object p0, Lud3/m0;->z:Lud3/m0;

    filled-new-array {p0}, [Lud3/m0;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Lud3/k0;->d(Ljava/util/List;)V

    :cond_3
    new-instance p0, Lud3/l0;

    invoke-direct {p0, v0}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object p0
.end method


# virtual methods
.method public get()Lud3/l0;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->client:Lud3/l0;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->client:Lud3/l0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->socketFactory:Ljavax/net/SocketFactory;

    iget-boolean v1, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->disableHttp2:Z

    invoke-static {v0, v1}, Lcom/mapbox/common/module/okhttp/LazyClient;->buildOkHttpClient(Ljavax/net/SocketFactory;Z)Lud3/l0;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->client:Lud3/l0;

    iget-byte v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->maxRequestsPerHost:B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->client:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;

    iget-byte v1, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->maxRequestsPerHost:B

    invoke-virtual {v0, v1}, Lud3/u;->e(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->client:Lud3/l0;

    return-object v0
.end method

.method public declared-synchronized setMaxRequestsPerHost(B)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-byte p1, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->maxRequestsPerHost:B

    if-eqz p1, :cond_1

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/LazyClient;->client:Lud3/l0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v0, p1}, Lud3/u;->e(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
