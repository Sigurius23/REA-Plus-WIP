.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;",
        "",
        "<init>",
        "()V",
        "stringToSyncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "data",
        "",
        "syncStatusToString",
        "syncStatus",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->Companion:Lio/getstream/chat/android/models/SyncStatus$Companion;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/models/SyncStatus$Companion;->fromInt(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final syncStatusToString(Lio/getstream/chat/android/models/SyncStatus;)I
    .locals 1

    const-string v0, "syncStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/SyncStatus;->getStatus()I

    move-result p1

    return p1
.end method
