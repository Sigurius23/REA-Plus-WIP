.class public final Lcom/iterable/iterableapi/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/l2;
.implements Lcom/iterable/iterableapi/f0;


# static fields
.field public static final w:Lcom/iterable/iterableapi/k2;

.field public static volatile x:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/iterable/iterableapi/k2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/iterable/iterableapi/k2;->w:Lcom/iterable/iterableapi/k2;

    return-void
.end method

.method public static final d()Ljava/security/KeyStore;
    .locals 2

    sget-object v0, Lcom/iterable/iterableapi/z;->a:[C

    sget-object v0, Lcom/iterable/iterableapi/z;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/security/KeyStore;

    return-object v0
.end method

.method public static e(Lorg/json/JSONObject;)V
    .locals 5

    const-string v0, "createdAt"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    :goto_0
    invoke-virtual {p0, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p0, "OnlineRequestProcessor"

    const-string v0, "Could not add createdAt timestamp to json object"

    invoke-static {p0, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static f(Landroid/content/Context;)I
    .locals 4

    sget-object v0, Lcom/iterable/iterableapi/p1;->a:Ljava/util/List;

    invoke-static {v0}, Lcom/iterable/iterableapi/k2;->g(Ljava/util/List;)Z

    move-result v0

    sget-object v1, Lcom/iterable/iterableapi/p1;->b:Ljava/util/List;

    invoke-static {v1}, Lcom/iterable/iterableapi/k2;->g(Ljava/util/List;)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    const-string v0, "FrameworkDetector"

    const-string v1, "Both Flutter and React Native frameworks detected. This is unexpected."

    invoke-static {v0, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPackageName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, ".flutter"

    const/4 v3, 0x0

    invoke-static {v0, v1, v3}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/iterable/iterableapi/q1;->a:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/iterable/iterableapi/k2;->h(Landroid/content/Context;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/iterable/iterableapi/q1;->b:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/iterable/iterableapi/k2;->h(Landroid/content/Context;Ljava/util/List;)Z

    return v2

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/iterable/iterableapi/q1;->a:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/iterable/iterableapi/k2;->h(Landroid/content/Context;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_5
    sget-object v0, Lcom/iterable/iterableapi/q1;->b:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/iterable/iterableapi/k2;->h(Landroid/content/Context;Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_6

    :goto_1
    return v2

    :cond_6
    const/4 p0, 0x3

    return p0
.end method

.method public static g(Ljava/util/List;)Z
    .locals 3

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "className"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v2

    goto :goto_0

    :catch_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    return v2

    :cond_2
    :goto_1
    return v1
.end method

.method public static h(Landroid/content/Context;Ljava/util/List;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x80

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz p0, :cond_1

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    return v2

    :cond_2
    :goto_0
    return v0

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Error checking manifest metadata: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "FrameworkDetector"

    invoke-static {p1, p0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    .locals 8

    new-instance v0, Lcom/iterable/iterableapi/o;

    invoke-static {p3}, Lcom/iterable/iterableapi/k2;->e(Lorg/json/JSONObject;)V

    const-string v4, "POST"

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/iterable/iterableapi/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V

    new-instance p1, Lcom/iterable/iterableapi/a2;

    invoke-direct {p1}, Lcom/iterable/iterableapi/a2;-><init>()V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    filled-new-array {v0}, [Lcom/iterable/iterableapi/o;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V
    .locals 7

    new-instance v0, Lcom/iterable/iterableapi/o;

    invoke-static {p3}, Lcom/iterable/iterableapi/k2;->e(Lorg/json/JSONObject;)V

    const-string v4, "GET"

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/iterable/iterableapi/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V

    new-instance p1, Lcom/iterable/iterableapi/a2;

    invoke-direct {p1}, Lcom/iterable/iterableapi/a2;-><init>()V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    filled-new-array {v0}, [Lcom/iterable/iterableapi/o;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 4

    const-string v0, "IterableApi"

    if-nez p1, :cond_0

    const-string p1, "Remote configuration returned null"

    invoke-static {v0, p1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "offlineMode"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v1, v1, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/l0;->i0(Z)V

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v1, v1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    const-string v2, "itbl_saved_configuration"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "itbl_offline_mode"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Failed to read remote configuration"

    invoke-static {v0, p1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
