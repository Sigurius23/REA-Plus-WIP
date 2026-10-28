.class public Lkb3/i;
.super Lkb3/h;
.source "SourceFile"

# interfaces
.implements Lkb3/l;


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    invoke-super {p0}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x2

    const-string v1, "@NotNull method %s.%s must not return null"

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue"

    const/4 v3, 0x0

    const/4 v4, 0x1

    aput-object v2, v0, v3

    const-string v2, "invoke"

    aput-object v2, v0, v4

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
