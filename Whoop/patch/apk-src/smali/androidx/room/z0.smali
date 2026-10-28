.class public abstract Landroidx/room/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Companion:Landroidx/room/r0;

.field public static final MAX_BIND_PARAMETER_CNT:I = 0x3e7


# instance fields
.field private allowMainThreadQueries:Z

.field private autoCloser:Lnb/a;

.field private final closeBarrier:Lkb/a;

.field private configuration:Landroidx/room/g;

.field private connectionManager:Landroidx/room/n0;

.field private coroutineScope:Lbc3/c0;

.field private internalQueryExecutor:Ljava/util/concurrent/Executor;

.field private internalTracker:Landroidx/room/v;

.field private internalTransactionExecutor:Ljava/util/concurrent/Executor;

.field protected mCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Landroidx/room/q0;",
            ">;"
        }
    .end annotation
.end field

.field protected volatile mDatabase:Lub/a;

.field private final suspendingTransactionContext:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lq83/j;",
            ">;"
        }
    .end annotation
.end field

.field private transactionContext:Lq83/j;

.field private final typeConverters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private useTempTrackingTable:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/room/r0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/room/z0;->Companion:Landroidx/room/r0;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkb/a;

    new-instance v1, Landroidx/room/u0;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-class v4, Landroidx/room/z0;

    const-string v5, "onClosed"

    const-string v6, "onClosed()V"

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, Landroidx/room/u0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v0, v1}, Lkb/a;-><init>(Landroidx/room/u0;)V

    iput-object v0, v3, Landroidx/room/z0;->closeBarrier:Lkb/a;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, v3, Landroidx/room/z0;->suspendingTransactionContext:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, v3, Landroidx/room/z0;->typeConverters:Ljava/util/Map;

    const/4 v0, 0x1

    iput-boolean v0, v3, Landroidx/room/z0;->useTempTrackingTable:Z

    return-void
.end method

.method public static final synthetic access$getConnectionManager$p(Landroidx/room/z0;)Landroidx/room/n0;
    .locals 0

    iget-object p0, p0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    return-object p0
.end method

