.class public final Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/state/sync/internal/SyncHistoryManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ec\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0002\u009e\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0014\u0008\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c\u0012\u0010\u0008\u0002\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008(\u0010\'J\u0010\u0010)\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008+\u0010*J\u0017\u0010/\u001a\u00020%2\u0006\u0010,\u001a\u00020\u001eH\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001e\u00103\u001a\u00020%2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001dH\u0081@\u00a2\u0006\u0004\u00081\u00102J\u0010\u00105\u001a\u00020%H\u0081@\u00a2\u0006\u0004\u00084\u0010*J\u000f\u00106\u001a\u00020%H\u0002\u00a2\u0006\u0004\u00086\u0010\'J\u0010\u00107\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u00087\u0010*J\u0019\u00109\u001a\u00020%2\u0008\u00108\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0004\u00089\u0010:J\u0018\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010%H\u0082@\u00a2\u0006\u0004\u0008>\u0010*J\u0010\u00103\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u00083\u0010*J\"\u0010B\u001a\u00020%2\u0006\u0010@\u001a\u00020?2\u0008\u0010A\u001a\u0004\u0018\u00010\u0002H\u0082@\u00a2\u0006\u0004\u0008B\u0010CJ \u0010E\u001a\u00020%2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010D\u001a\u00020?H\u0082@\u00a2\u0006\u0004\u0008E\u0010FJ\u0010\u0010G\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u0008G\u0010*J\u0010\u0010H\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u0008H\u0010*J$\u0010L\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020K0J2\u0006\u0010I\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008L\u0010MJ&\u0010O\u001a\u00020%2\u0006\u0010I\u001a\u00020\u00102\u000c\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00020KH\u0082@\u00a2\u0006\u0004\u0008O\u0010PJ\u0010\u0010Q\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u0008Q\u0010*J\u0010\u0010R\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u0008R\u0010*J\u0010\u0010S\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u0008S\u0010*J\u001e\u0010V\u001a\u0008\u0012\u0004\u0012\u00020U0J2\u0006\u0010T\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008V\u0010=J\u0010\u0010W\u001a\u00020%H\u0082@\u00a2\u0006\u0004\u0008W\u0010*J\u001c\u0010Y\u001a\u00020%*\u00020\n2\u0006\u0010X\u001a\u00020UH\u0082@\u00a2\u0006\u0004\u0008Y\u0010ZJ(\u0010a\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020`0_2\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]H\u0082@\u00a2\u0006\u0004\u0008a\u0010bJ(\u0010c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020`0_2\u0006\u0010^\u001a\u00020]2\u0006\u0010\\\u001a\u00020[H\u0082@\u00a2\u0006\u0004\u0008c\u0010dJ.\u0010g\u001a\u0008\u0012\u0004\u0012\u00020`0J2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010X\u001a\u00020U2\u0006\u0010f\u001a\u00020eH\u0082@\u00a2\u0006\u0004\u0008g\u0010hJ.\u0010i\u001a\u0008\u0012\u0004\u0012\u00020`0J2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010X\u001a\u00020U2\u0006\u0010f\u001a\u00020eH\u0082@\u00a2\u0006\u0004\u0008i\u0010hJ.\u0010j\u001a\u0008\u0012\u0004\u0012\u00020`0J2\u0006\u0010X\u001a\u00020U2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010f\u001a\u00020eH\u0082@\u00a2\u0006\u0004\u0008j\u0010kJ\u001e\u0010l\u001a\u0008\u0012\u0004\u0012\u00020%0_2\u0006\u0010^\u001a\u00020]H\u0082@\u00a2\u0006\u0004\u0008l\u0010mJ\u001e\u0010n\u001a\u0008\u0012\u0004\u0012\u00020%0_2\u0006\u0010X\u001a\u00020UH\u0082@\u00a2\u0006\u0004\u0008n\u0010oJ\u001f\u0010p\u001a\u00020\u0010*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d0JH\u0002\u00a2\u0006\u0004\u0008p\u0010qJ\u0015\u0010r\u001a\u00020\u0010*\u0004\u0018\u00010?H\u0002\u00a2\u0006\u0004\u0008r\u0010sJ\u0015\u0010t\u001a\u00020\u0010*\u0004\u0018\u00010?H\u0002\u00a2\u0006\u0004\u0008t\u0010sR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010vR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010wR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010xR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010yR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010zR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010{R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010|R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010|R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010}R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010~R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u007fR!\u0010\u001f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001f\u0010\u0080\u0001R\u001d\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\"\u0010\u0081\u0001R!\u0010\u0087\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001R\u001c\u00108\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010 8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u00088\u0010\u0081\u0001R,\u0010\u0095\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d0\u0094\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u008c\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u009d\u0001\u00a8\u0006\u009f\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
        "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncHistoryManager;",
        "",
        "currentUserId",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logicRegistry",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "stateRegistry",
        "",
        "userPresence",
        "isAutomaticSyncOnReconnectEnabled",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "syncMaxThreshold",
        "Lkotlin/Function0;",
        "",
        "now",
        "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;",
        "serverClockOffset",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/core/internal/coroutines/Tube;",
        "",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "events",
        "Lec3/p1;",
        "Lio/getstream/chat/android/client/sync/SyncState;",
        "syncState",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lbc3/c0;Lio/getstream/chat/android/core/internal/coroutines/Tube;Lec3/p1;)V",
        "Ll83/a0;",
        "start",
        "()V",
        "stop",
        "sync",
        "(Lq83/d;)Ljava/lang/Object;",
        "awaitSyncing",
        "event",
        "onEvent$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "onEvent",
        "cids",
        "performSync$stream_chat_android_client_release",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "performSync",
        "retryMessages$stream_chat_android_client_release",
        "retryMessages",
        "scheduleLiveLocationMessageUpdates",
        "syncOfflineDraftMessages",
        "state",
        "setSyncState",
        "(Lio/getstream/chat/android/client/sync/SyncState;)V",
        "userId",
        "onConnectionEstablished",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onConnectionLost",
        "Ljava/util/Date;",
        "latestEventDate",
        "rawLatestEventDate",
        "updateLastSyncedDate",
        "(Ljava/util/Date;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "currentDate",
        "updateAllReadStateForDate",
        "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "retryFailedEntities",
        "restoreActiveChannels",
        "recoverAll",
        "Ln23/h;",
        "",
        "updateActiveQueryChannels",
        "(ZLq83/d;)Ljava/lang/Object;",
        "cidsToExclude",
        "updateActiveChannels",
        "(ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;",
        "retryChannels",
        "retryReactions",
        "retryMessagesWithSyncedAttachments",
        "messageId",
        "Lio/getstream/chat/android/models/Message;",
        "retryDeleteMessageForMe",
        "retryMessagesWithPendingAttachments",
        "message",
        "markMessageAsFailed",
        "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "Lo23/d;",
        "",
        "retryReactionDeletion",
        "(ILio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
        "retryReactionSending",
        "(Lio/getstream/chat/android/models/Reaction;ILq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "channelClient",
        "retryDeletionOfMessageWithSyncedAttachments",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;",
        "retryUpdateOfMessageWithSyncedAttachments",
        "retrySendingOfMessageWithSyncedAttachments",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;",
        "removeReaction",
        "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
        "removeMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "isTooManyEventsToSyncError",
        "(Ln23/h;)Z",
        "exceedsSyncThreshold",
        "(Ljava/util/Date;)Z",
        "exceedsSyncThresholdServerTime",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "Z",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "Lc93/a;",
        "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;",
        "Lio/getstream/chat/android/core/internal/coroutines/Tube;",
        "Lec3/p1;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "syncScope",
        "Lbc3/c0;",
        "Lmc3/a;",
        "entitiesRetryMutex",
        "Lmc3/a;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isFirstConnect",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "eventsDisposable",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;",
        "Lec3/l;",
        "syncedEvents",
        "Lec3/l;",
        "getSyncedEvents",
        "()Lec3/l;",
        "mutex",
        "",
        "Lbc3/k1;",
        "liveLocationJobs",
        "Ljava/util/List;",
        "State",
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
.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final currentUserId:Ljava/lang/String;

.field private final entitiesRetryMutex:Lmc3/a;

.field private final events:Lio/getstream/chat/android/core/internal/coroutines/Tube;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/core/internal/coroutines/Tube<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;>;"
        }
    .end annotation
.end field

.field private eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

.field private final isAutomaticSyncOnReconnectEnabled:Z

.field private final isFirstConnect:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final liveLocationJobs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbc3/k1;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final mutex:Lmc3/a;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

.field private final state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

.field private final syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

.field private final syncScope:Lbc3/c0;

