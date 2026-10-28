.class public final Lso/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static e:Lso/o;


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILdc3/a;Lec3/l;Lq83/j;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p3, p0, Lso/o;->b:Ljava/lang/Object;

    .line 15
    iput p1, p0, Lso/o;->a:I

    .line 16
    iput-object p2, p0, Lso/o;->c:Ljava/lang/Object;

    .line 17
    iput-object p4, p0, Lso/o;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lso/m;

    invoke-direct {v0, p0}, Lso/m;-><init>(Lso/o;)V

    iput-object v0, p0, Lso/o;->d:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lso/o;->a:I

    iput-object p2, p0, Lso/o;->c:Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lso/o;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgj/d;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso/o;->b:Ljava/lang/Object;

    .line 4
    iget-object v0, p1, Lgj/d;->a:Lgj/g;

    .line 5
    iget-object p1, p1, Lgj/d;->k:Lfk/a;

    .line 6
    iput-object p1, p0, Lso/o;->d:Ljava/lang/Object;

    .line 7
    iget-object p1, v0, Lgj/g;->b:Landroid/content/Context;

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "amplitude-android-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v0, v0, Lgj/g;->e:Ljava/lang/String;

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "config.context.getShared\u2026xt.MODE_PRIVATE\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lso/o;->c:Ljava/lang/Object;

    .line 12
    const-string v0, "storage_version"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lso/o;->a:I

    return-void
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Lso/o;
    .locals 4

    const-class v0, Lso/o;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lso/o;->e:Lso/o;

    if-nez v1, :cond_0

    new-instance v1, Lso/o;

    new-instance v2, Lap/b;

    const-string v3, "MessengerIpcClient"

    invoke-direct {v2, v3}, Lap/b;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-static {v3, v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-static {v2}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lso/o;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    sput-object v1, Lso/o;->e:Lso/o;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lso/o;->e:Lso/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public a(Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lso/o;->b:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    instance-of v1, p1, Lbk/g;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lbk/g;

    iget v2, v1, Lbk/g;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lbk/g;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lbk/g;

    invoke-direct {v1, p0, p1}, Lbk/g;-><init>(Lso/o;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Lbk/g;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lbk/g;->E:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x3

    if-eqz v3, :cond_4

    if-eq v3, v5, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v6, :cond_1

    iget-object v0, v1, Lbk/g;->w:Lso/o;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v1, Lbk/g;->x:Lgj/g;

    iget-object v3, v1, Lbk/g;->w:Lso/o;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p1, v0

    move-object v0, v3

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v0, v3

    goto/16 :goto_6

    :cond_3
    iget-object v0, v1, Lbk/g;->x:Lgj/g;

    iget-object v3, v1, Lbk/g;->w:Lso/o;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object p1, v0, Lgj/d;->a:Lgj/g;

    iget-boolean v3, p1, Lgj/g;->o:Z

    if-eqz v3, :cond_6

    new-instance v3, Lbk/n;

    invoke-direct {v3, v0}, Lbk/n;-><init>(Lgj/d;)V

    iput-object p0, v1, Lbk/g;->w:Lso/o;

    iput-object p1, v1, Lbk/g;->x:Lgj/g;

    iput v5, v1, Lbk/g;->E:I

    invoke-virtual {v3, v1}, Lbk/n;->c(Lbk/g;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v2, :cond_5

    goto :goto_4

    :cond_5
    move-object v3, p0

    move-object v0, p1

    :goto_1
    move-object p1, v0

    move-object v0, v3

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v0, p0

    goto :goto_6

    :cond_6
    move-object v0, p0

    :goto_2
    :try_start_4
    new-instance v3, Ldk/b;

    iget-object v5, v0, Lso/o;->b:Ljava/lang/Object;

    check-cast v5, Lgj/d;

    const/4 v7, 0x0

    invoke-direct {v3, v5, p1, v7}, Ldk/b;-><init>(Lgj/d;Lgj/g;I)V

    iput-object v0, v1, Lbk/g;->w:Lso/o;

    iput-object p1, v1, Lbk/g;->x:Lgj/g;

    iput v4, v1, Lbk/g;->E:I

    invoke-virtual {v3, v1}, Ldk/b;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    new-instance v3, Ldk/b;

    iget-object v4, v0, Lso/o;->b:Ljava/lang/Object;

    check-cast v4, Lgj/d;

    const/4 v5, 0x1

    invoke-direct {v3, v4, p1, v5}, Ldk/b;-><init>(Lgj/d;Lgj/g;I)V

    iput-object v0, v1, Lbk/g;->w:Lso/o;

    const/4 p1, 0x0

    iput-object p1, v1, Lbk/g;->x:Lgj/g;

    iput v6, v1, Lbk/g;->E:I

    invoke-virtual {v3, v1}, Ldk/b;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    :goto_4
    return-object v2

    :cond_8
    :goto_5
    iget-object p1, v0, Lso/o;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "storage_version"

    invoke-interface {p1, v1, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_7

    :goto_6
    iget-object v0, v0, Lso/o;->d:Ljava/lang/Object;

    check-cast v0, Lfk/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to migrate storage: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lfk/a;->error(Ljava/lang/String;)V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public declared-synchronized c(Lso/n;)Lcq/u;
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "MessengerIpcClient"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lso/n;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Queueing "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessengerIpcClient"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lso/o;->d:Ljava/lang/Object;

    check-cast v0, Lso/m;

    invoke-virtual {v0, p1}, Lso/m;->d(Lso/n;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lso/m;

    invoke-direct {v0, p0}, Lso/m;-><init>(Lso/o;)V

    iput-object v0, p0, Lso/o;->d:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lso/m;->d(Lso/n;)Z

    :cond_1
    iget-object p1, p1, Lso/n;->b:Lcq/i;

    iget-object p1, p1, Lcq/i;->a:Lcq/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