.method public static final access$onClosed(Landroidx/room/z0;)V
    .locals 2

    iget-object v0, p0, Landroidx/room/z0;->coroutineScope:Lbc3/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    iget-object v0, v0, Landroidx/room/v;->j:Landroidx/room/c0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/room/c0;->c()V

    :cond_0
    iget-object p0, p0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    if-eqz p0, :cond_2

    iget-object v0, p0, Landroidx/room/n0;->f:Llb/b;

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    iget-object p0, p0, Landroidx/room/n0;->g:Lub/e;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    :cond_1
    return-void

    :cond_2
    const-string p0, "connectionManager"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string p0, "coroutineScope"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic getMCallbacks$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getMDatabase$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic query$default(Landroidx/room/z0;Lub/g;Landroid/os/CancellationSignal;ILjava/lang/Object;)Landroid/database/Cursor;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/room/z0;->query(Lub/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: query"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lc93/a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/room/z0;->beginTransaction()V

    :try_start_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/room/z0;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/room/z0;->endTransaction()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroidx/room/z0;->endTransaction()V

    throw p1

    :cond_0
    new-instance v0, Landroidx/room/o0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/room/o0;-><init>(Lc93/a;I)V

    const/4 p1, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v1, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final addTypeConverter$room_runtime(Lj93/d;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "kclass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "converter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/z0;->typeConverters:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public assertNotMainThread()V
    .locals 2

    iget-boolean v0, p0, Landroidx/room/z0;->allowMainThreadQueries:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/room/z0;->isMainThread$room_runtime()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public assertNotSuspendingTransaction()V
    .locals 2

    invoke-virtual {p0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/room/z0;->inTransaction()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/room/z0;->suspendingTransactionContext:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq83/j;

    if-eqz v0, :cond_0

    sget-object v1, Landroidx/room/t1;->x:Landroidx/room/s1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Landroidx/room/t1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method public beginTransaction()V
    .locals 5
    .annotation runtime Ll83/c;
    .end annotation

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v0

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    invoke-interface {v0}, Lub/a;->v()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroidx/room/t;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v1, v3, v4}, Landroidx/room/t;-><init>(Landroidx/room/v;Lq83/d;I)V

    invoke-static {v2}, Le93/b;->Z(Lc93/m;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0}, Lub/a;->Z0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lub/a;->P()V

    return-void

    :cond_1
    invoke-interface {v0}, Lub/a;->y()V

    return-void
.end method

.method public abstract clearAllTables()V
.end method

.method public close()V
    .locals 4

    iget-object v0, p0, Landroidx/room/z0;->closeBarrier:Lkb/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lkb/a;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0

    iget-object v1, v0, Lkb/a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, v0, Lkb/a;->a:Landroidx/room/u0;

    invoke-virtual {v0}, Landroidx/room/u0;->invoke()Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public compileStatement(Ljava/lang/String;)Lub/h;
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotSuspendingTransaction()V

    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v0

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lub/a;->r0(Ljava/lang/String;)Lub/h;

    move-result-object p1

    return-object p1
.end method

.method public createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lmb/a;",
            ">;)",
            "Ljava/util/List<",
            "Lmb/b;",
            ">;"
        }
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/d;

    invoke-static {v2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/room/z0;->getAutoMigrations(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final createConnectionManager$room_runtime(Landroidx/room/g;)Landroidx/room/n0;
    .locals 10

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroidx/room/z0;->createOpenDelegate()Landroidx/room/h1;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/room/g1;
    :try_end_0
    .catch Ll83/j; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Landroidx/room/n0;

    new-instance v1, La6/i;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Landroidx/room/v0;

    invoke-direct {v2, p0}, Landroidx/room/v0;-><init>(Landroidx/room/z0;)V

    invoke-direct {v0, p1, v1, v2}, Landroidx/room/n0;-><init>(Landroidx/room/g;La6/i;Landroidx/room/v0;)V

    goto :goto_1

    :cond_0
    new-instance v1, Landroidx/room/n0;

    new-instance v2, Landroidx/room/w0;

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v3, 0x2

    const-class v5, Landroidx/room/c1;

    const-string v6, "compatTransactionCoroutineExecute"

    const-string v7, "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object v4, p0

    invoke-direct/range {v2 .. v9}, Landroidx/room/w0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v1, p1, v0, v2}, Landroidx/room/n0;-><init>(Landroidx/room/g;Landroidx/room/g1;Landroidx/room/w0;)V

    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method public abstract createInvalidationTracker()Landroidx/room/v;
.end method

.method public createOpenDelegate()Landroidx/room/h1;
    .locals 1

    new-instance v0, Ll83/j;

    invoke-direct {v0}, Ll83/j;-><init>()V

    throw v0
.end method

.method public createOpenHelper(Landroidx/room/g;)Lub/e;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll83/j;

    invoke-direct {p1}, Ll83/j;-><init>()V

    throw p1
.end method

.method public endTransaction()V
    .locals 3
    .annotation runtime Ll83/c;
    .end annotation

    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v0

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    invoke-interface {v0}, Lub/a;->V()V

    invoke-virtual {p0}, Landroidx/room/z0;->inTransaction()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    iget-object v1, v0, Landroidx/room/v;->c:Landroidx/room/i2;

    iget-object v2, v0, Landroidx/room/v;->f:Landroidx/room/r;

    iget-object v0, v0, Landroidx/room/v;->g:Landroidx/room/r;

    invoke-virtual {v1, v2, v0}, Landroidx/room/i2;->e(Lc93/a;Lc93/a;)V

    :cond_0
    return-void
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lmb/a;",
            ">;",
            "Lmb/a;",
            ">;)",
            "Ljava/util/List<",
            "Lmb/b;",
            ">;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final getCloseBarrier$room_runtime()Lkb/a;
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->closeBarrier:Lkb/a;

    return-object v0
.end method

.method public final getCoroutineScope()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->coroutineScope:Lbc3/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "coroutineScope"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getDriver()Ltb/b;
    .locals 2

    iget-object v0, p0, Landroidx/room/z0;->configuration:Landroidx/room/g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/room/g;->t:Ltb/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No SQLiteDriver was configured with Room."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v0, "configuration"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getInvalidationTracker()Landroidx/room/v;
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->internalTracker:Landroidx/room/v;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "internalTracker"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getOpenHelper()Lub/e;
    .locals 2

    iget-object v0, p0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/room/n0;->g:Lub/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v0, "connectionManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Landroidx/room/z0;->configuration:Landroidx/room/g;

    const-string v1, "configuration"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v3, v0, Landroidx/room/g;->b:Ljava/lang/String;

    if-eqz v3, :cond_1

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/room/g;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    return-object v2

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final getQueryContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->coroutineScope:Lbc3/c0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "coroutineScope"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getQueryExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->internalQueryExecutor:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "internalQueryExecutor"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/room/z0;->getRequiredAutoMigrationSpecs()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-static {v2}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getRequiredAutoMigrationSpecs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lmb/a;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Ljava/util/List<",
            "Lj93/d;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/room/z0;->getRequiredTypeConverters()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v4}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    invoke-static {v6}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v3
.end method

.method public final getRequiredTypeConverterClassesMap$room_runtime()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Ljava/util/List<",
            "Lj93/d;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/room/z0;->getRequiredTypeConverterClasses()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequiredTypeConverters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0
.end method

.method public final getSuspendingTransactionContext()Ljava/lang/ThreadLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ThreadLocal<",
            "Lq83/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/z0;->suspendingTransactionContext:Ljava/lang/ThreadLocal;

    return-object v0
.end method

.method public final getTransactionContext$room_runtime()Lq83/j;
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->transactionContext:Lq83/j;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "transactionContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getTransactionExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->internalTransactionExecutor:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "internalTransactionExecutor"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getTypeConverter(Lj93/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj93/d;",
            ")TT;"
        }
    .end annotation

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/room/z0;->typeConverters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getTypeConverter(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Landroidx/room/z0;->typeConverters:Ljava/util/Map;

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getUseTempTrackingTable$room_runtime()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/room/z0;->useTempTrackingTable:Z

    return v0
.end method

.method public final inCompatibilityMode()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/room/n0;->g:Lub/e;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    const-string v0, "connectionManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public inTransaction()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/room/z0;->isOpenInternal$room_runtime()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v0

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    invoke-interface {v0}, Lub/a;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public init(Landroidx/room/g;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "configuration"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Landroidx/room/g;->b:Ljava/lang/String;

    iget-object v3, v1, Landroidx/room/g;->j:Landroid/content/Intent;

    iget-object v4, v1, Landroidx/room/g;->u:Lq83/j;

    iput-object v1, v0, Landroidx/room/z0;->configuration:Landroidx/room/g;

    iget-boolean v5, v1, Landroidx/room/g;->v:Z

    iput-boolean v5, v0, Landroidx/room/z0;->useTempTrackingTable:Z

    invoke-virtual/range {p0 .. p1}, Landroidx/room/z0;->createConnectionManager$room_runtime(Landroidx/room/g;)Landroidx/room/n0;

    move-result-object v5

    iput-object v5, v0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    invoke-virtual {v0}, Landroidx/room/z0;->createInvalidationTracker()Landroidx/room/v;

    move-result-object v5

    iput-object v5, v0, Landroidx/room/z0;->internalTracker:Landroidx/room/v;

    iget-object v5, v1, Landroidx/room/g;->d:Landroidx/room/t0;

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Landroidx/room/z0;->getRequiredAutoMigrationSpecClasses()Ljava/util/Set;

    move-result-object v7

    iget-object v8, v1, Landroidx/room/g;->r:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    new-array v10, v9, [Z

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x1

    const/4 v13, -0x1

    if-eqz v11, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lj93/d;

    move-object v14, v8

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    add-int/2addr v14, v13

    if-ltz v14, :cond_2

    :goto_1
    add-int/lit8 v15, v14, -0x1

    move/from16 v16, v13

    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v11, v13}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    aput-boolean v12, v10, v14

    move v13, v14

    goto :goto_3

    :cond_0
    if-gez v15, :cond_1

    goto :goto_2

    :cond_1
    move v14, v15

    move/from16 v13, v16

    goto :goto_1

    :cond_2
    move/from16 v16, v13

    :goto_2
    move/from16 v13, v16

    :goto_3
    if-ltz v13, :cond_3

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v6, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "A required auto migration spec ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v11}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") is missing in the database configuration."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    move/from16 v16, v13

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ltz v7, :cond_7

    :goto_4
    add-int/lit8 v8, v7, -0x1

    if-ge v7, v9, :cond_6

    aget-boolean v7, v10, v7

    if-eqz v7, :cond_6

    if-gez v8, :cond_5

    goto :goto_5

    :cond_5
    move v7, v8

    goto :goto_4

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_5
    invoke-virtual {v0, v6}, Landroidx/room/z0;->createAutoMigrations(Ljava/util/Map;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lmb/b;

    iget v8, v7, Lmb/b;->startVersion:I

    iget v9, v7, Lmb/b;->endVersion:I

    iget-object v10, v5, Landroidx/room/t0;->a:Ljava/util/LinkedHashMap;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    if-nez v8, :cond_9

    sget-object v8, Lm83/z;->w:Lm83/z;

    :cond_9
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_7

    :cond_a
    const/4 v8, 0x0

    :goto_7
    if-nez v8, :cond_8

    invoke-virtual {v5, v7}, Landroidx/room/t0;->a(Lmb/b;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v0}, Landroidx/room/z0;->getRequiredTypeConverterClassesMap$room_runtime()Ljava/util/Map;

    move-result-object v5

    iget-object v6, v1, Landroidx/room/g;->q:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    new-array v7, v7, [Z

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lj93/d;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lj93/d;

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    if-ltz v11, :cond_f

    :goto_9
    add-int/lit8 v13, v11, -0x1

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v10, v14}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    aput-boolean v12, v7, v11

    goto :goto_b

    :cond_d
    if-gez v13, :cond_e

    goto :goto_a

    :cond_e
    move v11, v13

    goto :goto_9

    :cond_f
    :goto_a
    move/from16 v11, v16

    :goto_b
    if-ltz v11, :cond_10

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroidx/room/z0;->addTypeConverter$room_runtime(Lj93/d;Ljava/lang/Object;)V

    goto :goto_8

    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "A required type converter ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v10}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v9}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is missing in the database configuration."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_11
    move-object v5, v6

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ltz v5, :cond_14

    :goto_c
    add-int/lit8 v8, v5, -0x1

    aget-boolean v9, v7, v5

    if-eqz v9, :cond_13

    if-gez v8, :cond_12

    goto :goto_d

    :cond_12
    move v5, v8

    goto :goto_c

    :cond_13
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unexpected type converter "

    const-string v4, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    invoke-static {v1, v3, v4}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_14
    :goto_d
    const-string v5, "coroutineScope"

    const/4 v6, 0x0

    if-eqz v4, :cond_1b

    sget-object v7, Lq83/e;->w:Lq83/e;

    invoke-interface {v4, v7}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lbc3/z;

    instance-of v8, v7, Lbc3/c1;

    if-eqz v8, :cond_15

    move-object v8, v7

    check-cast v8, Lbc3/c1;

    goto :goto_e

    :cond_15
    move-object v8, v6

    :goto_e
    if-eqz v8, :cond_16

    invoke-virtual {v8}, Lbc3/c1;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v8

    if-nez v8, :cond_17

    :cond_16
    new-instance v8, Lbc3/p0;

    invoke-direct {v8, v7}, Lbc3/p0;-><init>(Lbc3/z;)V

    :cond_17
    iput-object v8, v0, Landroidx/room/z0;->internalQueryExecutor:Ljava/util/concurrent/Executor;

    new-instance v9, Landroidx/room/u1;

    const/4 v10, 0x0

    invoke-direct {v9, v8, v10}, Landroidx/room/u1;-><init>(Ljava/util/concurrent/Executor;I)V

    iput-object v9, v0, Landroidx/room/z0;->internalTransactionExecutor:Ljava/util/concurrent/Executor;

    sget-object v8, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v4, v8}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v8

    check-cast v8, Lbc3/k1;

    new-instance v9, Lbc3/e2;

    invoke-direct {v9, v8}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-interface {v4, v9}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v4

    iput-object v4, v0, Landroidx/room/z0;->coroutineScope:Lbc3/c0;

    invoke-virtual {v0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result v4

    if-eqz v4, :cond_19

    iget-object v4, v0, Landroidx/room/z0;->coroutineScope:Lbc3/c0;

    if-eqz v4, :cond_18

    invoke-interface {v4}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v4

    invoke-virtual {v7, v12}, Lbc3/z;->limitedParallelism(I)Lbc3/z;

    move-result-object v5

    invoke-interface {v4, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    goto :goto_f

    :cond_18
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_19
    iget-object v4, v0, Landroidx/room/z0;->coroutineScope:Lbc3/c0;

    if-eqz v4, :cond_1a

    invoke-interface {v4}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v4

    :goto_f
    iput-object v4, v0, Landroidx/room/z0;->transactionContext:Lq83/j;

    goto :goto_10

    :cond_1a
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_1b
    iget-object v4, v1, Landroidx/room/g;->h:Ljava/util/concurrent/Executor;

    iput-object v4, v0, Landroidx/room/z0;->internalQueryExecutor:Ljava/util/concurrent/Executor;

    new-instance v4, Landroidx/room/u1;

    iget-object v5, v1, Landroidx/room/g;->i:Ljava/util/concurrent/Executor;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v7}, Landroidx/room/u1;-><init>(Ljava/util/concurrent/Executor;I)V

    iput-object v4, v0, Landroidx/room/z0;->internalTransactionExecutor:Ljava/util/concurrent/Executor;

    iget-object v4, v0, Landroidx/room/z0;->internalQueryExecutor:Ljava/util/concurrent/Executor;

    if-eqz v4, :cond_27

    invoke-static {v4}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object v4

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v5

    invoke-virtual {v4, v5}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v4

    iput-object v4, v0, Landroidx/room/z0;->coroutineScope:Lbc3/c0;

    iget-object v4, v4, Lhc3/d;->w:Lq83/j;

    iget-object v5, v0, Landroidx/room/z0;->internalTransactionExecutor:Ljava/util/concurrent/Executor;

    if-eqz v5, :cond_26

    invoke-static {v5}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object v5

    invoke-interface {v4, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    iput-object v4, v0, Landroidx/room/z0;->transactionContext:Lq83/j;

    :goto_10
    iget-boolean v4, v1, Landroidx/room/g;->f:Z

    iput-boolean v4, v0, Landroidx/room/z0;->allowMainThreadQueries:Z

    iget-object v4, v0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    const-string v5, "connectionManager"

    if-eqz v4, :cond_25

    iget-object v4, v4, Landroidx/room/n0;->g:Lub/e;

    if-nez v4, :cond_1d

    :cond_1c
    move-object v4, v6

    goto :goto_12

    :cond_1d
    :goto_11
    instance-of v7, v4, Lnb/c;

    if-eqz v7, :cond_1e

    goto :goto_12

    :cond_1e
    instance-of v7, v4, Landroidx/room/h;

    if-eqz v7, :cond_1c

    check-cast v4, Landroidx/room/h;

    invoke-interface {v4}, Landroidx/room/h;->getDelegate()Lub/e;

    move-result-object v4

    goto :goto_11

    :goto_12
    check-cast v4, Lnb/c;

    iget-object v4, v0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    if-eqz v4, :cond_24

    iget-object v4, v4, Landroidx/room/n0;->g:Lub/e;

    if-nez v4, :cond_1f

    goto :goto_14

    :cond_1f
    :goto_13
    instance-of v5, v4, Lnb/b;

    if-eqz v5, :cond_20

    move-object v6, v4

    goto :goto_14

    :cond_20
    instance-of v5, v4, Landroidx/room/h;

    if-eqz v5, :cond_21

    check-cast v4, Landroidx/room/h;

    invoke-interface {v4}, Landroidx/room/h;->getDelegate()Lub/e;

    move-result-object v4

    goto :goto_13

    :cond_21
    :goto_14
    check-cast v6, Lnb/b;

    if-eqz v3, :cond_23

    if-eqz v2, :cond_22

    invoke-virtual {v0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v4

    iget-object v1, v1, Landroidx/room/g;->a:Landroid/content/Context;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "context"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v4, Landroidx/room/v;->i:Landroid/content/Intent;

    new-instance v3, Landroidx/room/c0;

    invoke-direct {v3, v1, v2, v4}, Landroidx/room/c0;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/v;)V

    iput-object v3, v4, Landroidx/room/v;->j:Landroidx/room/c0;

    return-void

    :cond_22
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    return-void

    :cond_24
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_25
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_26
    const-string v1, "internalTransactionExecutor"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_27
    const-string v1, "internalQueryExecutor"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6
.end method

.method public final internalInitInvalidationTracker(Ltb/a;)V
    .locals 6

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iget-object v1, v0, Landroidx/room/v;->c:Landroidx/room/i2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const-string v2, "PRAGMA query_only"

    invoke-interface {p1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    .line 5
    :try_start_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    .line 6
    invoke-interface {v2}, Ltb/c;->B0()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v4, 0x0

    .line 7
    invoke-static {v2, v4}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    if-nez v3, :cond_1

    .line 8
    const-string v2, "PRAGMA temp_store = MEMORY"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    .line 9
    const-string v2, "PRAGMA recursive_triggers = 1"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    .line 10
    const-string v2, "DROP TABLE IF EXISTS room_table_modification_log"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    .line 11
    iget-boolean v2, v1, Landroidx/room/i2;->d:Z

    if-eqz v2, :cond_0

    .line 12
    const-string v2, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_0

    .line 13
    :cond_0
    const-string v2, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    const-string v3, "TEMP"

    const-string v4, ""

    const/4 v5, 0x0

    .line 14
    invoke-static {v2, v3, v4, v5}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    .line 16
    :goto_0
    iget-object p1, v1, Landroidx/room/i2;->h:Landroidx/room/g0;

    .line 17
    iget-object v1, p1, Landroidx/room/g0;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v2, 0x1

    .line 19
    :try_start_1
    iput-boolean v2, p1, Landroidx/room/g0;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 21
    :cond_1
    :goto_1
    iget-object p1, v0, Landroidx/room/v;->k:Ljava/lang/Object;

    monitor-enter p1

    .line 22
    :try_start_2
    iget-object v1, v0, Landroidx/room/v;->j:Landroidx/room/c0;

    if-eqz v1, :cond_3

    iget-object v0, v0, Landroidx/room/v;->i:Landroid/content/Intent;

    if-eqz v0, :cond_2

    invoke-virtual {v1, v0}, Landroidx/room/c0;->b(Landroid/content/Intent;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_2
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 23
    :cond_3
    :goto_2
    monitor-exit p1

    return-void

    :goto_3
    monitor-exit p1

    throw v0

    :catchall_2
    move-exception p1

    .line 24
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v2, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public internalInitInvalidationTracker(Lub/a;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lwb/a;

    invoke-direct {v0, p1}, Lwb/a;-><init>(Lub/a;)V

    invoke-virtual {p0, v0}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method

.method public final isMainThread$room_runtime()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/room/n0;->h:Lub/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lub/a;->isOpen()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    const-string v0, "connectionManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final isOpenInternal$room_runtime()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/room/n0;->h:Lub/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lub/a;->isOpen()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    const-string v0, "connectionManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final varargs performClear(Z[Ljava/lang/String;)V
    .locals 7

    const-string v0, "tableNames"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotSuspendingTransaction()V

    new-instance v1, Landroidx/room/y0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Landroidx/room/y0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    invoke-static {v1}, Le93/b;->Z(Lc93/m;)Ljava/lang/Object;

    return-void
.end method

.method public query(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;
    .locals 3

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroidx/room/z0;->assertNotMainThread()V

    .line 3
    invoke-virtual {p0}, Landroidx/room/z0;->assertNotSuspendingTransaction()V

    .line 4
    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v0

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    new-instance v1, Lp0/n0;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p1, p2}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lub/a;->l0(Lub/g;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public final query(Lub/g;)Landroid/database/Cursor;
    .locals 2

    .line 1
    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/room/z0;->query$default(Landroidx/room/z0;Lub/g;Landroid/os/CancellationSignal;ILjava/lang/Object;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public query(Lub/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Landroidx/room/z0;->assertNotMainThread()V

    .line 6
    invoke-virtual {p0}, Landroidx/room/z0;->assertNotSuspendingTransaction()V

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v0

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lub/a;->b1(Lub/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object p2

    invoke-interface {p2}, Lub/e;->E0()Lub/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lub/a;->l0(Lub/g;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public runInTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)TV;"
        }
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, La6/l0;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroidx/room/z0;->a(Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public runInTransaction(Ljava/lang/Runnable;)V
    .locals 2

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, La6/l0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroidx/room/z0;->a(Lc93/a;)Ljava/lang/Object;

    return-void
.end method

.method public setTransactionSuccessful()V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    invoke-virtual {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v0

    invoke-interface {v0}, Lub/e;->E0()Lub/a;

    move-result-object v0

    invoke-interface {v0}, Lub/a;->O()V

    return-void
.end method

.method public final setUseTempTrackingTable$room_runtime(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/room/z0;->useTempTrackingTable:Z

    return-void
.end method

.method public final useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(Z",
            "Lc93/m;",
            "Lq83/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/z0;->connectionManager:Landroidx/room/n0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/room/n0;->f:Llb/b;

    invoke-interface {v0, p1, p2, p3}, Llb/b;->A0(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "connectionManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
