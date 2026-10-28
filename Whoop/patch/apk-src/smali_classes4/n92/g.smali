.class public final Ln92/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ln92/g;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "appContext",
        "",
        "apiKey",
        "Lcom/iterable/iterableapi/w;",
        "config",
        "Ll83/a0;",
        "a",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/iterable/iterableapi/w;)V",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/iterable/iterableapi/w;)V
    .locals 7

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iput-object p2, v0, Lcom/iterable/iterableapi/k;->c:Ljava/lang/String;

    sget-object p2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iput-object p3, p2, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    sget-object p2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p2, p2, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    const/4 p3, 0x0

    if-nez p2, :cond_0

    sget-object p2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    new-instance v0, Lcom/iterable/iterableapi/v;

    invoke-direct {v0, p3}, Lcom/iterable/iterableapi/v;-><init>(I)V

    new-instance v1, Lcom/iterable/iterableapi/w;

    invoke-direct {v1, v0}, Lcom/iterable/iterableapi/w;-><init>(Lcom/iterable/iterableapi/v;)V

    iput-object v1, p2, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    :cond_0
    sget-object p2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, p2, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/iterable/iterableapi/k;->g()Lcom/iterable/iterableapi/o1;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "iterable-email"

    invoke-virtual {v0, v1}, Lcom/iterable/iterableapi/o1;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    const-string v1, "iterable-user-id"

    invoke-virtual {v0, v1}, Lcom/iterable/iterableapi/o1;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    const-string v1, "iterable-unknown-user-id"

    invoke-virtual {v0, v1}, Lcom/iterable/iterableapi/o1;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    const-string v1, "iterable-auth-token"

    invoke-virtual {v0, v1}, Lcom/iterable/iterableapi/o1;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string v0, "IterableApi"

    const-string v1, "retrieveEmailAndUserId: Shared preference creation failed. Could not retrieve email/userId"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object p2, p2, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    invoke-static {p1}, Le93/b;->V(Landroid/content/Context;)Z

    sget-object p2, Lcom/iterable/iterableapi/g;->i:Lcom/iterable/iterableapi/g;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-boolean v0, Lcom/iterable/iterableapi/g;->h:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    sput-boolean v1, Lcom/iterable/iterableapi/g;->h:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v2, p2, Lcom/iterable/iterableapi/g;->g:Lcom/iterable/iterableapi/e;

    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_3
    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->q:Lcom/iterable/iterableapi/i;

    invoke-virtual {p2, v0}, Lcom/iterable/iterableapi/g;->a(Lcom/iterable/iterableapi/f;)V

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->l:Lcom/iterable/iterableapi/d1;

    if-nez v0, :cond_4

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    new-instance v2, Lcom/iterable/iterableapi/d1;

    sget-object v3, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    sget-object v4, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v4, v4, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    iget-object v4, v4, Lcom/iterable/iterableapi/w;->e:Lcom/iterable/iterableapi/x0;

    sget-object v5, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v5, v5, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v5, v5, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, v3, v4}, Lcom/iterable/iterableapi/d1;-><init>(Lcom/iterable/iterableapi/k;Lcom/iterable/iterableapi/x0;)V

    iput-object v2, v0, Lcom/iterable/iterableapi/k;->l:Lcom/iterable/iterableapi/d1;

    :cond_4
    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->m:Lcom/iterable/iterableapi/c0;

    const/4 v2, 0x0

    if-nez v0, :cond_5

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    new-instance v3, Lcom/iterable/iterableapi/c0;

    sget-object v4, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    const-string v5, "iterableApi"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Lwe/o;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v6, v5, Lwe/o;->w:Ljava/lang/Object;

    new-instance v6, Lcom/iterable/iterableapi/d0;

    invoke-direct {v6, v2}, Lcom/iterable/iterableapi/d0;-><init>(Ljava/util/Date;)V

    iput-object v6, v5, Lwe/o;->x:Ljava/lang/Object;

    iput-object v5, v3, Lcom/iterable/iterableapi/c0;->x:Lwe/o;

    iput-object v4, v3, Lcom/iterable/iterableapi/c0;->w:Lcom/iterable/iterableapi/k;

    iget-object v5, v4, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    const-string v6, "getMainActivityContext(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v4, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Lcom/iterable/iterableapi/k;->m:Lcom/iterable/iterableapi/c0;

    :cond_5
    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->k:Lcom/iterable/iterableapi/i;

    if-nez v0, :cond_6

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    new-instance v3, Lcom/iterable/iterableapi/i;

    sget-object v4, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-direct {v3}, Lcom/iterable/iterableapi/i;-><init>()V

    sget-object v5, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iput-object v4, v3, Lcom/iterable/iterableapi/i;->x:Lcom/iterable/iterableapi/k;

    invoke-virtual {p2, v3}, Lcom/iterable/iterableapi/g;->a(Lcom/iterable/iterableapi/f;)V

    iput-object v3, v0, Lcom/iterable/iterableapi/k;->k:Lcom/iterable/iterableapi/i;

    :cond_6
    const-string p2, "itbl_saved_configuration"

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string v0, "itbl_offline_mode"

    invoke-interface {p2, v0, p3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/internal/l0;->i0(Z)V

    invoke-static {p1}, Le93/b;->V(Landroid/content/Context;)Z

    sget-object p2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p2}, Lcom/iterable/iterableapi/k;->a()Z

    move-result p2

    if-nez p2, :cond_7

    sget-object p2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p2, p2, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    if-nez p2, :cond_7

    sget-object p2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p2, p2, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-static {p2}, Le93/b;->M(Landroid/content/pm/PackageManager;)Z

    move-result p2

    if-eqz p2, :cond_9

    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sget-object v3, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v3}, Lcom/iterable/iterableapi/k;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, p1, v3, v2}, Le93/b;->U(Lorg/json/JSONObject;Landroid/content/Context;Ljava/lang/String;Lcom/iterable/iterableapi/b;)V

    const-string p1, "FireTV"

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p1, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    if-nez v0, :cond_8

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p1, p1, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_8
    iget-object p1, p1, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/internal/l0;->l0(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string p2, "IterableApi"

    const-string v0, "initialize: exception"

    invoke-static {p2, v0, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_9
    :goto_2
    sget-object p1, Lcom/iterable/iterableapi/u;->a:Lcom/iterable/iterableapi/l1;

    iget-object p2, p1, Lcom/iterable/iterableapi/l1;->d:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-boolean v0, p1, Lcom/iterable/iterableapi/l1;->c:Z

    if-eqz v0, :cond_a

    const-string p1, "IterableInitCallbackMgr"

    const-string p3, "notifyInitializationComplete called but already initialized"

    invoke-static {p1, p3}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit p2

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_a
    iput-boolean v1, p1, Lcom/iterable/iterableapi/l1;->c:Z

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string p2, "IterableInitCallbackMgr"

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Notifying initialization completion to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/iterable/iterableapi/l1;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " subscribers and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/iterable/iterableapi/l1;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " one-time callbacks"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p1, Lcom/iterable/iterableapi/l1;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    const-string v0, "IterableInitCallbackMgr"

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v1, v3, :cond_b

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/iterable/iterableapi/k1;

    invoke-direct {v1, p3}, Lcom/iterable/iterableapi/k1;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_b
    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v1

    const-string v3, "Exception in subscriber initialization callback"

    invoke-static {v0, v3, v1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_3

    :cond_c
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_d
    iget-object p2, p1, Lcom/iterable/iterableapi/l1;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object p1, p1, Lcom/iterable/iterableapi/l1;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_e

    :goto_4
    return-void

    :cond_e
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :goto_5
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
