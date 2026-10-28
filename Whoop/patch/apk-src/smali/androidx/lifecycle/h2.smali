.class public Landroidx/lifecycle/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Landroidx/lifecycle/h2;->w:I

    iput-object p1, p0, Landroidx/lifecycle/h2;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/h2;->y:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/h2;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(I)V
    .locals 9

    const/4 v0, 0x4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction"

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq p0, v7, :cond_4

    if-eq p0, v3, :cond_3

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_2

    const-string v8, "storageManager"

    aput-object v8, v4, v6

    goto :goto_2

    :cond_2
    aput-object v5, v4, v6

    goto :goto_2

    :cond_3
    const-string v8, "compute"

    aput-object v8, v4, v6

    goto :goto_2

    :cond_4
    const-string v8, "map"

    aput-object v8, v4, v6

    :goto_2
    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_5

    aput-object v5, v4, v7

    goto :goto_3

    :cond_5
    const-string v5, "raceCondition"

    aput-object v5, v4, v7

    goto :goto_3

    :cond_6
    const-string v5, "recursionDetected"

    aput-object v5, v4, v7

    :goto_3
    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    const-string v5, "<init>"

    aput-object v5, v4, v3

    :cond_7
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_8

    if-eq p0, v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;
    .locals 3

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Inconsistent key detected. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lkb3/j;->x:Lkb3/j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is expected, was: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", most probably race condition detected on input "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " under "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/lifecycle/h2;->x:Ljava/lang/Object;

    check-cast p1, Lkb3/k;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lkb3/k;->e(Ljava/lang/AssertionError;)V

    return-object v0
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;
    .locals 3

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Race condition detected on input "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Old value is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " under "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/lifecycle/h2;->x:Ljava/lang/Object;

    check-cast p1, Lkb3/k;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lkb3/k;->e(Ljava/lang/AssertionError;)V

    return-object v0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/AssertionError;
    .locals 3

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to remove "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " under "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/lifecycle/h2;->x:Ljava/lang/Object;

    check-cast p1, Lkb3/k;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lkb3/k;->e(Ljava/lang/AssertionError;)V

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Landroidx/lifecycle/h2;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Landroidx/lifecycle/h2;->x:Ljava/lang/Object;

    check-cast p1, Lp1/d;

    const/4 v0, 0x0

    iput-object v0, p1, Lp1/d;->a:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, Lp1/d;->b:Lbc3/m;

    iget-object p1, p0, Landroidx/lifecycle/h2;->y:Ljava/lang/Object;

    check-cast p1, Lp1/e;

    iget-object v0, p1, Lp1/e;->z:Lx1/a;

    iget-object p1, p0, Landroidx/lifecycle/h2;->z:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/e0;

    iget v1, p1, Lkotlin/jvm/internal/e0;->w:I

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    ushr-int/lit8 v2, p1, 0x1b

    and-int/lit8 v2, v2, 0xf

    if-ne v2, v1, :cond_1

    add-int/lit8 v2, p1, -0x1

    goto :goto_0

    :cond_1
    move v2, p1

    :goto_0
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/h2;->x:Ljava/lang/Object;

    check-cast v0, Lkb3/k;

    iget-object v1, v0, Lkb3/k;->b:Lkb3/a;

    iget-object v2, v0, Lkb3/k;->a:Lkb3/m;

    iget-object v3, p0, Landroidx/lifecycle/h2;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lub3/j;->a:Ljc/a;

    const/4 v6, 0x0

    sget-object v7, Lkb3/j;->x:Lkb3/j;

    if-eqz v4, :cond_2

    if-eq v4, v7, :cond_2

    invoke-static {v4}, Lub3/j;->e(Ljava/lang/Object;)V

    if-ne v4, v5, :cond_b

    move-object v4, v6

    goto :goto_4

    :cond_2
    invoke-interface {v2}, Lkb3/m;->lock()V

    :try_start_0
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v8, 0x3

    const-string v9, ""

    sget-object v10, Lkb3/j;->y:Lkb3/j;

    if-ne v4, v7, :cond_6

    :try_start_1
    invoke-virtual {v0, p1, v9}, Lkb3/k;->d(Ljava/lang/Object;Ljava/lang/String;)Lbd3/k;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-boolean v11, v4, Lbd3/k;->b:Z

    if-nez v11, :cond_4

    iget-object v4, v4, Lbd3/k;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_1
    invoke-interface {v2}, Lkb3/m;->unlock()V

    goto :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_4
    move-object v4, v10

    goto :goto_2

    :cond_5
    :try_start_2
    invoke-static {v8}, Landroidx/lifecycle/h2;->a(I)V

    throw v6

    :cond_6
    :goto_2
    if-ne v4, v10, :cond_8

    invoke-virtual {v0, p1, v9}, Lkb3/k;->d(Ljava/lang/Object;Ljava/lang/String;)Lbd3/k;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-boolean v8, v0, Lbd3/k;->b:Z

    if-nez v8, :cond_8

    iget-object v4, v0, Lbd3/k;->c:Ljava/lang/Object;

    goto :goto_1

    :cond_7
    invoke-static {v8}, Landroidx/lifecycle/h2;->a(I)V

    throw v6

    :cond_8
    if-eqz v4, :cond_9

    invoke-static {v4}, Lub3/j;->e(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v4, v5, :cond_3

    move-object v4, v6

    goto :goto_1

    :cond_9
    :try_start_3
    invoke-virtual {v3, p1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/lifecycle/h2;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_3

    :cond_a
    move-object v5, v4

    :goto_3
    invoke-virtual {v3, p1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_c

    goto :goto_1

    :cond_b
    :goto_4
    return-object v4

    :cond_c
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/h2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object v6

    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v0}, Lub3/j;->d(Ljava/lang/Throwable;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v4, :cond_e

    :try_start_5
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eq v1, v7, :cond_d

    :try_start_6
    invoke-virtual {p0, p1, v1}, Landroidx/lifecycle/h2;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_d
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :catchall_2
    move-exception v0

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/h2;->e(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_e
    if-eq v0, v6, :cond_10

    new-instance v4, Lub3/i;

    invoke-direct {v4, v0}, Lub3/i;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v3, p1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v7, :cond_f

    invoke-virtual {p0, p1, v3}, Landroidx/lifecycle/h2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_10
    :try_start_7
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/h2;->e(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_5
    invoke-interface {v2}, Lkb3/m;->unlock()V

    throw p1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Landroidx/lifecycle/h2;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/i2;

    iget-object v0, p0, Landroidx/lifecycle/h2;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/x;

    iget-object v1, p0, Landroidx/lifecycle/h2;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/w1;

    sget-object v2, Lq83/k;->w:Lq83/k;

    invoke-virtual {v1, v2}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result v3

    if-eqz v3, :cond_11

    new-instance v3, Landroidx/lifecycle/g2;

    const/4 v4, 0x1

    invoke-direct {v3, v0, p1, v4}, Landroidx/lifecycle/g2;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/i2;I)V

    invoke-virtual {v1, v2, v3}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    goto :goto_6

    :cond_11
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