.field private final syncState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final syncedEvents:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final userPresence:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lbc3/c0;Lio/getstream/chat/android/core/internal/coroutines/Tube;Lec3/p1;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
            "Lio/getstream/chat/android/client/api/state/StateRegistry;",
            "ZZ",
            "Lio/getstream/chat/android/models/TimeDuration;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/core/internal/coroutines/Tube<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;>;",
            "Lec3/p1;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    move-object/from16 v8, p12

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move-object/from16 v11, p15

    const-string v12, "currentUserId"

    invoke-static {p1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "chatClient"

    invoke-static {p2, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "clientState"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mutableGlobalState"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "repos"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "logicRegistry"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "stateRegistry"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "syncMaxThreshold"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "now"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "serverClockOffset"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "scope"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "events"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "syncState"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->currentUserId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 4
    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    .line 5
    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    .line 6
    iput-object v3, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    .line 7
    iput-object v4, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    .line 8
    iput-object v5, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    move/from16 p1, p8

    .line 9
    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->userPresence:Z

    move/from16 p1, p9

    .line 10
    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->isAutomaticSyncOnReconnectEnabled:Z

    .line 11
    iput-object v6, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    .line 12
    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    .line 13
    iput-object v8, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    .line 14
    iput-object v10, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->events:Lio/getstream/chat/android/core/internal/coroutines/Tube;

    .line 15
    iput-object v11, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    .line 16
    const-string p1, "Chat:SyncManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logger$delegate:Ll83/h;

    .line 17
    invoke-interface {v9}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    .line 18
    new-instance v0, Lbc3/e2;

    .line 19
    invoke-direct {v0, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    .line 20
    invoke-static {v9, v0}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    .line 21
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$special$$inlined$CoroutineExceptionHandler$1;

    sget-object v1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$special$$inlined$CoroutineExceptionHandler$1;-><init>(Lbc3/a0;Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)V

    .line 22
    invoke-static {p1, v0}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    .line 23
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->entitiesRetryMutex:Lmc3/a;

    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->isFirstConnect:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    sget-object p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;->Idle:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    .line 26
    iput-object v10, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncedEvents:Lec3/l;

    .line 27
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->mutex:Lmc3/a;

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->liveLocationJobs:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lbc3/c0;Lio/getstream/chat/android/core/internal/coroutines/Tube;Lec3/p1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p16

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_0

    .line 29
    new-instance v1, Lio/getstream/chat/android/core/internal/coroutines/Tube;

    invoke-direct {v1}, Lio/getstream/chat/android/core/internal/coroutines/Tube;-><init>()V

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p14

    :goto_0
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 30
    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_1
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    goto :goto_2

    :cond_1
    move-object/from16 v17, p15

    goto :goto_1

    .line 31
    :goto_2
    invoke-direct/range {v2 .. v17}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lbc3/c0;Lio/getstream/chat/android/core/internal/coroutines/Tube;Lec3/p1;)V

    return-void
.end method

.method public static synthetic a(ZLio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveQueryChannels$lambda$56(ZLio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$getCurrentUserId$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->currentUserId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLiveLocationJobs$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->liveLocationJobs:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogicRegistry$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-object p0
.end method

.method public static final synthetic access$getNow$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lc93/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    return-object p0
.end method

.method public static final synthetic access$getRepos$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-object p0
.end method

.method public static final synthetic access$getSyncScope$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lbc3/c0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    return-object p0
.end method

.method public static final synthetic access$getUserPresence$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->userPresence:Z

    return p0
.end method

.method public static final synthetic access$markMessageAsFailed(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->markMessageAsFailed(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onConnectionEstablished(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->onConnectionEstablished(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onConnectionLost(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->onConnectionLost(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performSync(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->performSync(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removeMessage(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removeReaction(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$restoreActiveChannels(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->restoreActiveChannels(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryChannels(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryChannels(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryDeleteMessageForMe(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryDeleteMessageForMe(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryDeletionOfMessageWithSyncedAttachments(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryDeletionOfMessageWithSyncedAttachments(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryFailedEntities(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryFailedEntities(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryMessagesWithPendingAttachments(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryMessagesWithPendingAttachments(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryMessagesWithSyncedAttachments(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryMessagesWithSyncedAttachments(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryReactionDeletion(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;ILio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryReactionDeletion(ILio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryReactionSending(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Reaction;ILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryReactionSending(Lio/getstream/chat/android/models/Reaction;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryReactions(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryReactions(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrySendingOfMessageWithSyncedAttachments(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retrySendingOfMessageWithSyncedAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryUpdateOfMessageWithSyncedAttachments(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryUpdateOfMessageWithSyncedAttachments(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$scheduleLiveLocationMessageUpdates(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->scheduleLiveLocationMessageUpdates()V

    return-void
.end method

.method public static final synthetic access$syncOfflineDraftMessages(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncOfflineDraftMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateActiveChannels(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveChannels(ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateActiveQueryChannels(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveQueryChannels(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateAllReadStateForDate(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateAllReadStateForDate(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateLastSyncedDate(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Ljava/util/Date;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateLastSyncedDate(Ljava/util/Date;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/channel/state/ChannelState;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveChannels$lambda$69(Lio/getstream/chat/android/client/channel/state/ChannelState;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLjava/util/Set;Lio/getstream/chat/android/client/channel/state/ChannelState;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveChannels$lambda$68(ZLjava/util/Set;Lio/getstream/chat/android/client/channel/state/ChannelState;)Z

    move-result p0

    return p0
.end method

.method private final exceedsSyncThreshold(Ljava/util/Date;)Z
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lio/getstream/chat/android/core/utils/date/DateUtils;->diff(Ljava/util/Date;J)Lio/getstream/chat/android/models/TimeDuration;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/models/TimeDuration;->compareTo(Lio/getstream/chat/android/models/TimeDuration;)I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final exceedsSyncThresholdServerTime(Ljava/util/Date;)Z
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->estimatedServerTime()Ljava/util/Date;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/core/utils/date/DateUtils;->diff(Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/models/TimeDuration;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/models/TimeDuration;->compareTo(Lio/getstream/chat/android/models/TimeDuration;)I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final isTooManyEventsToSyncError(Ln23/h;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p1}, Ln23/h;->a()Ln23/e;

    move-result-object p1

    instance-of v0, p1, Ln23/c;

    if-eqz v0, :cond_0

    check-cast p1, Ln23/c;

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/NetworkErrorKt;->isStatusBadRequest(Ln23/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/NetworkErrorKt;->isValidationError(Ln23/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final markMessageAsFailed(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v16, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    new-instance v0, Ljava/util/Date;

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    const v51, 0xffff

    const/16 v52, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const v50, -0x204001

    move-object/from16 v1, p2

    move-object/from16 v23, v0

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-virtual {v1, v0, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final onConnectionEstablished(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "[onConnectionEstablished] syncState: "

    const-string v4, "[onConnectionEstablished] online: "

    const-string v5, "[onConnectionEstablished] >>> userId: "

    instance-of v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;

    if-eqz v6, :cond_0

    move-object v6, v2

    check-cast v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;

    iget v7, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->label:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;

    invoke-direct {v6, v1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v2, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->result:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->label:I

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v8, :cond_5

    if-eq v8, v12, :cond_4

    if-eq v8, v11, :cond_3

    if-eq v8, v10, :cond_2

    if-ne v8, v9, :cond_1

    iget-object v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->Z$0:Z

    iget-object v3, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    :try_start_1
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_5

    :cond_3
    iget-boolean v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->Z$0:Z

    iget-object v3, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    :try_start_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_4

    :cond_4
    iget-boolean v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->Z$0:Z

    iget-object v4, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    :try_start_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v2, v0

    move-object v0, v4

    goto :goto_1

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v8, v2, Lb23/k;->c:Lb23/e;

    iget-object v14, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->z:Lb23/g;

    invoke-interface {v8, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->isFirstConnect:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", isFirstConnect: "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v15, v14, v5, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    sget-object v5, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;->Syncing:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v5}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v2}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result v2

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v5

    iget-object v8, v5, Lb23/k;->c:Lb23/e;

    iget-object v9, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v8, v14, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v14, v9, v4, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iput-object v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    iput-boolean v2, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->Z$0:Z

    iput v12, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->label:I

    invoke-direct {v1, v6}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryFailedEntities(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_8

    goto/16 :goto_6

    :cond_8
    :goto_1
    iget-object v4, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_c

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/client/sync/SyncState;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lio/getstream/chat/android/client/sync/SyncState;->getUserId()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_9
    move-object v4, v13

    :goto_2
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/client/sync/SyncState;

    if-eqz v5, :cond_a

    invoke-static {v5}, Lio/getstream/chat/android/client/sync/SyncStateKt;->stringify(Lio/getstream/chat/android/client/sync/SyncState;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_a
    move-object v5, v13

    :goto_3
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v9, v8, v3, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    new-instance v3, Ljava/util/Date;

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    iput-boolean v2, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->Z$0:Z

    iput v11, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->label:I

    invoke-direct {v1, v0, v3, v6}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateAllReadStateForDate(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_c

    goto :goto_6

    :cond_c
    move v0, v2

    :goto_4
    iget-boolean v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->isAutomaticSyncOnReconnectEnabled:Z

    if-eqz v2, :cond_f

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[onConnectionEstablished] performing sync and restoring active channels"

    invoke-interface {v2, v5, v4, v3, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    iput-object v13, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    iput-boolean v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->Z$0:Z

    iput v10, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->label:I

    invoke-direct {v1, v6}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->performSync(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_e

    goto :goto_6

    :cond_e
    :goto_5
    iput-object v13, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->L$0:Ljava/lang/Object;

    iput-boolean v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->Z$0:Z

    const/4 v0, 0x4

    iput v0, v6, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionEstablished$1;->label:I

    invoke-direct {v1, v6}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->restoreActiveChannels(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_10

    :goto_6
    return-object v7

    :cond_f
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onConnectionEstablished] skipping sync, isAutomaticSyncOnReconnectEnabled=false"

    invoke-interface {v0, v4, v3, v2, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    :goto_7
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    sget-object v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;->Idle:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onConnectionEstablished] <<< completed"

    invoke-interface {v0, v4, v3, v2, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_9

    :goto_8
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[onConnectionEstablished] <<< failed: "

    invoke-static {v3, v0}, Lb9/y;->n(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v5, v4, v0, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final onConnectionLost(Lq83/d;)Ljava/lang/Object;
    .locals 17
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

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "[connectionLost] firstConnect: "

    instance-of v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;

    invoke-direct {v3, v1, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v0, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->label:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v3, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/sync/SyncState;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v5, v0, Lb23/k;->c:Lb23/e;

    iget-object v9, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->isFirstConnect:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v10, v9, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    sget-object v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;->Idle:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lio/getstream/chat/android/client/sync/SyncState;

    if-eqz v9, :cond_7

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveChannelsLogic()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    invoke-interface {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "[connectionLost] activeCids.size: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v10, v5, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    const/16 v15, 0x1d

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lio/getstream/chat/android/client/sync/SyncState;->copy$default(Lio/getstream/chat/android/client/sync/SyncState;Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/sync/SyncState;

    move-result-object v2

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->L$1:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->I$0:I

    iput v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onConnectionLost$1;->label:I

    invoke-virtual {v0, v2, v3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertSyncState(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_6

    return-object v4

    :cond_6
    :goto_2
    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->setSyncState(Lio/getstream/chat/android/client/sync/SyncState;)V

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[connectionLost] syncState saved"

    invoke-interface {v0, v4, v3, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v6

    :cond_7
    return-object v8

    :goto_3
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[connectionLost] failed: "

    invoke-static {v3, v0}, Lb9/y;->n(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v5, v4, v0, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-object v6
.end method

.method private final performSync(Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_8

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->I$0:I

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v4

    goto/16 :goto_6

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v8, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v2, "[performSync] no args"

    invoke-interface {p1, v9, v8, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveChannelsLogic()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {p1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    invoke-interface {v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getCid()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v8, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v2, "[performSync] no active cids found"

    invoke-interface {p1, v9, v8, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->currentUserId:Ljava/lang/String;

    iput v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectSyncState(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_8
    :goto_2
    check-cast p1, Lio/getstream/chat/android/client/sync/SyncState;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lio/getstream/chat/android/client/sync/SyncState;->getActiveChannelIds()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    move-object v2, p1

    goto :goto_5

    :cond_a
    :goto_4
    sget-object p1, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :cond_b
    :goto_5
    move-object v5, v2

    check-cast v5, Ljava/util/List;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->mutex:Lmc3/a;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->label:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_c

    goto :goto_7

    :cond_c
    move v2, v6

    :goto_6
    :try_start_1
    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->L$1:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->I$0:I

    iput v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->I$1:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$1;->label:I

    invoke-virtual {p0, v5, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->performSync$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_d

    :goto_7
    return-object v1

    :cond_d
    move-object v1, p1

    :goto_8
    invoke-interface {v1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    :goto_9
    invoke-interface {v1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method private final removeMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Lo23/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, Lo23/h;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeMessage$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeMessage$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    invoke-direct {p2, v0, v1}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object p2
.end method

.method private final removeReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Lo23/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, Lo23/h;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Reaction;Lq83/d;)V

    invoke-direct {p2, v0, v1}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object p2
.end method

.method private final restoreActiveChannels(Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-ne v2, v6, :cond_1

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->I$0:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->isFirstConnect:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v7, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    xor-int/lit8 v2, p1, 0x1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v8, p1, Lb23/k;->c:Lb23/e;

    iget-object v9, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v8, "[restoreActiveChannels] recoverAll: "

    invoke-static {v8, v2}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1, v10, v9, v8, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->I$0:I

    iput v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->label:I

    invoke-direct {p0, v2, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveQueryChannels(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Ln23/h;

    instance-of v8, p1, Ln23/g;

    if-eqz v8, :cond_8

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v9

    const-string v12, "[restoreActiveChannels] updatedCids.size: "

    invoke-static {v9, v12}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v11, v10, v9, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    if-eqz v2, :cond_7

    move v5, v7

    :cond_7
    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->L$1:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->I$0:I

    iput v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$restoreActiveChannels$1;->label:I

    invoke-direct {p0, v5, p1, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveChannels(ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_2
    return-object v1

    :cond_8
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_a

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "[restoreActiveChannels] failed: "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v5, v2, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    return-object v3

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final retryChannels(Lq83/d;)Ljava/lang/Object;
    .locals 17
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->label:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v10, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$0:I

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$6:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/query/CreateChannelParams;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$5:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/Channel;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$0:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$0:I

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$5:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/Channel;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$0:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$1:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$0:I

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$4:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$2:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$1:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$0:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v16, v10

    move v10, v4

    move/from16 v4, v16

    goto/16 :goto_3

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->label:I

    invoke-static {v1, v9, v2, v10, v11}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannelCidsBySyncNeeded$default(Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_6

    :cond_6
    :goto_1
    check-cast v1, Ljava/util/List;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v10, v4, Lb23/k;->c:Lb23/e;

    iget-object v12, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v10, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    const-string v14, "[retryChannels] cids.size: "

    invoke-static {v10, v14}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v4, v13, v12, v10, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v9

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v12

    iget-object v13, v12, Lb23/k;->c:Lb23/e;

    iget-object v14, v12, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_8

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    const-string v13, "[retryChannels] channel.cid: "

    invoke-static {v13, v10}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12, v15, v14, v13, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object v12, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$3:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$4:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$5:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$6:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$0:I

    iput v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$1:I

    iput v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->label:I

    invoke-virtual {v12, v10, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_9

    goto/16 :goto_6

    :cond_9
    move-object v13, v1

    move-object v1, v12

    move-object v12, v10

    move v10, v9

    :goto_3
    check-cast v1, Lio/getstream/chat/android/models/Channel;

    if-nez v1, :cond_a

    move-object v1, v13

    goto/16 :goto_9

    :cond_a
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCreatedAt()Ljava/util/Date;

    move-result-object v14

    invoke-direct {v0, v14}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->exceedsSyncThreshold(Ljava/util/Date;)Z

    move-result v14

    const-string v15, ")"

    if-eqz v14, :cond_d

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v14, v1, Lb23/k;->c:Lb23/e;

    iget-object v8, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v14, "[retryChannels] outdated channel("

    invoke-static {v14, v12, v15}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v1, v9, v8, v14, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$1:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$3:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$4:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$5:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$1:I

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->label:I

    invoke-virtual {v1, v12, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_c

    goto/16 :goto_6

    :cond_c
    move-object v10, v12

    move-object v12, v13

    :goto_4
    new-instance v1, Ln23/g;

    invoke-direct {v1, v5}, Ln23/g;-><init>(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_d
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v14, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v7, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_e

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    const-string v9, "[retryChannels] sending channel("

    invoke-static {v9, v12, v15}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v7, v14, v9, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/Member;

    new-instance v14, Lio/getstream/chat/android/models/MemberData;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Member;->getExtraData()Ljava/util/Map;

    move-result-object v9

    invoke-direct {v14, v15, v9}, Lio/getstream/chat/android/models/MemberData;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_f
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v7

    new-instance v9, Lio/getstream/chat/android/client/query/CreateChannelParams;

    invoke-direct {v9, v8, v7}, Lio/getstream/chat/android/client/query/CreateChannelParams;-><init>(Ljava/util/List;Ljava/util/Map;)V

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v8, v1, v9}, Lio/getstream/chat/android/client/ChatClient;->createChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;)Lo23/d;

    move-result-object v1

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$1:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$3:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$4:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$5:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->L$6:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->I$1:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryChannels$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    :goto_6
    return-object v3

    :cond_10
    move-object v10, v12

    move-object v12, v13

    :goto_7
    check-cast v1, Ln23/h;

    :goto_8
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v7

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v9, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->x:Lb23/g;

    invoke-interface {v8, v13, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_11

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    instance-of v1, v1, Ln23/g;

    const-string v8, "[retryChannels] result("

    const-string v14, ").isSuccess: "

    invoke-static {v8, v10, v14, v1}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v13, v9, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    move-object v1, v12

    :goto_9
    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    goto/16 :goto_2

    :cond_12
    return-object v5
.end method

.method private final retryDeleteMessageForMe(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[retryDeleteMessageForMe] messageId: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->deleteMessageForMe(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    invoke-interface {p1, p2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final retryDeletionOfMessageWithSyncedAttachments(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/client/channel/ChannelClient;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p4

    iget-object v2, p4, Lb23/k;->c:Lb23/e;

    iget-object v7, p4, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const-string v9, ")"

    if-eqz v2, :cond_5

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    const-string v2, "[retryDeletionOfMessageWithSyncedAttachments] deleting message("

    invoke-static {v2, p1, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p4, v8, v7, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object p4

    invoke-direct {p0, p4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->exceedsSyncThreshold(Ljava/util/Date;)Z

    move-result p4

    if-eqz p4, :cond_9

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p3

    iget-object p4, p3, Lb23/k;->c:Lb23/e;

    iget-object v2, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {p4, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_6

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    const-string p4, "[retryDeletionOfMessageWithSyncedAttachments] outdated deleting("

    invoke-static {p4, p1, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v3, v2, p1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    check-cast p4, Lo23/d;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->label:I

    invoke-interface {p4, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    check-cast p4, Ln23/h;

    return-object p4

    :cond_9
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p3, p1, p2, v5, v6}, Lio/getstream/chat/android/client/channel/ChannelClient;->deleteMessage$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/String;ZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryDeletionOfMessageWithSyncedAttachments$1;->label:I

    invoke-interface {p1, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_a

    :goto_3
    return-object v1

    :cond_a
    :goto_4
    check-cast p4, Ln23/h;

    return-object p4
.end method

.method private final retryFailedEntities(Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$1:I

    iget v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p1, v5

    goto/16 :goto_4

    :catchall_1
    move-exception p1

    move-object v0, v5

    goto/16 :goto_7

    :cond_3
    iget v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$0:I

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lmc3/a;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move p1, v3

    move v3, v2

    move v2, p1

    move-object p1, v6

    goto :goto_3

    :catchall_2
    move-exception p1

    move-object v0, v6

    goto/16 :goto_7

    :cond_4
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$0:I

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lmc3/a;

    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object p1, v7

    goto :goto_1

    :catchall_3
    move-exception p1

    goto/16 :goto_8

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->entitiesRetryMutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$0:I

    iput v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->label:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-ne v2, v1, :cond_6

    goto :goto_5

    :cond_6
    move v2, v3

    :goto_1
    :try_start_5
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v7

    iget-object v9, v7, Lb23/k;->c:Lb23/e;

    iget-object v10, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    const-string v9, "[retryFailedEntities] no args"

    invoke-interface {v7, v11, v10, v9, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_4
    move-exception v0

    move-object v12, v0

    move-object v0, p1

    move-object p1, v12

    goto :goto_7

    :cond_7
    :goto_2
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$1:I

    iput v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryChannels(Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_8

    goto :goto_5

    :cond_8
    move v12, v3

    move v3, v2

    move v2, v12

    :goto_3
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$0:I

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->label:I

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryMessages$stream_chat_android_client_release(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_9

    goto :goto_5

    :cond_9
    :goto_4
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$0:I

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryFailedEntities$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryReactions(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-ne v0, v1, :cond_a

    :goto_5
    return-object v1

    :cond_a
    move-object v0, p1

    :goto_6
    :try_start_6
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[retryFailedEntities] completed"

    invoke-interface {p1, v3, v2, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_b
    :try_start_7
    invoke-interface {v0, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    goto :goto_9

    :goto_7
    invoke-interface {v0, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_8
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[retryFailedEntities] failed: "

    invoke-static {v1, p1}, Lb9/y;->n(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final retryMessagesWithPendingAttachments(Lq83/d;)Ljava/lang/Object;
    .locals 17
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    const-string v5, ")"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$7:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$6:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v13, v6

    goto/16 :goto_a

    :pswitch_1
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_2
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$2:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$1:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/models/Message;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v12, v4

    move v4, v10

    move v10, v9

    move-object v9, v11

    goto/16 :goto_7

    :pswitch_3
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$1:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    move v10, v4

    move v4, v9

    move-object v9, v11

    move-object/from16 v11, v16

    goto/16 :goto_3

    :pswitch_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    invoke-virtual {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessageIdsBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    goto/16 :goto_9

    :cond_1
    :goto_1
    check-cast v1, Ljava/util/List;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v9, v4, Lb23/k;->c:Lb23/e;

    iget-object v10, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    const-string v12, "[retryMessagesWithPendingAttachments] ids.size: "

    invoke-static {v9, v12}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4, v11, v10, v9, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v7

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v9

    iget-object v11, v9, Lb23/k;->c:Lb23/e;

    iget-object v12, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    const-string v11, "[retryMessagesWithPendingAttachments] process message("

    invoke-static {v11, v10, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9, v13, v12, v11, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$6:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$7:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$1:I

    const/4 v11, 0x2

    iput v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    invoke-virtual {v9, v10, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_4

    goto/16 :goto_9

    :cond_4
    move-object v11, v9

    move-object v9, v1

    move-object v1, v11

    move-object v11, v10

    move v10, v7

    :goto_3
    check-cast v1, Lio/getstream/chat/android/models/Message;

    if-nez v1, :cond_5

    move v13, v6

    :goto_4
    move-object v1, v9

    goto/16 :goto_b

    :cond_5
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    instance-of v13, v12, Ljava/util/Collection;

    if-eqz v13, :cond_7

    move-object v13, v12

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_7

    :cond_6
    move v12, v7

    goto :goto_5

    :cond_7
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v13

    instance-of v13, v13, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    if-eqz v13, :cond_8

    move v12, v6

    :goto_5
    if-eqz v12, :cond_b

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v13

    iget-object v14, v13, Lb23/k;->c:Lb23/e;

    iget-object v15, v13, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v14, v7, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_9

    iget-object v13, v13, Lb23/k;->b:Lb23/j;

    const-string v14, "[retryMessagesWithPendingAttachments] marking message("

    const-string v6, ") as failed"

    invoke-static {v14, v11, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v13, v7, v15, v6, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$1:I

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$2:I

    const/4 v7, 0x3

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    invoke-direct {v0, v6, v1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->markMessageAsFailed(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    goto/16 :goto_9

    :cond_a
    :goto_6
    const/4 v13, 0x1

    goto :goto_4

    :cond_b
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v13, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v7, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    const-string v7, "[retryMessagesWithPendingAttachments] sending message("

    invoke-static {v7, v11, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v14, v13, v7, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v6

    invoke-direct {v0, v6}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->exceedsSyncThresholdServerTime(Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v13, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    const-string v7, "[retryMessagesWithPendingAttachments] outdated sending("

    invoke-static {v7, v11, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v14, v13, v7, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$1:I

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$2:I

    const/4 v6, 0x4

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    goto :goto_9

    :cond_e
    :goto_7
    check-cast v1, Lo23/d;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$1:I

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$2:I

    const/4 v6, 0x5

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    check-cast v1, Ln23/h;

    goto :goto_6

    :cond_10
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v6

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/4 v13, 0x1

    invoke-virtual {v11, v7, v6, v1, v13}, Lio/getstream/chat/android/client/ChatClient;->sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lo23/d;

    move-result-object v1

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$6:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->L$7:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$1:I

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->I$2:I

    const/4 v6, 0x6

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithPendingAttachments$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_11

    :goto_9
    return-object v3

    :cond_11
    :goto_a
    check-cast v1, Ln23/h;

    goto/16 :goto_4

    :goto_b
    move v6, v13

    const/4 v7, 0x0

    goto/16 :goto_2

    :cond_12
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final retryMessagesWithSyncedAttachments(Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Message;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Message;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Message;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_3
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Message;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$1:I

    iget v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v12, v5

    move v5, v2

    move v2, v12

    move-object v12, v7

    move-object v7, v6

    move-object v6, v12

    goto/16 :goto_3

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    const/4 v5, 0x1

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessageIdsBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_8

    :cond_1
    :goto_1
    check-cast p1, Ljava/util/List;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const-string v8, "[retryMgsWithSyncedAttachments] ids.size: "

    invoke-static {v5, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v7, v6, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v2, v3

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v5

    iget-object v7, v5, Lb23/k;->c:Lb23/e;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->x:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    const-string v7, "[retryMgsWithSyncedAttachments] message.id: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v9, v8, v7, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$1:I

    const/4 v7, 0x2

    iput v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    invoke-virtual {v5, v6, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto/16 :goto_8

    :cond_4
    move-object v7, v6

    move-object v6, p1

    move-object p1, v5

    move v5, v3

    :goto_3
    check-cast p1, Lio/getstream/chat/android/models/Message;

    if-nez p1, :cond_6

    :cond_5
    :goto_4
    move-object p1, v6

    goto :goto_2

    :cond_6
    iget-object v8, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v8

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedForMe()Z

    move-result v9

    if-nez v9, :cond_8

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$1:I

    const/4 v5, 0x3

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    invoke-direct {p0, v7, p1, v8, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryDeletionOfMessageWithSyncedAttachments(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_7

    goto/16 :goto_8

    :cond_7
    move-object v12, v5

    move-object v5, p1

    move-object p1, v12

    :goto_5
    check-cast p1, Ln23/h;

    goto/16 :goto_a

    :cond_8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedForMe()Z

    move-result v9

    if-eqz v9, :cond_a

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$1:I

    const/4 v5, 0x4

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    invoke-direct {p0, v7, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryDeleteMessageForMe(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_9

    goto :goto_8

    :cond_9
    move-object v12, v5

    move-object v5, p1

    move-object p1, v12

    :goto_6
    check-cast p1, Ln23/h;

    goto :goto_a

    :cond_a
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v9

    if-eqz v9, :cond_c

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    if-eqz v9, :cond_c

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$1:I

    const/4 v5, 0x5

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    invoke-direct {p0, v7, p1, v8, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryUpdateOfMessageWithSyncedAttachments(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_b

    goto :goto_8

    :cond_b
    move-object v12, v5

    move-object v5, p1

    move-object p1, v12

    :goto_7
    check-cast p1, Ln23/h;

    goto :goto_a

    :cond_c
    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$5:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->L$6:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->I$1:I

    const/4 v5, 0x6

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessagesWithSyncedAttachments$1;->label:I

    invoke-direct {p0, p1, v7, v8, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retrySendingOfMessageWithSyncedAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_d

    :goto_8
    return-object v1

    :cond_d
    move-object v12, v5

    move-object v5, p1

    move-object p1, v12

    :goto_9
    check-cast p1, Ln23/h;

    :goto_a
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v7

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v9, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    instance-of p1, p1, Ln23/g;

    const-string v8, "[retryMgsWithSyncedAttachments] result("

    const-string v11, ").isSuccess: "

    invoke-static {v8, v5, v11, p1}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v7, v10, v9, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_4

    :cond_e
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final retryReactionDeletion(ILio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Lo23/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[retryReactionDeletion] reaction("

    const-string v6, ") for messageId: "

    invoke-static {p1, v5, v6, v1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getDeletedAt()Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->exceedsSyncThreshold(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[retryReactionDeletion] outdated deletion("

    const-string v5, ")"

    invoke-static {p1, v1, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v2, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    check-cast p1, Lo23/d;

    return-object p1

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/ChatClient;->deleteReaction$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method private final retryReactionSending(Lio/getstream/chat/android/models/Reaction;ILq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "I",
            "Lq83/d<",
            "-",
            "Lo23/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v5

    const-string v6, "[retryReactionSending] reaction("

    const-string v7, ") for messageId: "

    invoke-static {v6, v1, v7, v5}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->exceedsSyncThreshold(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[retryReactionSending] outdated sending("

    const-string v5, ")"

    invoke-static {p2, v1, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, v3, v2, p2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    check-cast p1, Lo23/d;

    return-object p1

    :cond_3
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getEnforceUnique()Z

    move-result p3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getSkipPush()Z

    move-result v0

    invoke-virtual {p2, p1, p3, v4, v0}, Lio/getstream/chat/android/client/ChatClient;->sendReaction(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method private final retryReactions(Lq83/d;)Ljava/lang/Object;
    .locals 16
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_6

    if-eq v4, v10, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$4:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/Reaction;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$2:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$1:I

    iget v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$4:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/models/Reaction;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$2:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$1:I

    iget v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$4:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/models/Reaction;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$2:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$1:I

    iget v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v13

    goto/16 :goto_3

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    invoke-virtual {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectReactionIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_8

    :cond_7
    :goto_1
    check-cast v1, Ljava/util/List;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v10, v4, Lb23/k;->c:Lb23/e;

    iget-object v12, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v10, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    const-string v14, "[retryReactions] ids.size: "

    invoke-static {v10, v14}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v4, v13, v12, v10, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v5

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v12

    iget-object v13, v12, Lb23/k;->c:Lb23/e;

    iget-object v14, v12, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_9

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    const-string v13, "[retryReactions] process reaction("

    const-string v6, ")"

    invoke-static {v10, v13, v6}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v12, v15, v14, v6, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$3:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$4:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$1:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$2:I

    iput v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    invoke-virtual {v6, v10, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectReactionById(ILq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_a

    goto/16 :goto_8

    :cond_a
    move-object v14, v1

    move v12, v4

    move v4, v5

    move-object v1, v6

    :goto_3
    move-object v13, v1

    check-cast v13, Lio/getstream/chat/android/models/Reaction;

    if-nez v13, :cond_b

    move v4, v12

    move-object v1, v14

    goto/16 :goto_a

    :cond_b
    invoke-virtual {v13}, Lio/getstream/chat/android/models/Reaction;->getDeletedAt()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_d

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$3:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$4:Ljava/lang/Object;

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$1:I

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$2:I

    iput v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    invoke-direct {v0, v10, v13, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryReactionDeletion(ILio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_c

    goto :goto_8

    :cond_c
    :goto_4
    check-cast v1, Lo23/d;

    :goto_5
    move v6, v4

    move v4, v12

    move v12, v10

    move-object v10, v13

    goto :goto_7

    :cond_d
    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$3:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$4:Ljava/lang/Object;

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$1:I

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$2:I

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    invoke-direct {v0, v13, v10, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryReactionSending(Lio/getstream/chat/android/models/Reaction;ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    goto :goto_8

    :cond_e
    :goto_6
    check-cast v1, Lo23/d;

    goto :goto_5

    :goto_7
    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$1:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$3:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->L$4:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$0:I

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$1:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->I$2:I

    const/4 v6, 0x5

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryReactions$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_f

    :goto_8
    return-object v3

    :cond_f
    move-object v12, v14

    :goto_9
    check-cast v1, Ln23/h;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v13

    iget-object v14, v13, Lb23/k;->c:Lb23/e;

    iget-object v15, v13, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v14, v5, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_10

    iget-object v13, v13, Lb23/k;->b:Lb23/j;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v10

    instance-of v1, v1, Ln23/g;

    const-string v14, "[retryReactions] result("

    const-string v6, ").isSuccess: "

    invoke-static {v14, v10, v6, v1}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v5, v15, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    move-object v1, v12

    :goto_a
    const/4 v5, 0x0

    const/4 v6, 0x5

    goto/16 :goto_2

    :cond_11
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private final retrySendingOfMessageWithSyncedAttachments(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;
    .locals 65
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/channel/ChannelClient;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x1

    const/4 v11, 0x2

    const/4 v12, 0x0

    if-eqz v5, :cond_7

    if-eq v5, v10, :cond_6

    if-eq v5, v11, :cond_5

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iget-object v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v3, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    move-object v13, v1

    goto/16 :goto_4

    :cond_5
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_6
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v13, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    const-string v15, ")"

    if-eqz v5, :cond_8

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    const-string v7, "[retrySendingOfMessageWithSyncedAttachments] sending message("

    invoke-static {v7, v5, v15}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v14, v13, v5, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->exceedsSyncThresholdServerTime(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v5, "[retrySendingOfMessageWithSyncedAttachments] outdated sending("

    move-object/from16 v8, p2

    invoke-static {v5, v8, v15}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v7, v6, v5, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v10, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    invoke-direct {v0, v1, v3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_a

    goto/16 :goto_6

    :cond_a
    :goto_2
    check-cast v2, Lo23/d;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v11, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    invoke-interface {v2, v3}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_b

    goto/16 :goto_6

    :cond_b
    :goto_3
    check-cast v2, Ln23/h;

    return-object v2

    :cond_c
    move-object/from16 v2, p3

    invoke-static {v2, v1, v6, v11, v12}, Lio/getstream/chat/android/client/channel/ChannelClient;->sendMessage$default(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lo23/d;

    move-result-object v2

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    invoke-interface {v2, v3}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto/16 :goto_6

    :goto_4
    move-object v1, v2

    check-cast v1, Ln23/h;

    instance-of v5, v1, Ln23/g;

    if-eqz v5, :cond_e

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    sget-object v28, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const v63, 0xffff

    const/16 v64, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, -0x4001

    invoke-static/range {v13 .. v64}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    iput v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->I$0:I

    iput v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    invoke-virtual {v1, v5, v3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_d

    goto :goto_6

    :cond_d
    move-object v1, v2

    :goto_5
    move-object v2, v1

    goto :goto_7

    :cond_e
    instance-of v5, v1, Ln23/f;

    if-eqz v5, :cond_10

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    invoke-static {v1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$3:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->L$4:Ljava/lang/Object;

    iput v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->I$0:I

    const/4 v5, 0x5

    iput v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retrySendingOfMessageWithSyncedAttachments$1;->label:I

    invoke-direct {v0, v1, v13, v3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->markMessageAsFailed(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_d

    :goto_6
    return-object v4

    :cond_f
    :goto_7
    check-cast v2, Ln23/h;

    return-object v2

    :cond_10
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final retryUpdateOfMessageWithSyncedAttachments(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/client/channel/ChannelClient;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p4

    iget-object v2, p4, Lb23/k;->c:Lb23/e;

    iget-object v7, p4, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const-string v9, ")"

    if-eqz v2, :cond_5

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    const-string v2, "[retryUpdateOfMessageWithSyncedAttachments] updating message("

    invoke-static {v2, p1, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p4, v8, v7, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object p4

    invoke-direct {p0, p4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->exceedsSyncThreshold(Ljava/util/Date;)Z

    move-result p4

    if-eqz p4, :cond_9

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p3

    iget-object p4, p3, Lb23/k;->c:Lb23/e;

    iget-object v2, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {p4, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_6

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    const-string p4, "[retryUpdateOfMessageWithSyncedAttachments] outdated updating("

    invoke-static {p4, p1, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v3, v2, p1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    check-cast p4, Lo23/d;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->label:I

    invoke-interface {p4, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    check-cast p4, Ln23/h;

    return-object p4

    :cond_9
    invoke-virtual {p3, p2}, Lio/getstream/chat/android/client/channel/ChannelClient;->updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryUpdateOfMessageWithSyncedAttachments$1;->label:I

    invoke-interface {p1, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_a

    :goto_3
    return-object v1

    :cond_a
    :goto_4
    check-cast p4, Ln23/h;

    return-object p4
.end method

.method private final scheduleLiveLocationMessageUpdates()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[scheduleLiveLocationMessageUpdates] no args"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getActiveLiveLocations()Lec3/f2;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;

    invoke-direct {v1, p0, v4}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    invoke-static {v2, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private final setSyncState(Lio/getstream/chat/android/client/sync/SyncState;)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/sync/SyncStateKt;->stringify(Lio/getstream/chat/android/client/sync/SyncState;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    const-string v5, "[setSyncState] state: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method private final syncOfflineDraftMessages(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$syncOfflineDraftMessages$1;->label:I

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectDraftMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->updateDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_2

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final updateActiveChannels(ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v11, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v9, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$3:I

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$2:I

    iget v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$1:I

    iget v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$0:I

    iget-boolean v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iget-boolean v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$18:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$17:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$16:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$15:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$13:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$12:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$11:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$10:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$9:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$8:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$7:Ljava/lang/Object;

    check-cast v14, Lq83/d;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$6:Ljava/lang/Object;

    check-cast v14, Ln23/h;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$5:Ljava/lang/Object;

    check-cast v14, Ln23/h;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$4:Ljava/lang/Object;

    check-cast v15, Ln23/h;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/models/FilterObject;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    check-cast v15, Ljava/util/Set;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v2, v5

    move/from16 v16, v6

    move-object/from16 v28, v11

    move-object v15, v14

    const/16 v17, 0x0

    move v11, v8

    move-object v14, v13

    move-object v8, v3

    move v3, v7

    move v13, v12

    move v12, v9

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$2:I

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$1:I

    iget v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$0:I

    iget-boolean v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iget-boolean v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iget-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$9:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$8:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$7:Ljava/lang/Object;

    check-cast v13, Lq83/d;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$6:Ljava/lang/Object;

    check-cast v13, Ln23/h;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$5:Ljava/lang/Object;

    check-cast v13, Ln23/h;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$4:Ljava/lang/Object;

    check-cast v14, Ln23/h;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/FilterObject;

    iget-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    check-cast v15, Ljava/util/Set;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$3:I

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$2:I

    iget v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$1:I

    iget v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$0:I

    iget-boolean v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iget-boolean v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$14:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$13:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/models/Channel;

    iget-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$11:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    iget-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$10:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$9:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$8:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$7:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$6:Ljava/lang/Object;

    check-cast v7, Ln23/h;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$5:Ljava/lang/Object;

    check-cast v7, Ln23/h;

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$4:Ljava/lang/Object;

    check-cast v8, Ln23/h;

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/models/FilterObject;

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v10, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/Set;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v2, v1

    move v1, v5

    move v5, v9

    move v9, v14

    move-object v14, v8

    move v8, v13

    move-object v13, v7

    move v7, v12

    move-object v12, v6

    const/4 v6, 0x2

    goto/16 :goto_4

    :cond_4
    iget-boolean v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iget-boolean v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iget-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/FilterObject;

    iget-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/util/Set;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v30, v2

    move v2, v1

    move v1, v5

    move-object/from16 v5, v30

    goto/16 :goto_1

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v2}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result v2

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v7, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-interface/range {p2 .. p2}, Ljava/util/Set;->size()I

    move-result v6

    const-string v10, ", online: "

    const-string v12, ", cidsToExclude.size: "

    const-string v13, "[updateActiveChannels] recoverAll: "

    invoke-static {v13, v10, v12, v1, v2}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v8, v7, v6, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/api/state/StateRegistry;->getActiveChannelStates$stream_chat_android_client_release()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v5

    new-instance v6, Las1/f;

    const/4 v7, 0x5

    move-object/from16 v8, p2

    invoke-direct {v6, v1, v8, v7}, Las1/f;-><init>(ZLjava/lang/Object;I)V

    invoke-static {v5, v6}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v5

    const/16 v6, 0x1e

    invoke-static {v5, v6}, Lxb3/k;->D(Lxb3/i;I)Lxb3/i;

    move-result-object v5

    new-instance v6, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v7, 0x8

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v5, v6}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v5

    invoke-static {v5}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v5

    iget-object v7, v5, Lb23/k;->c:Lb23/e;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v7, v10, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    const-string v12, "[updateActiveChannels] missingCids.size: "

    invoke-static {v7, v12}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v10, v8, v7, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_16

    if-nez v2, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v5, "cid"

    invoke-static {v5, v6}, Lio/getstream/chat/android/models/Filters;->in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v19

    new-instance v18, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    const/16 v28, 0x1f8

    const/16 v29, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1e

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v18 .. v29}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v18

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v7

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v12, v7, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v10, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v13, "[updateActiveChannels] request: "

    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v10, v12, v8, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/ChatClient;->queryChannelsInternal(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object v5

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    iput-boolean v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iput-boolean v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iput v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    invoke-interface {v5, v3}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_a

    goto/16 :goto_8

    :cond_a
    :goto_1
    check-cast v5, Ln23/h;

    instance-of v7, v5, Ln23/g;

    if-nez v7, :cond_c

    instance-of v8, v5, Ln23/f;

    if-eqz v8, :cond_b

    move-object v8, v5

    check-cast v8, Ln23/f;

    iget-object v8, v8, Ln23/f;->a:Ln23/e;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v12, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->F:Lb23/g;

    invoke-interface {v10, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_c

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v14, "[updateActiveChannels] request failed: "

    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v13, v12, v8, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_c
    :goto_2
    if-eqz v7, :cond_14

    move-object v7, v5

    check-cast v7, Ln23/g;

    iget-object v7, v7, Ln23/g;->a:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {v7}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object v7

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v12, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    const-string v13, "[updateActiveChannels] request completed; foundChannels.size: "

    invoke-static {v9, v13}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v12, v10, v9, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    move-object v8, v7

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v9, v1

    move-object v13, v5

    move-object v14, v6

    move-object v12, v7

    move-object v15, v8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move v8, v2

    const/4 v2, 0x0

    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v19, v6

    check-cast v19, Lio/getstream/chat/android/models/Channel;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual/range {v19 .. v19}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v19 .. v19}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v10, v11}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v18

    invoke-virtual/range {v19 .. v19}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v20

    const/4 v6, 0x0

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$4:Ljava/lang/Object;

    iput-object v13, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$5:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$6:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$7:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$8:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$9:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$10:Ljava/lang/Object;

    iput-object v15, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$11:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$12:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$13:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$14:Ljava/lang/Object;

    iput-boolean v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iput-boolean v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iput v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$0:I

    iput v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$1:I

    iput v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$2:I

    iput v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$3:I

    const/4 v6, 0x0

    iput v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$4:I

    const/4 v6, 0x2

    iput v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x3c

    const/16 v27, 0x0

    move-object/from16 v25, v3

    invoke-static/range {v18 .. v27}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->updateDataForChannel$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v10, v25

    if-ne v3, v4, :cond_e

    goto/16 :goto_8

    :cond_e
    move-object v3, v10

    :goto_4
    const/4 v11, 0x0

    goto :goto_3

    :cond_f
    move-object v10, v3

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-object v3, v12

    check-cast v3, Ljava/util/Collection;

    const/4 v6, 0x0

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    iput-object v14, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$4:Ljava/lang/Object;

    iput-object v13, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$5:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$6:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$7:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$8:Ljava/lang/Object;

    iput-object v12, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$9:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$10:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$11:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$12:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$13:Ljava/lang/Object;

    iput-object v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$14:Ljava/lang/Object;

    iput-boolean v9, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iput-boolean v8, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iput v7, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$0:I

    iput v5, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$1:I

    iput v1, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$2:I

    const/4 v6, 0x3

    iput v6, v10, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    invoke-virtual {v2, v3, v10}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->storeStateForChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_10

    goto/16 :goto_8

    :cond_10
    move-object v3, v10

    :goto_5
    check-cast v12, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v12, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_11
    check-cast v14, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v14, v2}, Lm83/s;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v6

    iget-object v10, v6, Lb23/k;->c:Lb23/e;

    iget-object v11, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_12

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v10

    const-string v14, "[updateActiveChannels] stillMissingCids.size: "

    invoke-static {v10, v14}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v14, 0x0

    invoke-interface {v6, v12, v11, v10, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v14, v2

    move v11, v7

    move v12, v8

    move-object v15, v13

    move v2, v1

    move-object v8, v3

    move v3, v5

    move v13, v9

    const/4 v1, 0x0

    :cond_13
    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v5

    iget-object v6, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v7, v6, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v5

    iget-boolean v7, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->userPresence:Z

    const/4 v6, 0x0

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$0:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$1:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$2:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$3:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$4:Ljava/lang/Object;

    iput-object v15, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$5:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$6:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$7:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$8:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$9:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$10:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$11:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$12:Ljava/lang/Object;

    iput-object v14, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$13:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$14:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$15:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$16:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$17:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->L$18:Ljava/lang/Object;

    iput-boolean v13, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$0:Z

    iput-boolean v12, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->Z$1:Z

    iput v11, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$0:I

    iput v3, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$1:I

    iput v2, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$2:I

    iput v1, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$3:I

    const/4 v9, 0x0

    iput v9, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->I$4:I

    const/4 v10, 0x4

    iput v10, v8, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    move-object/from16 v28, v6

    const/4 v6, 0x0

    move/from16 v17, v9

    const/4 v9, 0x1

    move/from16 v16, v10

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->watch$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;IZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_13

    :goto_8
    return-object v4

    :cond_14
    instance-of v1, v5, Ln23/f;

    if-eqz v1, :cond_15

    goto :goto_9

    :cond_15
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_16
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private static final updateActiveChannels$lambda$68(ZLjava/util/Set;Lio/getstream/chat/android/client/channel/state/ChannelState;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getRecoveryNeeded()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p0, :cond_1

    :cond_0
    invoke-interface {p2}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getCid()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final updateActiveChannels$lambda$69(Lio/getstream/chat/android/client/channel/state/ChannelState;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getCid()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final updateActiveQueryChannels(ZLq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->label:I

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->I$0:I

    iget-boolean v5, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->Z$0:Z

    iget-object v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$6:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    iget-object v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/util/Set;

    iget-object v11, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v12, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v3

    move v3, v1

    move v1, v5

    move-object v5, v6

    const/4 v6, 0x0

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v9, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v5, "[updateActiveQueryChannels] recoverAll: "

    invoke-static {v5, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v10, v9, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryChannelsLogic()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v2

    new-instance v5, Lb30/x4;

    const/4 v9, 0x6

    invoke-direct {v5, v1, v9}, Lb30/x4;-><init>(ZI)V

    invoke-static {v2, v5}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v2

    const/4 v5, 0x3

    invoke-static {v2, v5}, Lxb3/k;->D(Lxb3/i;I)Lxb3/i;

    move-result-object v2

    invoke-static {v2}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    const-string v9, "[updateActiveQueryChannels] queryLogicsToRestore.size: "

    if-eqz v5, :cond_5

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v5, v4, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance v1, Ln23/g;

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_5
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v5

    iget-object v10, v5, Lb23/k;->c:Lb23/e;

    iget-object v11, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v10

    invoke-static {v10, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v5, v12, v11, v9, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    new-instance v5, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v11, v5

    move-object v10, v9

    move-object v9, v2

    const/4 v2, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v12

    iget-object v13, v12, Lb23/k;->c:Lb23/e;

    iget-object v14, v12, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_7

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getIdentifier$stream_chat_android_client_release()Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    move-result-object v13

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v6, "[updateActiveQueryChannels] queryLogic.identifier: "

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v12, v15, v14, v6, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iput-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$0:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$1:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$2:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$4:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$5:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->L$6:Ljava/lang/Object;

    iput-boolean v1, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->Z$0:Z

    iput v2, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->I$0:I

    const/4 v6, 0x0

    iput v6, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->I$1:I

    const/4 v7, 0x1

    iput v7, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveQueryChannels$1;->label:I

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryFirstPage$stream_chat_android_client_release(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_8

    return-object v4

    :cond_8
    move-object/from16 v16, v3

    move v3, v2

    move-object v2, v5

    move-object/from16 v5, v16

    :goto_2
    check-cast v2, Ln23/h;

    instance-of v12, v2, Ln23/g;

    if-nez v12, :cond_b

    instance-of v13, v2, Ln23/f;

    if-eqz v13, :cond_a

    move-object v13, v2

    check-cast v13, Ln23/f;

    iget-object v13, v13, Ln23/f;->a:Ln23/e;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v14

    iget-object v15, v14, Lb23/k;->c:Lb23/e;

    iget-object v6, v14, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->F:Lb23/g;

    invoke-interface {v15, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_9

    iget-object v14, v14, Lb23/k;->b:Lb23/j;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v8, "[updateActiveQueryChannels] request failed: "

    invoke-direct {v15, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v15, 0x0

    invoke-interface {v14, v7, v6, v8, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {v11, v13}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_3

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_b
    :goto_3
    if-eqz v12, :cond_f

    check-cast v2, Ln23/g;

    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v8, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v7, v12, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    const-string v13, "[updateActiveQueryChannels] request completed; foundChannels.size: "

    invoke-static {v7, v13}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v15, 0x0

    invoke-interface {v6, v12, v8, v7, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_d
    invoke-interface {v10, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v6, v2, Lb23/k;->c:Lb23/e;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {v10}, Ljava/util/Set;->size()I

    move-result v6

    const-string v12, "[updateActiveQueryChannels] updatedCids.size: "

    invoke-static {v6, v12}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v15, 0x0

    invoke-interface {v2, v8, v7, v6, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_e
    const/4 v15, 0x0

    goto :goto_5

    :cond_f
    const/4 v15, 0x0

    instance-of v2, v2, Ln23/f;

    if-eqz v2, :cond_10

    :goto_5
    move v2, v3

    move-object v3, v5

    move-object v8, v15

    const/4 v7, 0x1

    goto/16 :goto_1

    :cond_10
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_11
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln23/e;

    if-nez v1, :cond_12

    new-instance v1, Ln23/g;

    invoke-direct {v1, v10}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_12
    new-instance v2, Ln23/f;

    invoke-direct {v2, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v2
.end method

.method private static final updateActiveQueryChannels$lambda$56(ZLio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;)Z
    .locals 1

    const-string v0, "queryChannelsLogic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->recoveryNeeded$stream_chat_android_client_release()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private final updateAllReadStateForDate(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;

    iget v5, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->label:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;

    invoke-direct {v4, v0, v3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v3, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->result:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->label:I

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v6, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    iget-object v1, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v1, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v20, v2

    move-object v2, v1

    move-object/from16 v1, v20

    goto :goto_1

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->currentUserId:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "[updateAllReadStateForDate] rejected (userId mismatch): "

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " != "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v6, v5, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object v7

    :cond_5
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v6, v3, Lb23/k;->c:Lb23/e;

    iget-object v11, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v13, "[updateAllReadStateForDate] userId: "

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", currentDate: "

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v12, v11, v6, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$0:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$1:Ljava/lang/Object;

    iput v9, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->label:I

    invoke-virtual {v3, v1, v4}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectSyncState(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    move-object v11, v3

    check-cast v11, Lio/getstream/chat/android/client/sync/SyncState;

    if-eqz v11, :cond_c

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v6, v3, Lb23/k;->c:Lb23/e;

    iget-object v9, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v6, v12, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v11}, Lio/getstream/chat/android/client/sync/SyncState;->getActiveChannelIds()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const-string v13, "[updateAllReadStateForDate] selectedState.activeCids.zie: "

    invoke-static {v6, v13}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v12, v9, v6, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v11}, Lio/getstream/chat/android/client/sync/SyncState;->getMarkedAllReadAt()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3, v2}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_2

    :cond_9
    move-object v3, v10

    :goto_2
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const/16 v17, 0xf

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v11 .. v18}, Lio/getstream/chat/android/client/sync/SyncState;->copy$default(Lio/getstream/chat/android/client/sync/SyncState;Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/sync/SyncState;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$0:Ljava/lang/Object;

    iput-object v10, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$1:Ljava/lang/Object;

    iput-object v10, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$2:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$3:Ljava/lang/Object;

    iput-object v10, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->L$4:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->I$0:I

    iput v6, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->I$1:I

    iput v8, v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateAllReadStateForDate$1;->label:I

    invoke-virtual {v3, v2, v4}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertSyncState(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_a

    :goto_3
    return-object v5

    :cond_a
    move-object/from16 v20, v2

    move-object v2, v1

    move-object/from16 v1, v20

    :goto_4
    move-object v11, v1

    move-object v1, v2

    :cond_b
    if-nez v11, :cond_d

    :cond_c
    move-object v13, v1

    new-instance v12, Lio/getstream/chat/android/client/sync/SyncState;

    const/16 v18, 0x1e

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lio/getstream/chat/android/client/sync/SyncState;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v12

    :cond_d
    invoke-direct {v0, v11}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->setSyncState(Lio/getstream/chat/android/client/sync/SyncState;)V

    return-object v7
.end method

.method private final updateLastSyncedDate(Ljava/util/Date;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->label:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v7, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "[updateLastSyncedDate] latestEventDate: "

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v13, p1

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, ", rawLatestEventDate: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, p2

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v8, v7, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    :goto_1
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lio/getstream/chat/android/client/sync/SyncState;

    if-eqz v10, :cond_5

    const/16 v16, 0x13

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lio/getstream/chat/android/client/sync/SyncState;->copy$default(Lio/getstream/chat/android/client/sync/SyncState;Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/sync/SyncState;

    move-result-object v1

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$0:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$1:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$2:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->L$3:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateLastSyncedDate$1;->label:I

    invoke-virtual {v4, v1, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertSyncState(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    return-object v3

    :cond_4
    move-object v3, v1

    :goto_2
    invoke-direct {v0, v3}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->setSyncState(Lio/getstream/chat/android/client/sync/SyncState;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[updateLastSyncedDate] saved"

    invoke-interface {v1, v4, v3, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method


# virtual methods
.method public final awaitSyncing(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;->label:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;->Idle:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;

    if-ne p1, v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v6, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v2, "[awaitSyncing] no args"

    invoke-interface {p1, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    new-instance v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$3;

    const/4 v6, 0x2

    invoke-direct {v2, v6, v3}, Ls83/i;-><init>(ILq83/d;)V

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$awaitSyncing$1;->label:I

    invoke-static {p1, v2, v0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[awaitSyncing] completed"

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    return-object v4
.end method

.method public final getSyncedEvents()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncedEvents:Lec3/l;

    return-object v0
.end method

.method public final onEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/client/events/ConnectingEvent;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$1;

    invoke-direct {v0, p0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ConnectedEvent;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;

    invoke-direct {v0, p0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/DisconnectedEvent;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$3;

    invoke-direct {v0, p0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$3;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/events/HealthEvent;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$4;

    invoke-direct {v0, p0, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$4;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$5;

    invoke-direct {v3, p0, p1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$5;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_4
    return-void
.end method

.method public final performSync$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$9:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$8:Ljava/lang/Object;

    check-cast v3, Ljava/util/Date;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$7:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$6:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/Date;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_1
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->I$0:I

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$13:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$11:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$10:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$9:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$8:Ljava/lang/Object;

    check-cast v10, Ljava/util/Date;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$7:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$6:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    check-cast v11, Ln23/h;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    const/4 v12, 0x0

    goto/16 :goto_a

    :pswitch_2
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$9:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$8:Ljava/lang/Object;

    check-cast v8, Ljava/util/Date;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$7:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$6:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    check-cast v9, Ln23/h;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/util/Date;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/Date;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :pswitch_4
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/util/Date;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_5
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/util/Date;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/sync/SyncState;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_6
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v8, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    const-string v10, "[performSync] cids.size: "

    const-string v11, " "

    invoke-static {v4, v10, v11}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v9, v8, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[performSync] rejected (cids is empty)"

    invoke-interface {v1, v4, v3, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v6

    :cond_3
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/sync/SyncState;

    if-nez v1, :cond_5

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->currentUserId:Ljava/lang/String;

    move-object/from16 v8, p1

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    invoke-virtual {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectSyncState(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_c

    :cond_4
    move-object v4, v8

    :goto_1
    check-cast v1, Lio/getstream/chat/android/client/sync/SyncState;

    goto :goto_2

    :cond_5
    move-object/from16 v8, p1

    move-object v4, v8

    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/client/sync/SyncState;->getLastSyncedAt()Ljava/util/Date;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    new-instance v8, Ljava/util/Date;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    invoke-interface {v9}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lio/getstream/chat/android/client/sync/SyncState;->getRawLastSyncedAt()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_8
    move-object v1, v7

    :goto_3
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v11, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v13, "[performSync] lastSyncAt: "

    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ", rawLastSyncAt: "

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v12, v11, v10, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    check-cast v4, Ljava/lang/Iterable;

    const/16 v9, 0x64

    invoke-static {v4, v9}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    if-eqz v1, :cond_b

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v8, v4, v1}, Lio/getstream/chat/android/client/ChatClient;->getSyncHistory(Ljava/util/List;Ljava/lang/String;)Lo23/d;

    move-result-object v4

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    const/4 v8, 0x2

    iput v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    invoke-interface {v4, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_a

    goto/16 :goto_c

    :cond_a
    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    :goto_4
    check-cast v1, Ln23/h;

    :goto_5
    move-object v9, v4

    goto :goto_7

    :cond_b
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v9, v4, v8}, Lio/getstream/chat/android/client/ChatClient;->getSyncHistory(Ljava/util/List;Ljava/util/Date;)Lo23/d;

    move-result-object v4

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    const/4 v8, 0x3

    iput v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    check-cast v4, Lo23/k;

    invoke-virtual {v4, v2}, Lo23/k;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_c

    goto/16 :goto_c

    :cond_c
    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    :goto_6
    check-cast v1, Ln23/h;

    goto :goto_5

    :goto_7
    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->isTooManyEventsToSyncError(Ln23/h;)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->F:Lb23/g;

    invoke-interface {v5, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "[performSync] failed (too many events to sync): "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v9, v8, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    new-instance v1, Ljava/util/Date;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-direct {v1, v4, v5}, Ljava/util/Date;-><init>(J)V

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    invoke-direct {v0, v1, v7, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateLastSyncedDate(Ljava/util/Date;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1b

    goto/16 :goto_c

    :cond_e
    instance-of v4, v1, Ln23/g;

    if-nez v4, :cond_f

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1b

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "[performSync] failed("

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v5, v4, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v6

    :cond_f
    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$$inlined$sortedBy$1;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v4}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v10, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    const-string v12, "[performSync] succeed; events.size: "

    invoke-static {v4, v12}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v11, v10, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    invoke-static {v8}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/events/ChatEvent;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChatEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    if-nez v4, :cond_12

    :cond_11
    new-instance v4, Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->now:Lc93/a;

    invoke-interface {v10}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    invoke-direct {v4, v10, v11}, Ljava/util/Date;-><init>(J)V

    :cond_12
    if-eqz v1, :cond_13

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChatEvent;->getRawCreatedAt()Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    :cond_13
    move-object v1, v7

    :goto_8
    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$6:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$7:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$8:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$9:Ljava/lang/Object;

    const/4 v10, 0x5

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    invoke-direct {v0, v4, v1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateLastSyncedDate(Ljava/util/Date;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_14

    goto/16 :goto_c

    :cond_14
    move-object v4, v1

    :goto_9
    move-object v1, v8

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v10, v8

    move-object v11, v9

    move-object v8, v1

    move-object v9, v4

    const/4 v4, 0x0

    :cond_15
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v12, v1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz v12, :cond_1

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v12

    iget-object v13, v12, Lb23/k;->c:Lb23/e;

    iget-object v14, v12, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_16

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v13

    const-string v5, "[performSync] found MarkAllReadEvent (in "

    move-object/from16 p1, v1

    const-string v1, " events)"

    invoke-static {v13, v5, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v12, v15, v14, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_b

    :cond_16
    move-object/from16 p1, v1

    :goto_b
    move-object/from16 v1, p1

    check-cast v1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MarkAllReadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MarkAllReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$6:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$7:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$8:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$9:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$11:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$12:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$13:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->I$0:I

    const/4 v12, 0x0

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->I$1:I

    const/4 v13, 0x6

    iput v13, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    invoke-direct {v0, v5, v1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateAllReadStateForDate(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_15

    goto :goto_c

    :cond_17
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[performSync] rejected (no events to emit)"

    invoke-interface {v1, v4, v3, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v6

    :cond_18
    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[performSync] rejected (rawLatestEventDate equals to rawLastSyncAt)"

    invoke-interface {v1, v4, v3, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v6

    :cond_19
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->events:Lio/getstream/chat/android/core/internal/coroutines/Tube;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$4:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$5:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$6:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$7:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$8:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$9:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$10:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$11:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$12:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->L$13:Ljava/lang/Object;

    const/4 v4, 0x7

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$performSync$4;->label:I

    invoke-virtual {v1, v10, v2}, Lio/getstream/chat/android/core/internal/coroutines/Tube;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1a

    :goto_c
    return-object v3

    :cond_1a
    :goto_d
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[performSync] events emission completed"

    invoke-interface {v1, v4, v3, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1b
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final retryMessages$stream_chat_android_client_release(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v6, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v2, "[retryMessages] no args"

    invoke-interface {p1, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iput v5, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryMessagesWithSyncedAttachments(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iput v4, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$retryMessages$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->retryMessagesWithPendingAttachments(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[retryMessages] completed"

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final start()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[start] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/getstream/chat/android/client/utils/observable/Disposable;->isDisposed()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$start$2;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$start$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->subscribe(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    return-void
.end method

.method public final stop()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[stop] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/getstream/chat/android/client/utils/observable/Disposable;->dispose()V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->syncScope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->k(Lbc3/k1;)V

    return-void
.end method

.method public final sync(Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v2, "[sync] no args"

    const/4 v6, 0x0

    invoke-interface {p1, v5, v4, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    sget-object v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;->Syncing:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$sync$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->performSync(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->state:Lec3/p1;

    sget-object v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;->Idle:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
