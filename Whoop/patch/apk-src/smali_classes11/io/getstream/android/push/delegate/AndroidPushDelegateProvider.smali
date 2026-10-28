.class public final Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u0013\u0010\u0008\u001a\u00020\u0005*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u000cJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013JQ\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u0017\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00162\u0008\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0019\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00162\u0008\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J3\u0010%\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0019\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0016H\u0016\u00a2\u0006\u0004\u0008%\u0010&J=\u0010\'\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0019\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0016H\u0016\u00a2\u0006\u0004\u0008\'\u0010(R\u0014\u0010)\u001a\u00020\r8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;",
        "",
        "Landroid/content/ContentProvider;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "initializeDelegates",
        "Landroid/content/Context;",
        "discoverDelegates",
        "(Landroid/content/Context;)V",
        "Landroid/os/Bundle;",
        "metadata",
        "(Landroid/os/Bundle;)V",
        "",
        "Lio/getstream/android/push/delegate/PushDelegate;",
        "toPushDelegate",
        "(Ljava/lang/String;)Lio/getstream/android/push/delegate/PushDelegate;",
        "",
        "onCreate",
        "()Z",
        "Landroid/net/Uri;",
        "uri",
        "",
        "projection",
        "selection",
        "selectionArgs",
        "sortOrder",
        "Landroid/database/Cursor;",
        "query",
        "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;",
        "getType",
        "(Landroid/net/Uri;)Ljava/lang/String;",
        "Landroid/content/ContentValues;",
        "values",
        "insert",
        "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;",
        "",
        "delete",
        "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I",
        "update",
        "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I",
        "TAG",
        "Ljava/lang/String;",
        "stream-android-push-delegate_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    const-string v0, "Push:Delegate"

    iput-object v0, p0, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;->TAG:Ljava/lang/String;

    return-void
.end method

.method private final discoverDelegates(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getProviderInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;

    move-result-object p1

    const-string v0, "getProviderInfo(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object p1, p1, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "metaData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;->discoverDelegates(Landroid/os/Bundle;)V

    return-void
.end method

.method private final discoverDelegates(Landroid/os/Bundle;)V
    .locals 5

    .line 4
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "keySet(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    .line 7
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "io.getstream.android.push.PushDelegate"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 8
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;->toPushDelegate(Ljava/lang/String;)Lio/getstream/android/push/delegate/PushDelegate;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 13
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-void
.end method

.method private final initializeDelegates()V
    .locals 3

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lz03/a;->a:Lz03/a;

    monitor-enter v1

    :try_start_0
    sget-boolean v2, Lz03/a;->b:Z

    if-nez v2, :cond_0

    invoke-direct {p0, v0}, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;->discoverDelegates(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x1

    sput-boolean v0, Lz03/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw v0

    :cond_1
    return-void
.end method

.method private final toPushDelegate(Ljava/lang/String;)Lio/getstream/android/push/delegate/PushDelegate;
    .locals 6

    const-string v0, "\'"

    const-string v1, "PushDelegate not created for \'"

    const/4 v2, 0x0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-class v4, Lio/getstream/android/push/delegate/PushDelegate;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    :catch_0
    move-exception v3

    goto :goto_2

    :catch_1
    move-exception v3

    goto :goto_3

    :cond_1
    move-object v3, v2

    :goto_1
    instance-of v4, v3, Lio/getstream/android/push/delegate/PushDelegate;

    if-eqz v4, :cond_2

    check-cast v3, Lio/getstream/android/push/delegate/PushDelegate;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :cond_2
    return-object v2

    :goto_2
    iget-object v4, p0, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    :goto_3
    iget-object v4, p0, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_4
    return-object v2
.end method


# virtual methods
.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const-string p2, "uri"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not allowed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    const-string p2, "uri"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onCreate()Z
    .locals 1

    invoke-direct {p0}, Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;->initializeDelegates()V

    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    const-string p2, "uri"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const-string p2, "uri"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
