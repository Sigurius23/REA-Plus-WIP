.class public final Lio/seon/androidsdk/service/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/b;


# instance fields
.field public final a:Lio/seon/androidsdk/service/i1;

.field public final b:Landroid/content/Context;

.field public final c:Lio/seon/androidsdk/service/f1;

.field public d:Ljava/lang/String;

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lio/sentry/hints/j;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/seon/androidsdk/service/f;->e:Z

    iput-object p1, p0, Lio/seon/androidsdk/service/f;->b:Landroid/content/Context;

    iput-object p2, p0, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;

    new-instance p2, Lio/seon/androidsdk/service/f1;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/seon/androidsdk/service/JNIHandler;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p2, Lio/seon/androidsdk/service/f1;->b:Ljava/lang/Object;

    iput-object p1, p2, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    if-eqz p1, :cond_0

    sget-boolean v0, Lio/seon/androidsdk/service/JNIHandler;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Ls/m2;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ls/m2;-><init>(I)V

    const-string v1, "Beginning load of %s..."

    const-string v2, "seon"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v2}, Ls/m2;->n(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x1

    sput-boolean p1, Lio/seon/androidsdk/service/JNIHandler;->a:Z

    :cond_0
    iput-object p2, p0, Lio/seon/androidsdk/service/f;->c:Lio/seon/androidsdk/service/f1;

    new-instance p1, Lio/seon/androidsdk/service/i1;

    invoke-direct {p1, p0}, Lio/seon/androidsdk/service/i1;-><init>(Lio/seon/androidsdk/service/f;)V

    iput-object p1, p0, Lio/seon/androidsdk/service/f;->a:Lio/seon/androidsdk/service/i1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p2, Lbu/c;->y:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;

    iget-object p1, p1, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    invoke-virtual {p1, p3}, Lio/seon/androidsdk/service/p0;->i(Lio/sentry/hints/j;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/f;->b:Landroid/content/Context;

    return-object v0
.end method

.method public final declared-synchronized b()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/f;->a:Lio/seon/androidsdk/service/i1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v0, Lio/seon/androidsdk/service/i1;->g:Lio/seon/androidsdk/service/c1;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/c1;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/seon/androidsdk/service/f;->e:Z

    return-void
.end method

.method public final d(Lio/seon/androidsdk/service/d;)V
    .locals 3

    iget-boolean v0, p0, Lio/seon/androidsdk/service/f;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/seon/androidsdk/service/f;->a:Lio/seon/androidsdk/service/i1;

    invoke-virtual {v2, v0, p1, v1}, Lio/seon/androidsdk/service/i1;->e(Ljava/lang/String;Lio/seon/androidsdk/service/d;Ljava/lang/Boolean;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/seon/androidsdk/service/f;->e:Z

    return-void

    :cond_0
    new-instance p1, Lio/seon/androidsdk/exception/BehaviouralMonitoringException;

    const-string v0, "Failed to stop behaviour monitoring! There\'s no active behaviour monitoring running!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
