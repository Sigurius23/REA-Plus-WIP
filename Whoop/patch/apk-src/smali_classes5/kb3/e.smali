.class public final Lkb3/e;
.super Landroidx/lifecycle/h2;
.source "SourceFile"


# instance fields
.field public final synthetic E:I


# direct methods
.method public synthetic constructor <init>(Lkb3/k;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lkb3/e;->E:I

    const/4 p4, 0x1

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/lifecycle/h2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-void
.end method

.method public static synthetic a(I)V
    .locals 8

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x2

    if-eq p0, v0, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq p0, v5, :cond_4

    if-eq p0, v2, :cond_3

    if-eq p0, v0, :cond_2

    const-string v7, "storageManager"

    aput-object v7, v3, v6

    goto :goto_2

    :cond_2
    aput-object v4, v3, v6

    goto :goto_2

    :cond_3
    const-string v7, "computation"

    aput-object v7, v3, v6

    goto :goto_2

    :cond_4
    const-string v7, "map"

    aput-object v7, v3, v6

    :goto_2
    const-string v6, "computeIfAbsent"

    if-eq p0, v0, :cond_5

    aput-object v4, v3, v5

    goto :goto_3

    :cond_5
    aput-object v6, v3, v5

    :goto_3
    if-eq p0, v2, :cond_6

    if-eq p0, v0, :cond_7

    const-string v4, "<init>"

    aput-object v4, v3, v2

    goto :goto_4

    :cond_6
    aput-object v6, v3, v2

    :cond_7
    :goto_4
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lkb3/e;->E:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-super {p0, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull"

    aput-object v1, p1, v0

    const-string v0, "invoke"

    const/4 v1, 0x1

    aput-object v0, p1, v1

    const-string v0, "@NotNull method %s.%s must not return null"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
