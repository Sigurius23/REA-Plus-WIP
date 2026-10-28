.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;",
        "",
        "<init>",
        "()V",
        "INSTANCES",
        "",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
        "getDatabase",
        "context",
        "Landroid/content/Context;",
        "userId",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDatabase(Landroid/content/Context;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;
    .locals 2

    const-string v0, "stream_chat_database_"

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "userId"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->access$getINSTANCES$cp()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Ljc/x;->C(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/p0;

    move-result-object p1

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/room/p0;->p:Z

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/room/p0;->q:Z

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion$getDatabase$1$db$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p1, Landroidx/room/p0;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroidx/room/p0;->b()Landroidx/room/z0;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-static {}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->access$getINSTANCES$cp()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_0
    :goto_0
    invoke-static {}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->access$getINSTANCES$cp()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    const-string p1, "DB not created"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
