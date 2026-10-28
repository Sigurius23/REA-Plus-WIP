.class public final Lp0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/k;
.implements Lpg3/n;
.implements Lub/g;
.implements Ly1/j;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 9

    iput p1, p0, Lp0/n0;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    sget-object v1, Ld0/f;->i:Ld0/f2;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 40
    new-instance v0, Ld0/m;

    .line 41
    iget-object p1, v1, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    .line 42
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ld0/r;

    const-wide/high16 v4, -0x8000000000000000L

    const-wide/high16 v6, -0x8000000000000000L

    const/4 v8, 0x0

    .line 43
    invoke-direct/range {v0 .. v8}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;JJZ)V

    .line 44
    iput-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    return-void

    .line 45
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    return-void

    .line 47
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 48
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance p1, Ljc/b;

    const/16 v0, 0x17

    .line 50
    invoke-direct {p1, v0}, Ljc/b;-><init>(I)V

    .line 51
    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    .line 52
    new-instance p1, La0/a0;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, La0/a0;-><init>(I)V

    iput-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x6 -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lp0/n0;->w:I

    iput-object p2, p0, Lp0/n0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lp0/n0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/GoogleApiAvailability;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lp0/n0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    .line 3
    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le63/e;Lbc3/m;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lp0/n0;->w:I

    const-string v0, "requestData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    .line 37
    iput-object p2, p0, Lp0/n0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lp0/n0;->w:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Los/a;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lp0/n0;->w:I

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    .line 63
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpg3/b0;Lpg3/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lp0/n0;->w:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lp0/n0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqk/b;)V
    .locals 5

    const/4 v0, 0x3

    iput v0, p0, Lp0/n0;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    .line 5
    iget-object v0, p1, Lqk/b;->d:Ljava/io/File;

    .line 6
    invoke-static {v0}, Landroidx/room/c1;->n(Ljava/io/File;)V

    .line 7
    new-instance v1, La3/p;

    .line 8
    iget-object v2, p1, Lqk/b;->e:Ljava/lang/String;

    .line 9
    iget-object p1, p1, Lqk/b;->f:Lfk/a;

    .line 10
    invoke-direct {v1, v0, v2, p1}, La3/p;-><init>(Ljava/io/File;Ljava/lang/String;Lfk/a;)V

    iput-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    .line 11
    iget-object p1, v1, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    .line 12
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :try_start_1
    iget-object v2, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Properties;

    invoke-virtual {v2, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 15
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v2

    .line 16
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v3

    :try_start_4
    invoke-static {v0, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 17
    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 18
    iget-object v1, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Lfk/a;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to load property file with path "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", error stacktrace: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lfk/a;->error(Ljava/lang/String;)V

    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 20
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    .line 21
    :goto_1
    iget-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast p1, La3/p;

    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Lqk/b;

    iget-object v0, v0, Lqk/b;->b:Ljava/lang/String;

    .line 22
    const-string v1, "api_key"

    if-nez v0, :cond_1

    goto :goto_2

    .line 23
    :cond_1
    iget-object v2, p1, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Properties;

    const/4 v3, 0x0

    .line 24
    invoke-virtual {v2, v1, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :goto_2
    const/4 v2, 0x1

    goto :goto_3

    .line 25
    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_3
    if-eqz v2, :cond_3

    goto :goto_5

    .line 26
    :cond_3
    const-string v2, "user_id"

    const-string v3, "device_id"

    const-string v4, "experiment_api_key"

    filled-new-array {v2, v3, v1, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    check-cast v2, Ljava/lang/Iterable;

    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 29
    iget-object v4, p1, La3/p;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/Properties;

    invoke-virtual {v4, v3}, Ljava/util/Properties;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 30
    :cond_4
    invoke-virtual {p1}, La3/p;->L()V

    :goto_5
    if-eqz v0, :cond_5

    .line 31
    invoke-virtual {p1, v1, v0}, La3/p;->I(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public constructor <init>(Lwa3/m;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lp0/n0;->w:I

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iget-object p1, p1, Lwa3/m;->w:Lwa3/j;

    .line 56
    iget-object p1, p1, Lwa3/j;->a:Lwa3/a0;

    .line 57
    invoke-virtual {p1}, Lwa3/a0;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Lwa3/g0;

    invoke-virtual {p1}, Lwa3/g0;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 58
    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    iput-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ly1/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    if-eqz v0, :cond_0

    array-length v0, v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lud3/a1;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Lad3/z;

    iget-object v1, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v1, Lwc3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "loader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lwc3/l;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lad3/c;

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Lts/k;
    .locals 3

    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v1, Lts/g;

    if-eqz v1, :cond_0

    new-instance v1, Lts/k;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v2, Lts/g;

    invoke-direct {v1, v0, v2}, Lts/k;-><init>(ILts/g;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public varargs e([Ljava/lang/Object;)Lt9/n;
    .locals 4

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    move-object v1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :try_start_1
    iget-object v1, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v1, Los/a;

    invoke-virtual {v1}, Los/a;->a()Ljava/lang/reflect/Constructor;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating extension"

    invoke-direct {v1, v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    iget-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    return-object v2

    :cond_1
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt9/n;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    return-object p1

    :catch_2
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected error creating extractor"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public declared-synchronized f()Ljava/util/Map;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public g()Lqk/a;
    .locals 4

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, La3/p;

    iget-object v1, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Properties;

    const-string v2, "user_id"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Properties;

    const-string v2, "device_id"

    invoke-virtual {v0, v2, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lqk/a;

    invoke-direct {v2, v1, v0}, Lqk/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public i(Lub/f;)V
    .locals 1

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lpf/c;->l(Lub/f;[Ljava/lang/Object;)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, La3/p;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    const-string v1, "device_id"

    invoke-virtual {v0, v1, p1}, La3/p;->I(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, La3/p;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    const-string v1, "user_id"

    invoke-virtual {v0, v1, p1}, La3/p;->I(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(I)V
    .locals 2

    const/16 v0, 0x10

    if-lt p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    mul-int/lit8 p1, p1, 0x8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 128-bit or larger are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m(FLy3/c;Lbc3/c0;)V
    .locals 6

    sget v0, Lp0/o0;->a:F

    invoke-interface {p2, v0}, Ly3/c;->q0(F)F

    move-result p2

    cmpg-float p2, p1, p2

    if-gtz p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-static {p2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v2

    :try_start_0
    iget-object v3, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v3, Ld0/m;

    iget-object v3, v3, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iget-object v4, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v4, Lbc3/c2;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v0}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    iget-object v4, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Ld0/m;

    iget-boolean v5, v4, Ld0/m;->F:Z

    if-eqz v5, :cond_3

    sub-float/2addr v3, p1

    const/4 p1, 0x0

    const/16 v5, 0x1e

    invoke-static {v4, v3, p1, v5}, Ld0/f;->m(Ld0/m;FFI)Ld0/m;

    move-result-object p1

    iput-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    new-instance v3, Ld0/m;

    sget-object v4, Ld0/f;->i:Ld0/f2;

    neg-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/16 v5, 0x3c

    invoke-direct {v3, v4, p1, v0, v5}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;I)V

    iput-object v3, p0, Lp0/n0;->y:Ljava/lang/Object;

    :goto_2
    new-instance p1, Lkd/f;

    const/16 v3, 0x17

    invoke-direct {p1, p0, v0, v3}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {p3, v0, v0, p1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2, v2, v1}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :goto_3
    invoke-static {p2, v2, v1}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1
.end method

.method public n(ILwa3/g;)V
    .locals 8

    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    :goto_0
    iget-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/n;

    iget v1, v1, Lwa3/n;->w:I

    if-ge v1, p1, :cond_5

    iget-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/n;

    iget-object v2, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lwa3/j;->c:Lwa3/j;

    iget-object v3, v1, Lwa3/n;->x:Lwa3/o0;

    iget v4, v1, Lwa3/n;->w:I

    iget-boolean v1, v1, Lwa3/n;->y:Z

    const/4 v5, 0x4

    const/4 v6, 0x3

    if-eqz v1, :cond_1

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    sget-object v7, Lwa3/o0;->E:Lwa3/l0;

    if-ne v3, v7, :cond_0

    check-cast v2, Lwa3/v;

    invoke-virtual {p2, v4, v6}, Lwa3/g;->x(II)V

    invoke-interface {v2, p2}, Lwa3/v;->f(Lwa3/g;)V

    invoke-virtual {p2, v4, v5}, Lwa3/g;->x(II)V

    goto :goto_1

    :cond_0
    iget v7, v3, Lwa3/o0;->x:I

    invoke-virtual {p2, v4, v7}, Lwa3/g;->x(II)V

    invoke-static {p2, v3, v2}, Lwa3/j;->k(Lwa3/g;Lwa3/o0;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    sget-object v1, Lwa3/o0;->E:Lwa3/l0;

    if-ne v3, v1, :cond_2

    check-cast v2, Lwa3/v;

    invoke-virtual {p2, v4, v6}, Lwa3/g;->x(II)V

    invoke-interface {v2, p2}, Lwa3/v;->f(Lwa3/g;)V

    invoke-virtual {p2, v4, v5}, Lwa3/g;->x(II)V

    goto :goto_2

    :cond_2
    iget v1, v3, Lwa3/o0;->x:I

    invoke-virtual {p2, v4, v1}, Lwa3/g;->x(II)V

    invoke-static {p2, v3, v2}, Lwa3/j;->k(Lwa3/g;Lwa3/o0;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iput-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    iput-object v1, p0, Lp0/n0;->y:Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public o(Landroid/content/Context;Lcom/google/android/gms/common/api/d;)I
    .locals 5

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static {p2}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-interface {p2}, Lcom/google/android/gms/common/api/d;->b()I

    move-result p2

    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseIntArray;

    monitor-enter v0

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eq v2, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/util/SparseIntArray;

    monitor-enter v2

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    :try_start_1
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v4

    if-le v4, p2, :cond_1

    invoke-virtual {v2, v4}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_1
    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/d;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/common/d;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result v0

    :cond_3
    invoke-virtual {v2, p2, v0}, Landroid/util/SparseIntArray;->put(II)V

    monitor-exit v2

    return v0

    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 4

    iget p1, p0, Lp0/n0;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lbc3/m;->G:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lbc3/n;

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Le63/e;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "suppressed"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object p2

    const/4 v1, 0x0

    aget-object p2, p2, v1

    const-string v1, "suppressed[0]"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    instance-of v1, p2, Ljava/net/SocketTimeoutException;

    if-eqz v1, :cond_5

    move-object v1, p2

    check-cast v1, Ljava/io/IOException;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v2, "connect"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-ne v1, v3, :cond_4

    const-string v1, "request"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/ktor/client/network/sockets/ConnectTimeoutException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Connect timeout has expired [url="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Le63/e;->a:Li63/e0;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", connect_timeout="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, La63/h0;->d:La63/g0;

    invoke-virtual {v0}, Le63/e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La63/f0;

    if-eqz v0, :cond_2

    iget-object v0, v0, La63/f0;->b:Ljava/lang/Long;

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "unknown"

    :cond_3
    const-string v3, " ms]"

    invoke-static {v2, v3, v0}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    check-cast p2, Ljava/net/SocketTimeoutException;

    invoke-direct {v1, v0, p2}, Lio/ktor/client/network/sockets/ConnectTimeoutException;-><init>(Ljava/lang/String;Ljava/net/SocketTimeoutException;)V

    move-object p2, v1

    goto :goto_1

    :cond_4
    check-cast p2, Ljava/net/SocketTimeoutException;

    invoke-static {v0, p2}, Lj93/l0;->e(Le63/e;Ljava/net/SocketTimeoutException;)Lio/ktor/client/network/sockets/SocketTimeoutException;

    move-result-object p2

    :cond_5
    :goto_1
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_2
    return-void

    :pswitch_0
    :try_start_0
    iget-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast p1, Lpg3/h;

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Lpg3/b0;

    invoke-interface {p1, v0, p2}, Lpg3/h;->r(Lpg3/e;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lpg3/e1;->r(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 1

    iget v0, p0, Lp0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lzd3/o;

    iget-boolean p1, p1, Lzd3/o;->R:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast p1, Lpg3/h;

    iget-object v0, p0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Lpg3/b0;

    :try_start_0
    invoke-virtual {v0, p2}, Lpg3/b0;->d(Lud3/x0;)Lpg3/v0;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {p1, v0, p2}, Lpg3/h;->g(Lpg3/e;Lpg3/v0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lpg3/e1;->r(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-static {p2}, Lpg3/e1;->r(Ljava/lang/Throwable;)V

    :try_start_2
    invoke-interface {p1, v0, p2}, Lpg3/h;->r(Lpg3/e;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-static {p1}, Lpg3/e1;->r(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
