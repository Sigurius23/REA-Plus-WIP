.class public final Lio/sentry/hints/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/databinding/d;
.implements Ll8/b;
.implements Lul/a;
.implements Lxg3/i;
.implements Lik/c;
.implements Lvg/g;
.implements Lge3/l;
.implements Lgl/a0;
.implements Ld0/e0;
.implements Lig3/b;
.implements Lio/sentry/metrics/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/hints/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final i(Ljava/util/List;Z)Ljava/lang/String;
    .locals 7

    sget v0, Lcg/x;->c:I

    sget-object v5, Lcg/w;->w:Lcg/w;

    move-object v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    const-string v0, "/"

    const-string v2, ""

    if-eqz p0, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    if-eqz p1, :cond_1

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    const/16 v6, 0x18

    const-string v2, "/"

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    const-string v0, "protocols"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lud3/m0;

    sget-object v3, Lud3/m0;->y:Lud3/m0;

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/m0;

    iget-object v1, v1, Lud3/m0;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p0
.end method

.method public static n(Ljava/util/List;)[B
    .locals 3

    const-string v0, "protocols"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lio/sentry/hints/j;->j(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Lne3/h;->m1(I)V

    invoke-virtual {v0, v1}, Lne3/h;->u1(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-wide v1, v0, Lne3/h;->x:J

    invoke-virtual {v0, v1, v2}, Lne3/h;->b0(J)[B

    move-result-object p0

    return-object p0
.end method

.method public static o(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;)Leb/q;
    .locals 9

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v0, "randomUUID().toString()"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostLifecycleState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Leb/q;

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v8}, Leb/q;-><init>(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v1
.end method

.method public static p(Ljava/lang/String;)Laj/a;
    .locals 2

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;

    const-string v0, "GET"

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/net/URLConnection;->connect()V

    new-instance v0, Laj/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Laj/a;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.google.android.gms.org.conscrypt."

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public b(Lio/sentry/q6;Lcd3/g;)Lio/sentry/metrics/a;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v0, p1, p2}, Lcom/google/crypto/tink/internal/k0;-><init>(Lio/sentry/q6;Lcd3/g;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public create()Ljava/lang/Object;
    .locals 2

    :try_start_0
    new-instance v0, Lbl/h;

    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-direct {v0, v1}, Lbl/h;-><init>(Ljava/security/MessageDigest;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public d(FJ)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public e(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V
    .locals 6

    check-cast p2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    return-void
.end method

.method public f()Ljava/util/Map;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lfg/u;

    new-instance v1, Lqt/e;

    new-instance v2, Lfg/o;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p1, 0x13

    invoke-direct {v1, p1}, Lqt/e;-><init>(I)V

    invoke-direct {v0, v1}, Lfg/u;-><init>(Lqt/e;)V

    return-object v0
.end method

.method public h(Ljavax/net/ssl/SSLSocket;)Lge3/n;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "OpenSSLSocketImpl"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "No OpenSSLSocketImpl superclass of socket of type "

    invoke-static {p1, v1}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    new-instance p1, Lge3/e;

    invoke-direct {p1, v0}, Lge3/e;-><init>(Ljava/lang/Class;)V

    return-object p1
.end method

.method public k()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lgj/d;)Lik/b;
    .locals 10

    iget-object v0, p1, Lgj/d;->a:Lgj/g;

    iget-object v1, v0, Lgj/g;->b:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "amplitude-identify-intercept-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Lgj/g;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    new-instance v4, Ldk/f;

    iget-object v5, v0, Lgj/g;->e:Ljava/lang/String;

    iget-object v1, v0, Lgj/g;->g:Lbu/c;

    invoke-virtual {v1, p1}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object v6

    const-string v1, "sharedPreferences"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/io/File;

    invoke-virtual {v0}, Lgj/g;->a()Ljava/io/File;

    move-result-object v0

    const-string v1, "identify-intercept"

    invoke-direct {v8, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v9, p1, Lgj/d;->n:Lwe/o;

    invoke-direct/range {v4 .. v9}, Ldk/f;-><init>(Ljava/lang/String;Lfk/a;Landroid/content/SharedPreferences;Ljava/io/File;Lwe/o;)V

    return-object v4
.end method

.method public m(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;)Landroidx/databinding/d0;
    .locals 2

    iget v0, p0, Lio/sentry/hints/j;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/databinding/y;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/databinding/y;-><init>(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;I)V

    invoke-virtual {v0}, Landroidx/databinding/y;->d()Landroidx/databinding/d0;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Landroidx/databinding/z;

    invoke-direct {v0, p1, p2, p3}, Landroidx/databinding/z;-><init>(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;)V

    invoke-virtual {v0}, Landroidx/databinding/z;->d()Landroidx/databinding/d0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public q(Landroid/app/Application;)La13/i;
    .locals 1

    sget-object v0, La13/i;->F:La13/i;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    sget-object v0, La13/i;->F:La13/i;

    if-nez v0, :cond_0

    new-instance v0, La13/i;

    invoke-direct {v0}, La13/i;-><init>()V

    sput-object v0, La13/i;->F:La13/i;

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw p1

    :cond_1
    return-object v0
.end method

.method public request(J)V
    .locals 0

    return-void
.end method

.method public u(FJF)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public v(Ljava/util/Map;)V
    .locals 0

    return-void
.end method

.method public w(F)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public x(FF)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
