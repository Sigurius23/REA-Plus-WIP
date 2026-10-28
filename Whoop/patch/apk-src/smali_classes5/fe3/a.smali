.class public final Lfe3/a;
.super Lfe3/e;
.source "SourceFile"

# interfaces
.implements Lfe3/d;


# static fields
.field public static final e:Z


# instance fields
.field public c:Landroid/content/Context;

.field public final d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lfe3/a;->e:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lge3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lge3/m;

    sget-object v2, Lge3/e;->e:Lio/sentry/hints/j;

    invoke-direct {v1, v2}, Lge3/m;-><init>(Lge3/l;)V

    new-instance v2, Lge3/m;

    sget-object v3, Lge3/k;->a:Lge3/i;

    invoke-direct {v2, v3}, Lge3/m;-><init>(Lge3/l;)V

    new-instance v3, Lge3/m;

    sget-object v4, Lge3/h;->a:Lge3/f;

    invoke-direct {v3, v4}, Lge3/m;-><init>(Lge3/l;)V

    const/4 v4, 0x4

    new-array v4, v4, [Lge3/n;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lge3/n;

    invoke-interface {v3}, Lge3/n;->isSupported()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iput-object v1, p0, Lfe3/a;->d:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lfe3/a;->c:Landroid/content/Context;

    return-object v0
.end method

.method public final b(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lfe3/a;->c:Landroid/content/Context;

    return-void
.end method

.method public final c(Ljavax/net/ssl/X509TrustManager;)Landroidx/room/c1;
    .locals 2

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/net/http/X509TrustManagerExtensions;

    invoke-direct {v1, p1}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    new-instance v0, Lge3/b;

    invoke-direct {v0, p1, v1}, Lge3/b;-><init>(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V

    :cond_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-super {p0, p1}, Lfe3/e;->c(Ljavax/net/ssl/X509TrustManager;)Landroidx/room/c1;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljavax/net/ssl/X509TrustManager;)Lje3/d;
    .locals 1

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildTrustRootIndex"

    invoke-static {v0}, Landroid/os/StrictMode;->noteSlowCall(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lfe3/e;->d(Ljavax/net/ssl/X509TrustManager;)Lje3/d;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    const-string v0, "protocols"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfe3/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lge3/n;

    invoke-interface {v2, p1}, Lge3/n;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lge3/n;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1, p2, p3}, Lge3/n;->c(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public final g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lfe3/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lge3/n;

    invoke-interface {v3, p1}, Lge3/n;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lge3/n;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1}, Lge3/n;->b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2
.end method

.method public final h()Ljava/lang/Object;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/util/CloseGuard;

    invoke-direct {v0}, Landroid/util/CloseGuard;-><init>()V

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Landroid/util/CloseGuard;->open(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-super {p0}, Lfe3/e;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "hostname"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final j(Ljava/lang/String;ILjava/lang/Throwable;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    const-string v1, "OkHttp"

    if-ne p2, v0, :cond_0

    sget-boolean p2, Lfe3/c;->e:Z

    invoke-static {}, Luf/c0;->U()V

    invoke-static {v1, p1, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_0
    sget-boolean p2, Lfe3/c;->e:Z

    invoke-static {}, Luf/c0;->U()V

    invoke-static {v1, p1, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const-string p2, "null cannot be cast to non-null type android.util.CloseGuard"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/mapbox/maps/l;->d(Ljava/lang/Object;)Landroid/util/CloseGuard;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/CloseGuard;->warnIfOpen()V

    return-void

    :cond_0
    invoke-super {p0, p1, p2}, Lfe3/e;->k(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final l()Ljavax/net/ssl/SSLContext;
    .locals 1

    const-string v0, "newSSLContext"

    invoke-static {v0}, Landroid/os/StrictMode;->noteSlowCall(Ljava/lang/String;)V

    invoke-super {p0}, Lfe3/e;->l()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    return-object v0
.end method
