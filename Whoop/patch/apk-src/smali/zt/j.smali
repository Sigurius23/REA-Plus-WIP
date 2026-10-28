.class public final Lzt/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/Object;

.field public static d:Lzt/c0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzt/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lzt/j;->a:Ljava/lang/Object;

    .line 8
    new-instance p1, Landroidx/profileinstaller/b;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Landroidx/profileinstaller/b;-><init>(I)V

    iput-object p1, p0, Lzt/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, La0/g;

    const/4 v1, 0x0

    .line 3
    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    .line 4
    iput-object v0, p0, Lzt/j;->b:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lzt/j;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;
    .locals 2

    const-string v0, "FirebaseMessaging"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FirebaseMessaging"

    const-string v1, "Binding to service"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v0, Lzt/j;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lzt/j;->d:Lzt/c0;

    if-nez v1, :cond_1

    new-instance v1, Lzt/c0;

    invoke-direct {v1, p0}, Lzt/c0;-><init>(Landroid/content/Context;)V

    sput-object v1, Lzt/j;->d:Lzt/c0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    :goto_0
    sget-object v1, Lzt/j;->d:Lzt/c0;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_3

    invoke-static {}, Lzt/q;->u()Lzt/q;

    move-result-object p2

    invoke-virtual {p2, p0}, Lzt/q;->z(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p0, v1, p1}, Lzt/z;->c(Landroid/content/Context;Lzt/c0;Landroid/content/Intent;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p1}, Lzt/c0;->b(Landroid/content/Intent;)Lcq/u;

    :goto_1
    const/4 p0, -0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-virtual {v1, p1}, Lzt/c0;->b(Landroid/content/Intent;)Lcq/u;

    move-result-object p0

    new-instance p1, Landroidx/profileinstaller/b;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroidx/profileinstaller/b;-><init>(I)V

    new-instance p2, Lzs/a;

    const/4 v0, 0x5

    invoke-direct {p2, v0}, Lzs/a;-><init>(I)V

    invoke-virtual {p0, p1, p2}, Lcq/u;->continueWith(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    const-string v0, "gcm.rawData64"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v3, "rawData"

    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lzt/j;->a:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lzt/j;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/profileinstaller/b;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v4, 0x1a

    const/4 v5, 0x1

    if-lt v3, v4, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result v4

    const/high16 v6, 0x10000000

    and-int/2addr v4, v6

    if-eqz v4, :cond_2

    move v2, v5

    :cond_2
    if-eqz v3, :cond_3

    if-nez v2, :cond_3

    invoke-static {v0, p1, v2}, Lzt/j;->a(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v3, Lcom/iterable/iterableapi/m1;

    const/4 v4, 0x5

    invoke-direct {v3, v4, v0, p1}, Lcom/iterable/iterableapi/m1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lcom/google/android/gms/tasks/Tasks;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcq/u;

    move-result-object v3

    new-instance v4, Lzt/i;

    invoke-direct {v4, v0, p1, v2}, Lzt/i;-><init>(Landroid/content/Context;Landroid/content/Intent;Z)V

    invoke-virtual {v3, v1, v4}, Lcq/u;->continueWithTask(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
