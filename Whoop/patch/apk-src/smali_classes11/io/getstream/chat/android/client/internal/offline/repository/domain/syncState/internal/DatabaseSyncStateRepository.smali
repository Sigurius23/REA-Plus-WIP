.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;",
        "syncStateDao",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;)V",
        "Lio/getstream/chat/android/client/sync/SyncState;",
        "syncState",
        "Ll83/a0;",
        "insertSyncState",
        "(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;",
        "",
        "userId",
        "selectSyncState",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;",
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


# instance fields
.field private final syncStateDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;)V
    .locals 1

    const-string v0, "syncStateDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;->syncStateDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;->syncStateDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertSyncState(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/sync/SyncState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;->syncStateDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateMapperKt;->toEntity(Lio/getstream/chat/android/client/sync/SyncState;)Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;->insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectSyncState(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/sync/SyncState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;->syncStateDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository$selectSyncState$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;->select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;

    if-eqz p2, :cond_4

    invoke-static {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;)Lio/getstream/chat/android/client/sync/SyncState;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v3
.end method
