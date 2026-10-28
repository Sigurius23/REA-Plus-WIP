.class public final Lmc/g;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# static fields
.field public static final a:Lmc/g;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/LinkedHashMap;

.field public static d:Landroid/net/NetworkCapabilities;

.field public static e:Z

.field public static f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmc/g;

    invoke-direct {v0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    sput-object v0, Lmc/g;->a:Lmc/g;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmc/g;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lmc/g;->c:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static a(Landroid/net/NetworkRequest;Landroid/net/NetworkCapabilities;)Z
    .locals 1

    sget-boolean v0, Lmc/g;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/net/NetworkRequest;->canBeSatisfiedBy(Landroid/net/NetworkCapabilities;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b()V
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lmc/g;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lmc/g;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/NetworkRequest;

    sget-object v5, Lmc/g;->a:Lmc/g;

    sget-object v6, Lmc/g;->d:Landroid/net/NetworkCapabilities;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v6}, Lmc/g;->a(Landroid/net/NetworkRequest;Landroid/net/NetworkCapabilities;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lmc/a;->a:Lmc/a;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    new-instance v3, Lmc/b;

    const/4 v5, 0x7

    invoke-direct {v3, v5}, Lmc/b;-><init>(I)V

    :goto_1
    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    monitor-exit v1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lmc/c;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    return-void

    :goto_3
    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public final onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 2

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object v0, Lmc/i;->a:Ljava/lang/String;

    const-string v1, "NetworkRequestConstraintController onBlockedStatusChanged callback"

    invoke-virtual {p1, v0, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lmc/g;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-boolean v0, Lmc/g;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p2, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    :try_start_1
    sput-boolean p2, Lmc/g;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    invoke-static {}, Lmc/g;->b()V

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 2

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "networkCapabilities"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object v0, Lmc/i;->a:Ljava/lang/String;

    const-string v1, "NetworkRequestConstraintController onCapabilitiesChanged callback"

    invoke-virtual {p1, v0, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lmc/g;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sput-object p2, Lmc/g;->d:Landroid/net/NetworkCapabilities;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    invoke-static {}, Lmc/g;->b()V

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 4

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object v0, Lmc/i;->a:Ljava/lang/String;

    const-string v1, "NetworkRequestConstraintController onLost callback"

    invoke-virtual {p1, v0, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lmc/g;->b:Ljava/lang/Object;

    monitor-enter p1

    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lmc/g;->d:Landroid/net/NetworkCapabilities;

    sget-object v0, Lmc/g;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lmc/b;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lmc/b;-><init>(I)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw v0
.end method
