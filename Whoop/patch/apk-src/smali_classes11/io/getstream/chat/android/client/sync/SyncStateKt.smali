.class public final Lio/getstream/chat/android/client/sync/SyncStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "stringify",
        "",
        "Lio/getstream/chat/android/client/sync/SyncState;",
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
.method public static final stringify(Lio/getstream/chat/android/client/sync/SyncState;)Ljava/lang/String;
    .locals 7
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getActiveChannelIds()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getLastSyncedAt()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getRawLastSyncedAt()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/sync/SyncState;->getMarkedAllReadAt()Ljava/util/Date;

    move-result-object p0

    const-string v4, "\', activeChannelIds.size="

    const-string v5, ", lastSyncedAt="

    const-string v6, "SyncState(userId=\'"

    invoke-static {v1, v6, v0, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawLastSyncedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", markedAllReadAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, p0, v1}, Lev/n;->k(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
