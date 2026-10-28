.class public final Llive/hms/video/factories/OkHttpFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u0006\u00a8\u0006\u001e"
    }
    d2 = {
        "Llive/hms/video/factories/OkHttpFactory;",
        "",
        "<init>",
        "()V",
        "Lud3/l0;",
        "makeClient",
        "()Lud3/l0;",
        "",
        "uri",
        "Lud3/f1;",
        "listener",
        "Lud3/e1;",
        "makeWebSocket",
        "(Ljava/lang/String;Lud3/f1;)Lud3/e1;",
        "",
        "PING_INTERVAL",
        "J",
        "CONNECT_TIMEOUT",
        "READ_TIMEOUT",
        "WRITE_TIMEOUT",
        "Llive/hms/video/factories/HappyEyeballsDns;",
        "happyEyeballsDns",
        "Llive/hms/video/factories/HappyEyeballsDns;",
        "",
        "Ljavax/net/ssl/TrustManager;",
        "trustAllCerts",
        "[Ljavax/net/ssl/TrustManager;",
        "client",
        "Lud3/l0;",
        "getClient",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CONNECT_TIMEOUT:J = 0x5L

.field public static final INSTANCE:Llive/hms/video/factories/OkHttpFactory;

.field private static final PING_INTERVAL:J = 0xcL

.field private static final READ_TIMEOUT:J = 0xbL

.field private static final WRITE_TIMEOUT:J = 0xbL

.field private static final client:Lud3/l0;

.field private static final happyEyeballsDns:Llive/hms/video/factories/HappyEyeballsDns;

.field private static final trustAllCerts:[Ljavax/net/ssl/TrustManager;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Llive/hms/video/factories/OkHttpFactory;

    invoke-direct {v0}, Llive/hms/video/factories/OkHttpFactory;-><init>()V

    sput-object v0, Llive/hms/video/factories/OkHttpFactory;->INSTANCE:Llive/hms/video/factories/OkHttpFactory;

    new-instance v1, Llive/hms/video/factories/HappyEyeballsDns;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Llive/hms/video/factories/HappyEyeballsDns;-><init>(Lud3/v;Lkotlin/jvm/functions/Function3;Lc93/a;Ljava/util/concurrent/ScheduledExecutorService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Llive/hms/video/factories/OkHttpFactory;->happyEyeballsDns:Llive/hms/video/factories/HappyEyeballsDns;

    new-instance v1, Llive/hms/video/factories/OkHttpFactory$trustAllCerts$1;

    invoke-direct {v1}, Llive/hms/video/factories/OkHttpFactory$trustAllCerts$1;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [Ljavax/net/ssl/TrustManager;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sput-object v2, Llive/hms/video/factories/OkHttpFactory;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    invoke-direct {v0}, Llive/hms/video/factories/OkHttpFactory;->makeClient()Lud3/l0;

    move-result-object v0

    sput-object v0, Llive/hms/video/factories/OkHttpFactory;->client:Lud3/l0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/factories/OkHttpFactory;->makeClient$lambda$0(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result p0

    return p0
.end method

.method private final makeClient()Lud3/l0;
    .locals 8

    const-string v0, "SSL"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    sget-object v1, Llive/hms/video/factories/OkHttpFactory;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    new-instance v2, Lud3/k0;

    invoke-direct {v2}, Lud3/k0;-><init>()V

    const/4 v4, 0x1

    iput-boolean v4, v2, Lud3/k0;->f:Z

    sget-object v5, Llive/hms/video/factories/OkHttpFactory;->happyEyeballsDns:Llive/hms/video/factories/HappyEyeballsDns;

    const-string v6, "dns"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v2, Lud3/k0;->m:Lud3/v;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    iput-object v3, v2, Lud3/k0;->E:Lzd3/t;

    :cond_0
    iput-object v5, v2, Lud3/k0;->m:Lud3/v;

    invoke-virtual {v5}, Llive/hms/video/factories/HappyEyeballsDns;->getPortHintListener()Lud3/a0;

    move-result-object v5

    const-string v6, "eventListener"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lwd3/h;->a:Ljava/util/TimeZone;

    new-instance v6, Lvd1/c;

    invoke-direct {v6, v5, v4}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    iput-object v6, v2, Lud3/k0;->e:Lud3/z;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0xc

    invoke-virtual {v2, v6, v7, v5}, Lud3/k0;->c(JLjava/util/concurrent/TimeUnit;)V

    iput-boolean v4, v2, Lud3/k0;->i:Z

    iput-boolean v4, v2, Lud3/k0;->j:Z

    const-wide/16 v6, 0x5

    invoke-virtual {v2, v6, v7, v5}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v6, 0xb

    invoke-virtual {v2, v6, v7, v5}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v2, v6, v7, v5}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    const-string v4, "getSocketFactory(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    aget-object v1, v1, v4

    const-string v4, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/X509TrustManager;

    const-string v4, "trustManager"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v2, Lud3/k0;->q:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v2, Lud3/k0;->r:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    iput-object v3, v2, Lud3/k0;->E:Lzd3/t;

    :cond_2
    iput-object v0, v2, Lud3/k0;->q:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {v0, v1}, Lfe3/e;->c(Ljavax/net/ssl/X509TrustManager;)Landroidx/room/c1;

    move-result-object v0

    iput-object v0, v2, Lud3/k0;->w:Landroidx/room/c1;

    iput-object v1, v2, Lud3/k0;->r:Ljavax/net/ssl/X509TrustManager;

    new-instance v0, Llive/hms/video/factories/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, v2, Lud3/k0;->u:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iput-object v3, v2, Lud3/k0;->E:Lzd3/t;

    :cond_3
    iput-object v0, v2, Lud3/k0;->u:Ljavax/net/ssl/HostnameVerifier;

    new-instance v0, Lud3/l0;

    invoke-direct {v0, v2}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object v0
.end method

.method private static final makeClient$lambda$0(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final getClient()Lud3/l0;
    .locals 1

    sget-object v0, Llive/hms/video/factories/OkHttpFactory;->client:Lud3/l0;

    return-object v0
.end method

.method public final makeWebSocket(Ljava/lang/String;Lud3/f1;)Lud3/e1;
    .locals 2

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Lud3/n0;-><init>()V

    invoke-virtual {v0, p1}, Lud3/n0;->f(Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    sget-object v0, Llive/hms/video/factories/OkHttpFactory;->happyEyeballsDns:Llive/hms/video/factories/HappyEyeballsDns;

    iget-object v1, p1, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v0, v1}, Llive/hms/video/factories/HappyEyeballsDns;->notePort$lib_release(Lud3/e0;)V

    sget-object v0, Llive/hms/video/factories/OkHttpFactory;->client:Lud3/l0;

    invoke-virtual {v0, p1, p2}, Lud3/l0;->c(Lud3/o0;Lud3/f1;)Lle3/g;

    move-result-object p1

    return-object p1
.end method
