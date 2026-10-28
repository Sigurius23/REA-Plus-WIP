.class public final Lkb3/d;
.super Lkb3/h;
.source "SourceFile"

# interfaces
.implements Lkb3/l;


# instance fields
.field public final synthetic E:Ldc3/s;

.field public volatile z:Lwe/o;


# direct methods
.method public constructor <init>(Lkb3/k;Lfa3/u;Ldc3/s;)V
    .locals 0

    iput-object p3, p0, Lkb3/d;->E:Ldc3/s;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Lkb3/d;->z:Lwe/o;

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lkb3/d;->e(I)V

    throw p3
.end method

.method public static synthetic a(I)V
    .locals 6

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string v1, "@NotNull method %s.%s must not return null"

    goto :goto_0

    :cond_0
    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    :goto_0
    if-eq p0, v0, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    const/4 v2, 0x3

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5"

    const/4 v4, 0x0

    if-eq p0, v0, :cond_2

    aput-object v3, v2, v4

    goto :goto_2

    :cond_2
    const-string v5, "value"

    aput-object v5, v2, v4

    :goto_2
    const/4 v4, 0x1

    if-eq p0, v0, :cond_3

    const-string v3, "recursionDetected"

    aput-object v3, v2, v4

    goto :goto_3

    :cond_3
    aput-object v3, v2, v4

    :goto_3
    if-eq p0, v0, :cond_4

    goto :goto_4

    :cond_4
    const-string v3, "doPostCompute"

    aput-object v3, v2, v0

    :goto_4
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0
.end method

.method public static synthetic e(I)V
    .locals 7

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v0, :cond_1

    const/4 v2, 0x3

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute"

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq p0, v5, :cond_3

    if-eq p0, v0, :cond_2

    const-string v6, "storageManager"

    aput-object v6, v2, v4

    goto :goto_2

    :cond_2
    aput-object v3, v2, v4

    goto :goto_2

    :cond_3
    const-string v6, "computable"

    aput-object v6, v2, v4

    :goto_2
    if-eq p0, v0, :cond_4

    aput-object v3, v2, v5

    goto :goto_3

    :cond_4
    const-string v3, "invoke"

    aput-object v3, v2, v5

    :goto_3
    if-eq p0, v0, :cond_5

    const-string v3, "<init>"

    aput-object v3, v2, v0

    :cond_5
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_6

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Lwe/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lwe/o;->w:Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iput-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    iput-object v0, p0, Lkb3/d;->z:Lwe/o;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v1, p0, Lkb3/d;->E:Ldc3/s;

    invoke-virtual {v1, p1}, Ldc3/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lkb3/d;->z:Lwe/o;

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :try_start_1
    invoke-static {p1}, Lkb3/d;->a(I)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-object v0, p0, Lkb3/d;->z:Lwe/o;

    throw p1
.end method

.method public final d(Z)Lbd3/k;
    .locals 2

    new-instance p1, Llb3/e;

    sget-object v0, Lnb3/l;->d:Lnb3/i;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p1, v0}, Llb3/e;-><init>(Ljava/util/Collection;)V

    new-instance v0, Lbd3/k;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lbd3/k;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lkb3/d;->z:Lwe/o;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne v1, v2, :cond_1

    iget-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Lwe/o;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No value in this thread (hasValue should be checked before)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-super {p0}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lkb3/d;->e(I)V

    const/4 v0, 0x0

    throw v0
.end method
