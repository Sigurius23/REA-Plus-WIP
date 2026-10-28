.class public final Lv7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqg3/d;

.field public final b:La8/b;

.field public final c:Lux/f0;

.field public final d:Lux/f0;

.field public volatile e:I

.field public final f:Landroid/content/Context;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldb/j0;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly7/a;->a:Ly7/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ly7/a;->b:La8/b;

    if-nez v1, :cond_0

    new-instance v1, La8/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Landroid/os/HandlerThread;

    const-string v4, "ProviderConnectionManager"

    const/16 v5, 0x9

    invoke-direct {v3, v4, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    const-string v4, "handlerThread.getLooper()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, La8/b;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    sput-object v1, Ly7/a;->b:La8/b;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Ly7/a;->b:La8/b;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Lux/f0;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lux/f0;-><init>(I)V

    new-instance v2, Lux/f0;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lux/f0;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v3, -0x1

    iput v3, p0, Lv7/b;->e:I

    new-instance v3, La8/a;

    invoke-direct {v3, p0, v2, v0}, La8/a;-><init>(Lv7/b;Lux/f0;Lux/f0;)V

    new-instance v4, Lqg3/d;

    iget-object p2, p2, Ldb/j0;->x:Ljava/lang/String;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p2, v3}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v4, p0, Lv7/b;->a:Lqg3/d;

    iput-object v1, p0, Lv7/b;->b:La8/b;

    iput-object v0, p0, Lv7/b;->c:Lux/f0;

    iput-object v2, p0, Lv7/b;->d:Lux/f0;

    iput-object p1, p0, Lv7/b;->f:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lv7/b;->g:Ljava/lang/String;

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public final a(ILz7/c;)Lds/w;
    .locals 7

    sget-object v0, Lds/r;->w:Lds/r;

    new-instance v1, Lds/w;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, p0, Lv7/b;->e:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    iget v2, p0, Lv7/b;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lds/t;

    invoke-direct {v3, v2}, Lds/t;-><init>(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lv7/b;->d:Lux/f0;

    new-instance v3, Lrm/p;

    const/16 v4, 0x18

    invoke-direct {v3, v2, v4}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lds/w;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v4, p0, Lv7/b;->b:La8/b;

    new-instance v5, Lz7/b;

    iget-object v6, p0, Lv7/b;->a:Lqg3/d;

    invoke-direct {v5, p0, v6, v3, v2}, Lz7/b;-><init>(Lv7/b;Lqg3/d;Lz7/c;Lds/w;)V

    iget-object v3, v4, La8/b;->x:Landroid/os/Handler;

    const/4 v4, 0x3

    invoke-virtual {v3, v4, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    new-instance v3, Lrm/p;

    const/16 v4, 0x17

    invoke-direct {v3, p0, v4}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    new-instance v4, Lds/o;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v2, v4, Lds/o;->H:Lds/w;

    iput-object v3, v4, Lds/o;->I:Lrm/p;

    invoke-virtual {v2, v4, v0}, Lds/n;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move-object v3, v4

    :goto_0
    new-instance v2, Lz7/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object p0, v2, Lz7/a;->d:Ljava/lang/Object;

    iput p1, v2, Lz7/a;->a:I

    iput-object v1, v2, Lz7/a;->b:Ljava/lang/Object;

    iput-object p2, v2, Lz7/a;->c:Ljava/lang/Object;

    new-instance p1, Lds/s;

    const/4 p2, 0x0

    invoke-direct {p1, p2, v3, v2}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, p1, v0}, Lds/v;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method

.method public final b()Le8/e;
    .locals 6

    new-instance v0, Le8/e;

    const-string v1, "callingPackageName"

    iget-object v2, p0, Lv7/b;->g:Ljava/lang/String;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lv7/b;->f:Landroid/content/Context;

    const-string v3, "PermissionTokenManager.healthdata"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v3, "token"

    const/4 v5, 0x0

    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v3}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v3}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget v3, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v5, 0x64

    if-eq v3, v5, :cond_0

    const/16 v5, 0x7d

    if-eq v3, v5, :cond_0

    const/16 v5, 0xc8

    if-ne v3, v5, :cond_1

    :cond_0
    const/4 v4, 0x1

    :cond_1
    const/16 v3, 0x70

    invoke-direct {v0, v2, v3, v1, v4}, Le8/e;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    return-object v0
.end method
