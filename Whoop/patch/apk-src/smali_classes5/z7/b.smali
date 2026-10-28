.class public final Lz7/b;
.super La8/a;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lz7/c;

.field public final synthetic d:Lds/w;

.field public final synthetic e:Lv7/b;


# direct methods
.method public constructor <init>(Lv7/b;Lqg3/d;Lz7/c;Lds/w;)V
    .locals 0

    iput-object p1, p0, Lz7/b;->e:Lv7/b;

    iput-object p3, p0, Lz7/b;->c:Lz7/c;

    iput-object p4, p0, Lz7/b;->d:Lds/w;

    invoke-direct {p0, p2}, La8/a;-><init>(Lqg3/d;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Lz7/b;->e:Lv7/b;

    iget-object v0, v0, Lv7/b;->c:Lux/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lg8/b;->f:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "androidx.health.platform.client.service.IHealthDataService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lg8/c;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lg8/c;

    goto :goto_0

    :cond_1
    new-instance v0, Lg8/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lg8/a;->f:Landroid/os/IBinder;

    move-object p1, v0

    :goto_0
    iget-object v0, p0, Lz7/b;->d:Lds/w;

    iget-object v1, p0, Lz7/b;->c:Lz7/c;

    invoke-interface {v1, p1, v0}, Lz7/c;->c(Landroid/os/IInterface;Lds/w;)V

    return-void
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lz7/b;->d:Lds/w;

    invoke-virtual {v0, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final f(La8/d;)La8/a;
    .locals 4

    iget-object v0, p0, Lz7/b;->d:Lds/w;

    iget-object v1, p1, La8/d;->a:Ljava/util/HashSet;

    monitor-enter v1

    :try_start_0
    iget-object v2, p1, La8/d;->a:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v2, La8/c;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1, v0}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Lds/r;->w:Lds/r;

    invoke-virtual {v0, v2, p1}, Lds/n;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    monitor-exit v1

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
