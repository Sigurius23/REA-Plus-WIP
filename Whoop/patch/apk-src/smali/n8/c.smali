.class public final Ln8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljc/a;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashSet;

.field public volatile d:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljc/a;

    const/16 v1, 0xa

    .line 3
    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    .line 4
    iput-object v0, p0, Ln8/c;->a:Ljc/a;

    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln8/c;->b:Ljava/util/LinkedHashMap;

    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ln8/c;->c:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 2

    const-string v0, "viewModelScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljc/a;

    const/16 v1, 0xa

    .line 9
    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    .line 10
    iput-object v0, p0, Ln8/c;->a:Ljc/a;

    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln8/c;->b:Ljava/util/LinkedHashMap;

    .line 12
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ln8/c;->c:Ljava/util/LinkedHashSet;

    .line 13
    new-instance v0, Ln8/a;

    .line 14
    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-direct {v0, p1}, Ln8/a;-><init>(Lq83/j;)V

    .line 15
    const-string p1, "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"

    invoke-virtual {p0, p1, v0}, Ln8/c;->b(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public static c(Ljava/lang/AutoCloseable;)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-static {p0}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/AutoCloseable;)V
    .locals 2

    const-string v0, "closeable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ln8/c;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ln8/c;->c(Ljava/lang/AutoCloseable;)V

    return-void

    :cond_0
    iget-object v0, p0, Ln8/c;->a:Ljc/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln8/c;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/AutoCloseable;)V
    .locals 2

    iget-boolean v0, p0, Ln8/c;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p2}, Ln8/c;->c(Ljava/lang/AutoCloseable;)V

    return-void

    :cond_0
    iget-object v0, p0, Ln8/c;->a:Ljc/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln8/c;->b:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-static {p1}, Ln8/c;->c(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
