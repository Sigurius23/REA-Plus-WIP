.class public final Lt23/i3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lt23/i3;

.field public static volatile b:Lt23/j3;

.field public static final c:Lec3/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt23/i3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt23/i3;->a:Lt23/i3;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    sput-object v0, Lt23/i3;->c:Lec3/h2;

    return-void
.end method

.method public static a()Lt23/j3;
    .locals 2

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StreamVideoBuilder.build() must be called before obtaining StreamVideo instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b()Lt23/j3;
    .locals 1

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    return-object v0
.end method


# virtual methods
.method public final c()V
    .locals 9

    monitor-enter p0

    :try_start_0
    sget-object v0, Lt23/i3;->b:Lt23/j3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lt23/i3;->b:Lt23/j3;

    sget-object v2, Lt23/i3;->c:Lec3/h2;

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<io.getstream.video.android.core.StreamVideo?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lt23/i3;->b:Lt23/j3;

    invoke-virtual {v2, v3}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    monitor-exit p0

    if-nez v0, :cond_1

    return-void

    :cond_1
    check-cast v0, Lt23/b4;

    iget-object v2, v0, Lt23/b4;->Z:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v2, v0, Lt23/b4;->a0:La0/a0;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, La0/a0;->i(I)V

    iget-object v2, v0, Lt23/b4;->x:Lbc3/c0;

    invoke-static {v2, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    iget-object v2, v0, Lt23/b4;->U:Lt23/g1;

    iget-object v2, v2, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/c0;

    iget-object v3, v0, Lt23/b4;->K:Lbi/p;

    if-eqz v2, :cond_2

    iget-object v4, v2, Lt23/c0;->b:Ljava/lang/String;

    if-nez v4, :cond_3

    :cond_2
    const-string v4, "ALL_CALL_TYPES"

    :cond_3
    invoke-virtual {v3, v4}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v3

    iget-boolean v4, v3, Lj43/c;->a:Z

    if-eqz v4, :cond_4

    :try_start_1
    new-instance v4, Lj43/g;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lj43/g;-><init>(I)V

    iget-object v5, v0, Lt23/b4;->w:Landroid/content/Context;

    new-instance v6, Lj43/j;

    invoke-direct {v6, v1, v3}, Lj43/j;-><init>(Lt23/c0;Lj43/c;)V

    invoke-virtual {v4, v5, v6}, Lj43/g;->b(Landroid/content/Context;Lj43/j;)Landroid/content/Intent;

    move-result-object v3

    iget-object v4, v0, Lt23/b4;->w:Landroid/content/Context;

    invoke-virtual {v4, v3}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "SafeCall"

    sget-object v5, Lb23/i;->a:Lb23/i;

    sget-object v5, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v5, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    sget-object v5, Lb23/i;->c:Lb23/j;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Exception occurred: "

    invoke-static {v8, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v4, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    new-instance v3, Lt23/g0;

    sget-object v4, Lt23/g3;->x:Lt23/g3;

    const-string v5, "client-cleanup"

    invoke-direct {v3, v4, v5}, Lt23/g0;-><init>(Lt23/g3;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lt23/c0;->p(Lt23/i0;)V

    :cond_5
    iget-object v2, v0, Lt23/b4;->c0:La33/d;

    iget-object v3, v2, La33/d;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v3, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v3, Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/c0;

    invoke-static {v3, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    iget-object v2, v2, La33/d;->z:Ljava/lang/Object;

    check-cast v2, Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/c1;

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    iget-object v0, v0, Lt23/b4;->S:Lt9/u;

    iget-object v0, v0, Lt9/u;->x:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    iget-object v2, v0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v2, Lbc3/c2;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    iput-object v1, v0, Lb30/m;->E:Ljava/lang/Object;

    iget-object v0, v0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    const-string v2, ""

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
