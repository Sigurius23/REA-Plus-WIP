.class public final Lz33/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Landroid/net/ConnectivityManager;

.field public final c:Ll83/p;

.field public final d:Ljava/lang/Object;

.field public final e:Lcom/iterable/iterableapi/r1;

.field public volatile f:Z

.field public volatile g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lbc3/c0;Landroid/net/ConnectivityManager;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz33/b;->a:Lbc3/c0;

    iput-object p2, p0, Lz33/b;->b:Landroid/net/ConnectivityManager;

    const-string p1, "Video:NetworkStateProvider"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lz33/b;->c:Ll83/p;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz33/b;->d:Ljava/lang/Object;

    new-instance p1, Lcom/iterable/iterableapi/r1;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lcom/iterable/iterableapi/r1;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lz33/b;->e:Lcom/iterable/iterableapi/r1;

    invoke-virtual {p0}, Lz33/b;->c()Z

    move-result p1

    iput-boolean p1, p0, Lz33/b;->f:Z

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    iput-object p1, p0, Lz33/b;->g:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lz33/b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static final a(Lz33/b;)V
    .locals 6

    invoke-virtual {p0}, Lz33/b;->c()Z

    move-result v0

    iget-boolean v1, p0, Lz33/b;->f:Z

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lz33/b;->b()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "[notifyListenersIfNetworkStateChanged] #network; Network connected."

    invoke-interface {v1, v4, v0, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lz33/b;->f:Z

    iget-object v0, p0, Lz33/b;->g:Ljava/lang/Object;

    iget-object p0, p0, Lz33/b;->a:Lbc3/c0;

    new-instance v1, Lz33/a;

    const/4 v4, 0x0

    invoke-direct {v1, v0, v3, v4}, Lz33/a;-><init>(Ljava/util/Set;Lq83/d;I)V

    invoke-static {p0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    iget-boolean v1, p0, Lz33/b;->f:Z

    if-eqz v1, :cond_3

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lz33/b;->b()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "[notifyListenersIfNetworkStateChanged] #network; Network disconnected."

    invoke-interface {v1, v4, v0, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lz33/b;->f:Z

    iget-object v0, p0, Lz33/b;->g:Ljava/lang/Object;

    iget-object p0, p0, Lz33/b;->a:Lbc3/c0;

    new-instance v1, Lz33/a;

    const/4 v4, 0x1

    invoke-direct {v1, v0, v3, v4}, Lz33/a;-><init>(Ljava/util/Set;Lq83/d;I)V

    invoke-static {p0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    return-void
.end method


# virtual methods
.method public final b()Lb23/k;
    .locals 1

    iget-object v0, p0, Lz33/b;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final c()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lz33/b;->b:Landroid/net/ConnectivityManager;

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x10

    invoke-virtual {v2, v3}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    move-object v2, v0

    goto :goto_2

    :goto_1
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_2
    instance-of v3, v2, Ll83/m;

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    move-object v0, v2

    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_3
    return v1
.end method

.method public final d(Lf53/f;)V
    .locals 5

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz33/b;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz33/b;->g:Ljava/lang/Object;

    invoke-static {p1, v1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    iput-object p1, p0, Lz33/b;->g:Ljava/lang/Object;

    iget-object p1, p0, Lz33/b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {p1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {p1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object p1

    const-string v1, "build(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lz33/b;->e:Lcom/iterable/iterableapi/r1;

    iget-object v2, p0, Lz33/b;->b:Landroid/net/ConnectivityManager;

    new-instance v3, Lb2/z;

    const/16 v4, 0x1b

    invoke-direct {v3, v4, p1, v1}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lrg/j;->c(Landroid/net/ConnectivityManager;Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final e(Lf53/f;)V
    .locals 5

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz33/b;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz33/b;->g:Ljava/lang/Object;

    invoke-static {p1, v1}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz33/b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz33/b;->e:Lcom/iterable/iterableapi/r1;

    iget-object v2, p0, Lz33/b;->b:Landroid/net/ConnectivityManager;

    new-instance v3, Lj43/a;

    const/16 v4, 0x1a

    invoke-direct {v3, v1, v4}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v3}, Lrg/j;->c(Landroid/net/ConnectivityManager;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object p1, p0, Lz33/b;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
