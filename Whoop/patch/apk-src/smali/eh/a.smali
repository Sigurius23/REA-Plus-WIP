.class public Leh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/io/Serializable;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Leh/a;->b:Ljava/lang/Object;

    .line 3
    sget-object p1, Lio/sentry/d4;->AUTO:Lio/sentry/d4;

    iput-object p1, p0, Leh/a;->c:Ljava/io/Serializable;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Leh/a;->a:Z

    .line 5
    const-string p1, "manual"

    iput-object p1, p0, Leh/a;->d:Ljava/lang/Object;

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Leh/a;->b:Ljava/lang/Object;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Leh/a;->c:Ljava/io/Serializable;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Leh/a;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Leh/a;->a:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Leh/e;Leh/b;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh/a;->d:Ljava/lang/Object;

    iput-object p2, p0, Leh/a;->b:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 13
    new-array p1, p1, [Z

    iput-object p1, p0, Leh/a;->c:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object v0, p0, Leh/a;->d:Ljava/lang/Object;

    check-cast v0, Leh/e;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Leh/a;->a:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Leh/a;->b:Ljava/lang/Object;

    check-cast v1, Leh/b;

    iget-object v1, v1, Leh/b;->g:Leh/a;

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p0, p1}, Leh/e;->b(Leh/e;Leh/a;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Leh/a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public b(I)Lne3/e0;
    .locals 4

    iget-object v0, p0, Leh/a;->d:Ljava/lang/Object;

    check-cast v0, Leh/e;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Leh/a;->a:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Leh/a;->c:Ljava/io/Serializable;

    check-cast v1, [Z

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    iget-object v1, p0, Leh/a;->b:Ljava/lang/Object;

    check-cast v1, Leh/b;

    iget-object v1, v1, Leh/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, v0, Leh/e;->P:Leh/d;

    move-object v2, p1

    check-cast v2, Lne3/e0;

    invoke-virtual {v1, v2}, Lne3/p;->x(Lne3/e0;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Leh/d;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v1

    invoke-static {v1}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_0
    check-cast p1, Lne3/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public declared-synchronized c()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v0, p0, Leh/a;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :cond_0
    :try_start_3
    invoke-virtual {p0}, Leh/a;->d()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Leh/a;->c:Ljava/io/Serializable;

    if-nez v0, :cond_1

    new-instance v0, Lzs/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lzs/a;-><init>(I)V

    iget-object v1, p0, Leh/a;->b:Ljava/lang/Object;

    check-cast v1, Lpt/b;

    check-cast v1, Lgt/k;

    invoke-virtual {v1, v0}, Lgt/k;->a(Lzs/a;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Leh/a;->a:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit p0

    :goto_1
    iget-object v0, p0, Leh/a;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    iget-object v0, p0, Leh/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v0, Ldt/g;->g:Lgt/l;

    invoke-virtual {v0}, Lgt/l;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxt/a;

    monitor-enter v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-boolean v1, v0, Lxt/a;->a:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move v0, v1

    :goto_2
    monitor-exit p0

    return v0

    :catchall_2
    move-exception v1

    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_3
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    throw v0

    :goto_4
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    throw v0
.end method

.method public d()Ljava/lang/Boolean;
    .locals 6

    const-string v0, "firebase_messaging_auto_init_enabled"

    iget-object v1, p0, Leh/a;->d:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v1, v1, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    invoke-virtual {v1}, Ldt/g;->a()V

    iget-object v1, v1, Ldt/g;->a:Landroid/content/Context;

    const-string v2, "com.google.firebase.messaging"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v4, "auto_init"

    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x80

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
