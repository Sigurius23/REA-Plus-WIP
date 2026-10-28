.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toModel",
        "Lio/getstream/chat/android/client/sync/SyncState;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;",
        "toEntity",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toEntity(Lio/getstream/chat/android/client/sync/SyncState;)Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getActiveChannelIds()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getLastSyncedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getRawLastSyncedAt()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getMarkedAllReadAt()Ljava/util/Date;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;)Lio/getstream/chat/android/client/sync/SyncState;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/sync/SyncState;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;->getActiveChannelIds()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;->getLastSyncedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;->getRawLastSyncedAt()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateEntity;->getMarkedAllReadAt()Ljava/util/Date;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/sync/SyncState;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;)V

    return-object v1
.end method
