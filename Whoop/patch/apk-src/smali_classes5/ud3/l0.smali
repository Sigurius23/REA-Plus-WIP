.class public final Lud3/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/i;


# static fields
.field public static final G:Ljava/util/List;

.field public static final H:Ljava/util/List;


# instance fields
.field public final A:I

.field public final B:I

.field public final C:J

.field public final D:Lzd3/t;

.field public final E:Lyd3/d;

.field public final F:Lud3/q;

.field public final a:Lud3/u;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Lud3/z;

.field public final e:Z

.field public final f:Z

.field public final g:Lud3/c;

.field public final h:Z

.field public final i:Z

.field public final j:Lud3/t;

.field public final k:Lud3/g;

.field public final l:Lud3/v;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Lud3/c;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljavax/net/ssl/HostnameVerifier;

.field public final u:Lud3/l;

.field public final v:Landroidx/room/c1;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lud3/m0;->F:Lud3/m0;

    sget-object v1, Lud3/m0;->z:Lud3/m0;

    filled-new-array {v0, v1}, [Lud3/m0;

    move-result-object v0

    invoke-static {v0}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lud3/l0;->G:Ljava/util/List;

    sget-object v0, Lud3/r;->e:Lud3/r;

    sget-object v1, Lud3/r;->f:Lud3/r;

    filled-new-array {v0, v1}, [Lud3/r;

    move-result-object v0

    invoke-static {v0}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lud3/l0;->H:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 135
    new-instance v0, Lud3/k0;

    invoke-direct {v0}, Lud3/k0;-><init>()V

    invoke-direct {p0, v0}, Lud3/l0;-><init>(Lud3/k0;)V

    return-void
.end method

.method public constructor <init>(Lud3/k0;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lud3/k0;->a:Lud3/u;

    .line 3
    iput-object v0, p0, Lud3/l0;->a:Lud3/u;

    .line 4
    iget-object v0, p1, Lud3/k0;->c:Ljava/util/ArrayList;

    .line 5
    invoke-static {v0}, Lwd3/h;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lud3/l0;->b:Ljava/util/List;

    .line 6
    iget-object v0, p1, Lud3/k0;->d:Ljava/util/ArrayList;

    .line 7
    invoke-static {v0}, Lwd3/h;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lud3/l0;->c:Ljava/util/List;

    .line 8
    iget-object v0, p1, Lud3/k0;->e:Lud3/z;

    .line 9
    iput-object v0, p0, Lud3/l0;->d:Lud3/z;

    .line 10
    iget-boolean v0, p1, Lud3/k0;->f:Z

    .line 11
    iput-boolean v0, p0, Lud3/l0;->e:Z

    .line 12
    iget-boolean v0, p1, Lud3/k0;->g:Z

    .line 13
    iput-boolean v0, p0, Lud3/l0;->f:Z

    .line 14
    iget-object v0, p1, Lud3/k0;->h:Lud3/c;

    .line 15
    iput-object v0, p0, Lud3/l0;->g:Lud3/c;

    .line 16
    iget-boolean v0, p1, Lud3/k0;->i:Z

    .line 17
    iput-boolean v0, p0, Lud3/l0;->h:Z

    .line 18
    iget-boolean v0, p1, Lud3/k0;->j:Z

    .line 19
    iput-boolean v0, p0, Lud3/l0;->i:Z

    .line 20
    iget-object v0, p1, Lud3/k0;->k:Lud3/t;

    .line 21
    iput-object v0, p0, Lud3/l0;->j:Lud3/t;

    .line 22
    iget-object v0, p1, Lud3/k0;->l:Lud3/g;

    .line 23
    iput-object v0, p0, Lud3/l0;->k:Lud3/g;

    .line 24
    iget-object v0, p1, Lud3/k0;->m:Lud3/v;

    .line 25
    iput-object v0, p0, Lud3/l0;->l:Lud3/v;

    .line 26
    iget-object v0, p1, Lud3/k0;->n:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    .line 27
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lhe3/a;->a:Lhe3/a;

    .line 28
    :cond_0
    iput-object v0, p0, Lud3/l0;->m:Ljava/net/ProxySelector;

    .line 29
    iget-object v0, p1, Lud3/k0;->o:Lud3/c;

    .line 30
    iput-object v0, p0, Lud3/l0;->n:Lud3/c;

    .line 31
    iget-object v0, p1, Lud3/k0;->p:Ljavax/net/SocketFactory;

    .line 32
    iput-object v0, p0, Lud3/l0;->o:Ljavax/net/SocketFactory;

    .line 33
    iget-object v0, p1, Lud3/k0;->s:Ljava/util/List;

    .line 34
    iput-object v0, p0, Lud3/l0;->r:Ljava/util/List;

    .line 35
    iget-object v1, p1, Lud3/k0;->t:Ljava/util/List;

    .line 36
    iput-object v1, p0, Lud3/l0;->s:Ljava/util/List;

    .line 37
    iget-object v1, p1, Lud3/k0;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 38
    iput-object v1, p0, Lud3/l0;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 39
    iget v1, p1, Lud3/k0;->x:I

    .line 40
    iput v1, p0, Lud3/l0;->w:I

    .line 41
    iget v1, p1, Lud3/k0;->y:I

    .line 42
    iput v1, p0, Lud3/l0;->x:I

    .line 43
    iget v1, p1, Lud3/k0;->z:I

    .line 44
    iput v1, p0, Lud3/l0;->y:I

    .line 45
    iget v1, p1, Lud3/k0;->A:I

    .line 46
    iput v1, p0, Lud3/l0;->z:I

    .line 47
    iget v1, p1, Lud3/k0;->B:I

    .line 48
    iput v1, p0, Lud3/l0;->A:I

    .line 49
    iget v1, p1, Lud3/k0;->C:I

    .line 50
    iput v1, p0, Lud3/l0;->B:I

    .line 51
    iget-wide v1, p1, Lud3/k0;->D:J

    .line 52
    iput-wide v1, p0, Lud3/l0;->C:J

    .line 53
    iget-object v1, p1, Lud3/k0;->E:Lzd3/t;

    if-nez v1, :cond_1

    .line 54
    new-instance v1, Lzd3/t;

    invoke-direct {v1}, Lzd3/t;-><init>()V

    :cond_1
    iput-object v1, p0, Lud3/l0;->D:Lzd3/t;

    .line 55
    iget-object v1, p1, Lud3/k0;->F:Lyd3/d;

    if-nez v1, :cond_2

    .line 56
    sget-object v1, Lyd3/d;->l:Lyd3/d;

    :cond_2
    iput-object v1, p0, Lud3/l0;->E:Lyd3/d;

    .line 57
    iget-object v1, p1, Lud3/k0;->b:Lud3/q;

    if-nez v1, :cond_3

    .line 58
    new-instance v1, Lud3/q;

    invoke-direct {v1}, Lud3/q;-><init>()V

    .line 59
    iput-object v1, p1, Lud3/k0;->b:Lud3/q;

    .line 60
    :cond_3
    iput-object v1, p0, Lud3/l0;->F:Lud3/q;

    .line 61
    check-cast v0, Ljava/lang/Iterable;

    .line 62
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_2

    .line 63
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/r;

    .line 64
    iget-boolean v1, v1, Lud3/r;->a:Z

    if-eqz v1, :cond_5

    .line 65
    iget-object v0, p1, Lud3/k0;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_7

    .line 66
    iput-object v0, p0, Lud3/l0;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 67
    iget-object v0, p1, Lud3/k0;->w:Landroidx/room/c1;

    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v0, p0, Lud3/l0;->v:Landroidx/room/c1;

    .line 69
    iget-object v1, p1, Lud3/k0;->r:Ljavax/net/ssl/X509TrustManager;

    .line 70
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v1, p0, Lud3/l0;->q:Ljavax/net/ssl/X509TrustManager;

    .line 71
    iget-object p1, p1, Lud3/k0;->v:Lud3/l;

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    iget-object v1, p1, Lud3/l;->b:Landroidx/room/c1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    .line 74
    :cond_6
    new-instance v1, Lud3/l;

    iget-object p1, p1, Lud3/l;->a:Ljava/util/Set;

    invoke-direct {v1, p1, v0}, Lud3/l;-><init>(Ljava/util/Set;Landroidx/room/c1;)V

    move-object p1, v1

    .line 75
    :goto_0
    iput-object p1, p0, Lud3/l0;->u:Lud3/l;

    goto/16 :goto_3

    .line 76
    :cond_7
    sget-object v0, Lfe3/e;->a:Lfe3/e;

    .line 77
    sget-object v0, Lfe3/e;->a:Lfe3/e;

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    .line 81
    invoke-virtual {v0, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 82
    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 83
    array-length v1, v0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_9

    const/4 v1, 0x0

    aget-object v4, v0, v1

    instance-of v5, v4, Ljavax/net/ssl/X509TrustManager;

    if-eqz v5, :cond_9

    .line 84
    check-cast v4, Ljavax/net/ssl/X509TrustManager;

    .line 85
    iput-object v4, p0, Lud3/l0;->q:Ljavax/net/ssl/X509TrustManager;

    .line 86
    sget-object v0, Lfe3/e;->a:Lfe3/e;

    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    :try_start_0
    invoke-virtual {v0}, Lfe3/e;->l()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    .line 89
    new-array v3, v3, [Ljavax/net/ssl/TrustManager;

    aput-object v4, v3, v1

    invoke-virtual {v0, v2, v3, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 90
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    const-string v1, "getSocketFactory(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    iput-object v0, p0, Lud3/l0;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 92
    sget-object v0, Lfe3/e;->a:Lfe3/e;

    .line 93
    invoke-virtual {v0, v4}, Lfe3/e;->c(Ljavax/net/ssl/X509TrustManager;)Landroidx/room/c1;

    move-result-object v0

    .line 94
    iput-object v0, p0, Lud3/l0;->v:Landroidx/room/c1;

    .line 95
    iget-object p1, p1, Lud3/k0;->v:Lud3/l;

    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    iget-object v1, p1, Lud3/l;->b:Landroidx/room/c1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    .line 98
    :cond_8
    new-instance v1, Lud3/l;

    iget-object p1, p1, Lud3/l;->a:Ljava/util/Set;

    invoke-direct {v1, p1, v0}, Lud3/l;-><init>(Ljava/util/Set;Landroidx/room/c1;)V

    move-object p1, v1

    .line 99
    :goto_1
    iput-object p1, p0, Lud3/l0;->u:Lud3/l;

    goto :goto_3

    :catch_0
    move-exception p1

    .line 100
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No System TLS: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 101
    :cond_9
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Unexpected default trust managers: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 102
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :cond_a
    :goto_2
    iput-object v2, p0, Lud3/l0;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 104
    iput-object v2, p0, Lud3/l0;->v:Landroidx/room/c1;

    .line 105
    iput-object v2, p0, Lud3/l0;->q:Ljavax/net/ssl/X509TrustManager;

    .line 106
    sget-object p1, Lud3/l;->c:Lud3/l;

    iput-object p1, p0, Lud3/l0;->u:Lud3/l;

    .line 107
    :goto_3
    iget-object p1, p0, Lud3/l0;->q:Ljavax/net/ssl/X509TrustManager;

    iget-object v0, p0, Lud3/l0;->v:Landroidx/room/c1;

    iget-object v1, p0, Lud3/l0;->p:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v3, p0, Lud3/l0;->c:Ljava/util/List;

    iget-object v4, p0, Lud3/l0;->b:Ljava/util/List;

    const-string v5, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_16

    .line 108
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    .line 109
    iget-object v2, p0, Lud3/l0;->r:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .line 110
    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_b

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_4

    .line 111
    :cond_b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lud3/r;

    .line 112
    iget-boolean v3, v3, Lud3/r;->a:Z

    if-eqz v3, :cond_c

    if-eqz v1, :cond_f

    if-eqz v0, :cond_e

    if-eqz p1, :cond_d

    goto :goto_5

    .line 113
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 114
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 115
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 116
    :cond_10
    :goto_4
    const-string v2, "Check failed."

    if-nez v1, :cond_14

    if-nez v0, :cond_13

    if-nez p1, :cond_12

    .line 117
    iget-object p1, p0, Lud3/l0;->u:Lud3/l;

    sget-object v0, Lud3/l;->c:Lud3/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    :goto_5
    return-void

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 118
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 119
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 121
    :cond_15
    const-string p1, "Null network interceptor: "

    .line 122
    invoke-static {p1, v3}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    .line 123
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_16
    const-string p1, "Null interceptor: "

    .line 125
    invoke-static {p1, v4}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    .line 126
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lud3/k0;
    .locals 3

    new-instance v0, Lud3/k0;

    invoke-direct {v0}, Lud3/k0;-><init>()V

    iget-object v1, p0, Lud3/l0;->a:Lud3/u;

    iput-object v1, v0, Lud3/k0;->a:Lud3/u;

    iget-object v1, p0, Lud3/l0;->F:Lud3/q;

    iput-object v1, v0, Lud3/k0;->b:Lud3/q;

    iget-object v1, p0, Lud3/l0;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, v0, Lud3/k0;->c:Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    iget-object v1, p0, Lud3/l0;->c:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, v0, Lud3/k0;->d:Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    iget-object v1, p0, Lud3/l0;->d:Lud3/z;

    iput-object v1, v0, Lud3/k0;->e:Lud3/z;

    iget-boolean v1, p0, Lud3/l0;->e:Z

    iput-boolean v1, v0, Lud3/k0;->f:Z

    iget-boolean v1, p0, Lud3/l0;->f:Z

    iput-boolean v1, v0, Lud3/k0;->g:Z

    iget-object v1, p0, Lud3/l0;->g:Lud3/c;

    iput-object v1, v0, Lud3/k0;->h:Lud3/c;

    iget-boolean v1, p0, Lud3/l0;->h:Z

    iput-boolean v1, v0, Lud3/k0;->i:Z

    iget-boolean v1, p0, Lud3/l0;->i:Z

    iput-boolean v1, v0, Lud3/k0;->j:Z

    iget-object v1, p0, Lud3/l0;->j:Lud3/t;

    iput-object v1, v0, Lud3/k0;->k:Lud3/t;

    iget-object v1, p0, Lud3/l0;->k:Lud3/g;

    iput-object v1, v0, Lud3/k0;->l:Lud3/g;

    iget-object v1, p0, Lud3/l0;->l:Lud3/v;

    iput-object v1, v0, Lud3/k0;->m:Lud3/v;

    iget-object v1, p0, Lud3/l0;->m:Ljava/net/ProxySelector;

    iput-object v1, v0, Lud3/k0;->n:Ljava/net/ProxySelector;

    iget-object v1, p0, Lud3/l0;->n:Lud3/c;

    iput-object v1, v0, Lud3/k0;->o:Lud3/c;

    iget-object v1, p0, Lud3/l0;->o:Ljavax/net/SocketFactory;

    iput-object v1, v0, Lud3/k0;->p:Ljavax/net/SocketFactory;

    iget-object v1, p0, Lud3/l0;->p:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v1, v0, Lud3/k0;->q:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, p0, Lud3/l0;->q:Ljavax/net/ssl/X509TrustManager;

    iput-object v1, v0, Lud3/k0;->r:Ljavax/net/ssl/X509TrustManager;

    iget-object v1, p0, Lud3/l0;->r:Ljava/util/List;

    iput-object v1, v0, Lud3/k0;->s:Ljava/util/List;

    iget-object v1, p0, Lud3/l0;->s:Ljava/util/List;

    iput-object v1, v0, Lud3/k0;->t:Ljava/util/List;

    iget-object v1, p0, Lud3/l0;->t:Ljavax/net/ssl/HostnameVerifier;

    iput-object v1, v0, Lud3/k0;->u:Ljavax/net/ssl/HostnameVerifier;

    iget-object v1, p0, Lud3/l0;->u:Lud3/l;

    iput-object v1, v0, Lud3/k0;->v:Lud3/l;

    iget-object v1, p0, Lud3/l0;->v:Landroidx/room/c1;

    iput-object v1, v0, Lud3/k0;->w:Landroidx/room/c1;

    iget v1, p0, Lud3/l0;->w:I

    iput v1, v0, Lud3/k0;->x:I

    iget v1, p0, Lud3/l0;->x:I

    iput v1, v0, Lud3/k0;->y:I

    iget v1, p0, Lud3/l0;->y:I

    iput v1, v0, Lud3/k0;->z:I

    iget v1, p0, Lud3/l0;->z:I

    iput v1, v0, Lud3/k0;->A:I

    iget v1, p0, Lud3/l0;->A:I

    iput v1, v0, Lud3/k0;->B:I

    iget v1, p0, Lud3/l0;->B:I

    iput v1, v0, Lud3/k0;->C:I

    iget-wide v1, p0, Lud3/l0;->C:J

    iput-wide v1, v0, Lud3/k0;->D:J

    iget-object v1, p0, Lud3/l0;->D:Lzd3/t;

    iput-object v1, v0, Lud3/k0;->E:Lzd3/t;

    iget-object v1, p0, Lud3/l0;->E:Lyd3/d;

    iput-object v1, v0, Lud3/k0;->F:Lyd3/d;

    return-object v0
.end method

.method public final b(Lud3/o0;)Lzd3/o;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzd3/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lzd3/o;-><init>(Lud3/l0;Lud3/o0;Z)V

    return-object v0
.end method

.method public final c(Lud3/o0;Lud3/f1;)Lle3/g;
    .locals 12

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lle3/g;

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    iget v0, p0, Lud3/l0;->A:I

    int-to-long v6, v0

    iget v0, p0, Lud3/l0;->B:I

    int-to-long v10, v0

    iget-object v2, p0, Lud3/l0;->E:Lyd3/d;

    iget-wide v8, p0, Lud3/l0;->C:J

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v11}, Lle3/g;-><init>(Lyd3/d;Lud3/o0;Lud3/f1;Ljava/util/Random;JJJ)V

    invoke-virtual {v1, p0}, Lle3/g;->c(Lud3/l0;)V

    return-object v1
.end method
