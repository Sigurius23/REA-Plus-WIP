.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion;,
        Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ec\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u008b\u00012\u00020\u0001:\u0002\u008b\u0001B\u0097\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00080\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u001c\u0010\u0017\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0005\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00190\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008#\u0010\"J$\u0010&\u001a\u00020\u00152\u0012\u0010%\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070$\"\u00020\u0007H\u0097@\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010(\u001a\u00020-H\u0002\u00a2\u0006\u0004\u0008.\u0010/J \u00104\u001a\u00020\u00152\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0082@\u00a2\u0006\u0004\u00084\u00105J\u0018\u00106\u001a\u00020\u00152\u0006\u0010(\u001a\u000200H\u0082@\u00a2\u0006\u0004\u00086\u00107J\u0018\u00108\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0082@\u00a2\u0006\u0004\u00088\u00107J\u0018\u00109\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0082@\u00a2\u0006\u0004\u00089\u00107J\u0017\u0010:\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010<\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0002\u00a2\u0006\u0004\u0008<\u0010;J\u0018\u0010=\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0082@\u00a2\u0006\u0004\u0008=\u00107J\u001f\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0019*\u0008\u0012\u0004\u0012\u00020\u00070\u0019H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\'\u0010C\u001a\u00020)*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020A0\u00190@2\u0006\u0010B\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008C\u0010DJ\u0018\u0010F\u001a\u00020)2\u0006\u0010E\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008F\u0010GJ2\u0010K\u001a\u00020\u00152\u0008\u0010E\u001a\u0004\u0018\u00010\u00022\u0006\u0010B\u001a\u00020\u00022\u0006\u0010H\u001a\u00020)2\u0006\u0010J\u001a\u00020IH\u0082@\u00a2\u0006\u0004\u0008K\u0010LJ1\u0010R\u001a\u00020M*\u00020M2\u0006\u0010O\u001a\u00020N2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0008\u0010Q\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0004\u0008R\u0010SJ\u001b\u0010T\u001a\u00020M*\u00020M2\u0006\u0010O\u001a\u00020NH\u0002\u00a2\u0006\u0004\u0008T\u0010UJ\u001c\u0010W\u001a\u00020\u0015*\u00020N2\u0006\u0010V\u001a\u00020MH\u0082@\u00a2\u0006\u0004\u0008W\u0010XJ\"\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010Y\u001a\u00020N2\u0006\u0010V\u001a\u00020MH\u0082@\u00a2\u0006\u0004\u0008[\u0010XJ\"\u0010]\u001a\u0004\u0018\u00010Z2\u0006\u0010Y\u001a\u00020N2\u0006\u0010\\\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008]\u0010^J$\u0010b\u001a\u00020\u0015*\u00020N2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010a\u001a\u00020`H\u0082@\u00a2\u0006\u0004\u0008b\u0010cJ\u001c\u0010d\u001a\u00020\u0015*\u00020N2\u0006\u0010_\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008d\u0010^R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010eR&\u0010\t\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00080\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010gR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010hR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010iR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010jR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010kR*\u0010\u0017\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010fR \u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010lR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010mR\u001b\u0010s\u001a\u00020n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008o\u0010p\u001a\u0004\u0008q\u0010rR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\u001a\u0010y\u001a\u0008\u0012\u0004\u0012\u00020\u00070x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR!\u0010~\u001a\u0008\u0012\u0004\u0012\u00020\u00070x8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008{\u0010p\u001a\u0004\u0008|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u001d\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0085\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u0089\u0001\u00a8\u0006\u008c\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "currentUserId",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/client/ChatEventListener;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "subscribeForEvents",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logicRegistry",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "stateRegistry",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "sideEffect",
        "Lec3/l;",
        "",
        "syncedEvents",
        "Lio/getstream/chat/android/client/api/MessageBufferConfig;",
        "bufferConfig",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;Lbc3/c0;)V",
        "startListening",
        "()V",
        "stopListening",
        "",
        "events",
        "handleEvents",
        "([Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;",
        "event",
        "",
        "emitted",
        "logEmitOutcome",
        "(Lio/getstream/chat/android/client/events/ChatEvent;Z)V",
        "Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;",
        "handleUserMessagesDeletedEvent",
        "(Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;)V",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
        "batchEvent",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
        "queryChannelsLogic",
        "handleChatEvents",
        "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)Ljava/lang/Object;",
        "handleBatchEvent",
        "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;",
        "updateGlobalState",
        "updateChannelsState",
        "updateQueryThreadsState",
        "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V",
        "updateThreadState",
        "updateOfflineStorage",
        "extractMessageIds",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lec3/f2;",
        "Lio/getstream/chat/android/models/Member;",
        "userId",
        "containsWithUserId",
        "(Lec3/f2;Ljava/lang/String;)Z",
        "cid",
        "checkReadEventsCapability",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "hard",
        "Ljava/util/Date;",
        "deletedAt",
        "deleteMessagesFromUser",
        "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
        "batch",
        "Lio/getstream/chat/android/models/User;",
        "eventUser",
        "enrichWithOwnReactions",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;",
        "enrichWithOwnPoll",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;)Lio/getstream/chat/android/models/Message;",
        "message",
        "addThreadIfExists",
        "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "pendingUpdate",
        "Lio/getstream/chat/android/models/Thread;",
        "threadFromMessage",
        "threadId",
        "threadFromPendingUpdateOrRepo",
        "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "messageId",
        "Lio/getstream/chat/android/models/MessageReminder;",
        "reminder",
        "upsertReminder",
        "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Lq83/d;)Ljava/lang/Object;",
        "deleteReminder",
        "Ljava/lang/String;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/api/MessageBufferConfig;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lbc3/c0;",
        "Lmc3/a;",
        "mutex",
        "Lmc3/a;",
        "Lec3/o1;",
        "socketEvents",
        "Lec3/o1;",
        "bufferedNewMessageEvents$delegate",
        "getBufferedNewMessageEvents",
        "()Lec3/o1;",
        "bufferedNewMessageEvents",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;",
        "socketEventCollector",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;",
        "eventsDisposable",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "defaultSocketEventListener",
        "Lio/getstream/chat/android/client/ChatEventListener;",
        "bufferedSocketEventListener",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "emittedCount",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "collectedCount",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion;

.field private static final EMPTY_DISPOSABLE:Lio/getstream/chat/android/client/utils/observable/Disposable;


# instance fields
.field private final bufferConfig:Lio/getstream/chat/android/client/api/MessageBufferConfig;

.field private final bufferedNewMessageEvents$delegate:Ll83/h;

.field private final bufferedSocketEventListener:Lio/getstream/chat/android/client/ChatEventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final collectedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final currentUserId:Ljava/lang/String;

.field private final defaultSocketEventListener:Lio/getstream/chat/android/client/ChatEventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final emittedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

.field private final logger$delegate:Ll83/h;

.field private final logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final mutex:Lmc3/a;

.field private final repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final scope:Lbc3/c0;

.field private final sideEffect:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final socketEventCollector:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

.field private final socketEvents:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

.field private final subscribeForEvents:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion$EMPTY_DISPOSABLE$1;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion$EMPTY_DISPOSABLE$1;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->EMPTY_DISPOSABLE:Lio/getstream/chat/android/client/utils/observable/Disposable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;Lbc3/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
            "Lio/getstream/chat/android/client/api/state/StateRegistry;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lkotlin/jvm/functions/Function1;",
            "Lec3/l;",
            "Lio/getstream/chat/android/client/api/MessageBufferConfig;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "currentUserId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscribeForEvents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logicRegistry"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateRegistry"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutableGlobalState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repos"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sideEffect"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncedEvents"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bufferConfig"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->subscribeForEvents:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iput-object p7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object p8, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->sideEffect:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->syncedEvents:Lec3/l;

    iput-object p10, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferConfig:Lio/getstream/chat/android/client/api/MessageBufferConfig;

    const-string p1, "Chat:EventHandlerSeq"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logger$delegate:Ll83/h;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    invoke-static {p11, p1}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$special$$inlined$CoroutineExceptionHandler$1;

    sget-object p3, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {p2, p3, p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$special$$inlined$CoroutineExceptionHandler$1;-><init>(Lbc3/a0;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)V

    invoke-static {p1, p2}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->scope:Lbc3/c0;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutex:Lmc3/a;

    const p1, 0x7fffffff

    const/4 p2, 0x5

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-static {p3, p1, p4, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->socketEvents:Lec3/o1;

    new-instance p1, Lh02/n0;

    const/16 p2, 0x18

    invoke-direct {p1, p0, p2}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferedNewMessageEvents$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    new-instance p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$socketEventCollector$1;

    invoke-direct {p2, p0, p4}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$socketEventCollector$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    invoke-direct {p1, p11, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;-><init>(Lbc3/c0;Lc93/m;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->socketEventCollector:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    sget-object p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->EMPTY_DISPOSABLE:Lio/getstream/chat/android/client/utils/observable/Disposable;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    new-instance p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->defaultSocketEventListener:Lio/getstream/chat/android/client/ChatEventListener;

    new-instance p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferedSocketEventListener:Lio/getstream/chat/android/client/ChatEventListener;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    sget-object p3, Lb23/g;->y:Lb23/g;

    iget-object p5, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, p3, p5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "<init> no args"

    invoke-interface {p1, p3, p5, p2, p4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->emittedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->collectedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->defaultSocketEventListener$lambda$3(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public static final synthetic access$addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkReadEventsCapability(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->checkReadEventsCapability(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$deleteMessagesFromUser(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->deleteMessagesFromUser(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$deleteReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->deleteReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBufferedNewMessageEvents(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lec3/o1;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getBufferedNewMessageEvents()Lec3/o1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCollectedCount$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->collectedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic access$getEMPTY_DISPOSABLE$cp()Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->EMPTY_DISPOSABLE:Lio/getstream/chat/android/client/utils/observable/Disposable;

    return-object v0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRepos$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-object p0
.end method

.method public static final synthetic access$getSideEffect$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->sideEffect:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getSocketEventCollector$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->socketEventCollector:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    return-object p0
.end method

.method public static final synthetic access$getSocketEvents$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->socketEvents:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic access$getSyncedEvents$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lec3/l;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->syncedEvents:Lec3/l;

    return-object p0
.end method

.method public static final synthetic access$handleBatchEvent(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->handleBatchEvent(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleChatEvents(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->handleChatEvents(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$threadFromMessage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromMessage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateChannelsState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateChannelsState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateGlobalState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateGlobalState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateOfflineStorage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateOfflineStorage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$upsertReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->upsertReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$addThreadIfExists$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromMessage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lio/getstream/chat/android/models/Thread;

    if-eqz p3, :cond_4

    invoke-static {p3, p2}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->updateParentOrReply(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addThread(Lio/getstream/chat/android/models/Thread;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/models/User;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateGlobalState$lambda$25(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/models/User;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final bufferedNewMessageEvents_delegate$lambda$2(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lec3/o1;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferConfig:Lio/getstream/chat/android/client/api/MessageBufferConfig;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/MessageBufferConfig;->getCapacity()I

    move-result v0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferConfig:Lio/getstream/chat/android/client/api/MessageBufferConfig;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/MessageBufferConfig;->getOverflow()Lio/getstream/chat/android/client/api/MessageBufferOverflow;

    move-result-object p0

    sget-object v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v2, 0x2

    if-ne p0, v2, :cond_0

    sget-object p0, Ldc3/a;->y:Ldc3/a;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ldc3/a;->x:Ldc3/a;

    :goto_0
    const/4 v2, 0x0

    invoke-static {v2, v0, p0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p0

    return-object p0
.end method

.method private static final bufferedSocketEventListener$lambda$4(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferConfig:Lio/getstream/chat/android/client/api/MessageBufferConfig;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/MessageBufferConfig;->getChannelTypes()Ljava/util/Set;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getChannelType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getBufferedNewMessageEvents()Lec3/o1;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->socketEvents:Lec3/o1;

    :goto_0
    invoke-interface {v0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    move-result v0

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logEmitOutcome(Lio/getstream/chat/android/client/events/ChatEvent;Z)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->handleBatchEvent$lambda$21$lambda$18$lambda$17(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private final checkReadEventsCapability(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;->L$0:Ljava/lang/Object;

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

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$checkReadEventsCapability$1;->label:I

    invoke-virtual {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    const-string v0, "read-events"

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v1, p2, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getChannelData()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final containsWithUserId(Lec3/f2;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lec3/w1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferedNewMessageEvents_delegate$lambda$2(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lec3/o1;

    move-result-object p0

    check-cast p0, Lec3/w1;

    return-object p0
.end method

.method private static final defaultSocketEventListener$lambda$3(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->socketEvents:Lec3/o1;

    invoke-interface {v0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    move-result v0

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logEmitOutcome(Lio/getstream/chat/android/client/events/ChatEvent;Z)V

    return-void
.end method

.method private final deleteMessagesFromUser(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 69
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
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

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    instance-of v6, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;

    if-eqz v6, :cond_0

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;

    iget v7, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;

    invoke-direct {v6, v0, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object v5, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->result:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v8, :cond_6

    if-eq v8, v14, :cond_5

    if-eq v8, v13, :cond_4

    if-eq v8, v12, :cond_3

    if-eq v8, v11, :cond_2

    if-ne v8, v10, :cond_1

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget-boolean v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iget-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    iget-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    iget-boolean v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iget-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    iget-object v3, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v68, v3

    move v3, v1

    move-object v1, v4

    move-object v4, v2

    move-object/from16 v2, v68

    goto :goto_3

    :cond_5
    iget-boolean v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iget-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    iget-object v3, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v68, v3

    move v3, v1

    move-object v1, v4

    move-object v4, v2

    move-object/from16 v2, v68

    goto :goto_1

    :cond_6
    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v1, :cond_8

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    iput-object v4, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    iput-boolean v3, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iput v14, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    invoke-virtual {v5, v1, v2, v6}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_7

    goto/16 :goto_8

    :cond_7
    :goto_1
    check-cast v5, Ljava/util/List;

    :goto_2
    move/from16 v37, v3

    move-object v3, v1

    move/from16 v1, v37

    move-object/from16 v37, v4

    goto :goto_4

    :cond_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    iput-object v4, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    iput-boolean v3, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iput v13, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    invoke-virtual {v5, v2, v6}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectAllUserMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_9

    goto/16 :goto_8

    :cond_9
    :goto_3
    check-cast v5, Ljava/util/List;

    goto :goto_2

    :goto_4
    if-eqz v1, :cond_c

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v3, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$3:Ljava/lang/Object;

    iput-boolean v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iput v12, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    invoke-virtual {v4, v5, v6}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_a

    goto/16 :goto_8

    :cond_a
    :goto_5
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$3:Ljava/lang/Object;

    iput-boolean v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iput v11, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    invoke-virtual {v4, v3, v2, v6}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_b

    goto/16 :goto_8

    :cond_b
    :goto_6
    return-object v9

    :cond_c
    check-cast v5, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v5, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v4

    check-cast v16, Lio/getstream/chat/android/models/Message;

    const v66, 0xffff

    const/16 v67, 0x0

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

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

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

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const v65, -0x100001

    invoke-static/range {v16 .. v67}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$0:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$1:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$2:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$3:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->L$4:Ljava/lang/Object;

    iput-boolean v1, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->Z$0:Z

    iput v10, v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteMessagesFromUser$1;->label:I

    invoke-virtual {v3, v2, v6}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_e

    :goto_8
    return-object v7

    :cond_e
    :goto_9
    return-object v9
.end method

.method private final deleteReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
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

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-nez v1, :cond_4

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-object/from16 v4, p1

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$deleteReminder$1;->label:I

    move-object/from16 v5, p2

    invoke-virtual {v1, v5, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v4

    :goto_1
    check-cast v1, Lio/getstream/chat/android/models/Message;

    :goto_2
    move-object v3, v1

    goto :goto_3

    :cond_4
    move-object/from16 v4, p1

    move-object v2, v4

    goto :goto_2

    :goto_3
    if-eqz v3, :cond_5

    const v53, 0xefff

    const/16 v54, 0x0

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

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, -0x1

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public static synthetic e(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferedSocketEventListener$lambda$4(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method private final enrichWithOwnPoll(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;)Lio/getstream/chat/android/models/Message;
    .locals 54

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    :cond_0
    :goto_0
    move-object/from16 v45, v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const v52, 0xfbff

    const/16 v53, 0x0

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

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, -0x1

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method private final enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;
    .locals 53

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    if-eqz p4, :cond_2

    invoke-virtual/range {p4 .. p4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object/from16 v19, v0

    goto :goto_4

    :cond_1
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Ljava/util/Collection;

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-static {v3, v0}, Lio/getstream/chat/android/client/extensions/internal/ReactionKt;->mergeReactions(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :goto_4
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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

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

    const v50, -0x20001

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method private final extractMessageIds(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v2, v1, Lio/getstream/chat/android/client/events/HasMessage;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lio/getstream/chat/android/client/events/HasMessage;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lio/getstream/chat/android/client/events/HasMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_2
    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private final getBufferedNewMessageEvents()Lec3/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/o1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferedNewMessageEvents$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lec3/o1;

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handleBatchEvent(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "[handleBatchEvent] failed("

    const-string v3, "[handleBatchEvent] <<< id: "

    const-string v4, "[handleBatchEvent] >>> id: "

    instance-of v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;

    if-eqz v5, :cond_0

    move-object v5, v0

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;

    iget v6, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->label:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;

    invoke-direct {v5, v1, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object v0, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->result:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v7, :cond_5

    if-eq v7, v12, :cond_4

    if-eq v7, v11, :cond_3

    if-eq v7, v10, :cond_2

    if-ne v7, v9, :cond_1

    iget-object v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v5, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v23, v2

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move-object/from16 v23, v2

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$1:I

    iget v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$0:I

    iget-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    iget-object v10, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v14, v8

    move v8, v4

    move-object v4, v14

    move-object/from16 v23, v2

    move-object v14, v10

    goto/16 :goto_6

    :catchall_1
    move-exception v0

    move-object/from16 v23, v2

    move-object v4, v8

    move-object v5, v10

    goto/16 :goto_9

    :cond_3
    iget v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$1:I

    iget v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$0:I

    iget-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lmc3/a;

    iget-object v11, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v14, v7

    move v7, v4

    move-object v4, v14

    move-object/from16 v23, v2

    move-object v14, v11

    goto/16 :goto_5

    :catchall_2
    move-exception v0

    move-object/from16 v23, v2

    move-object v4, v7

    move-object v5, v11

    goto/16 :goto_9

    :cond_4
    iget v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$0:I

    iget-object v12, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lmc3/a;

    iget-object v14, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutex:Lmc3/a;

    move-object/from16 v7, p1

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    iput-object v0, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    iput v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$0:I

    iput v12, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->label:I

    invoke-interface {v0, v5}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v6, :cond_6

    goto/16 :goto_7

    :cond_6
    move-object v12, v0

    move-object v14, v7

    move v7, v8

    :goto_1
    :try_start_3
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v15, v0, Lb23/k;->c:Lb23/e;

    iget-object v9, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v15, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v15

    invoke-virtual {v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->isFromSocketConnection()Z

    move-result v11

    invoke-virtual {v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSize()I

    move-result v8

    invoke-virtual {v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v16

    move-object/from16 v17, v16

    check-cast v17, Ljava/lang/Iterable;

    new-instance v13, Lio/getstream/chat/android/client/api/state/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    move-object/from16 v23, v2

    const/16 v2, 0x14

    :try_start_4
    invoke-direct {v13, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    const/16 v22, 0x1f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v13

    invoke-static/range {v17 .. v22}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", fromSocket: "

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", size: "

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", event.types: \'"

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v0, v10, v9, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :catchall_3
    move-exception v0

    :goto_2
    move-object v4, v12

    :goto_3
    move-object v5, v14

    goto/16 :goto_9

    :catchall_4
    move-exception v0

    move-object/from16 v23, v2

    goto :goto_2

    :cond_7
    move-object/from16 v23, v2

    :goto_4
    iput-object v14, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    iput-object v12, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    iput v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$0:I

    const/4 v0, 0x0

    iput v0, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$1:I

    const/4 v2, 0x2

    iput v2, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->label:I

    invoke-direct {v1, v14, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateGlobalState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-ne v2, v6, :cond_8

    goto :goto_7

    :cond_8
    move v8, v0

    move-object v4, v12

    :goto_5
    :try_start_5
    iput-object v14, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    iput-object v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    iput v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$0:I

    iput v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$1:I

    const/4 v0, 0x3

    iput v0, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->label:I

    invoke-direct {v1, v14, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateChannelsState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_9

    goto :goto_7

    :cond_9
    :goto_6
    iput-object v14, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$0:Ljava/lang/Object;

    iput-object v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->L$1:Ljava/lang/Object;

    iput v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$0:I

    iput v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->I$1:I

    const/4 v0, 0x4

    iput v0, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleBatchEvent$1;->label:I

    invoke-direct {v1, v14, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateOfflineStorage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    if-ne v0, v6, :cond_a

    :goto_7
    return-object v6

    :cond_a
    move-object v5, v14

    :goto_8
    :try_start_6
    invoke-direct {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateQueryThreadsState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V

    invoke-direct {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateThreadState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v2

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_a

    :catchall_5
    move-exception v0

    goto :goto_9

    :catchall_6
    move-exception v0

    goto :goto_3

    :goto_9
    :try_start_7
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->F:Lb23/g;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    move-object/from16 v9, v23

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "): "

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v6, v2, v5, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :catchall_7
    move-exception v0

    const/4 v3, 0x0

    goto :goto_b

    :cond_b
    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    const/4 v3, 0x0

    invoke-interface {v4, v3}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v0

    :goto_b
    invoke-interface {v4, v3}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method private static final handleBatchEvent$lambda$21$lambda$18$lambda$17(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->getRealType(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final handleChatEvents(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->label:I

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->label:I

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v10, :cond_3

    if-eq v5, v9, :cond_2

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget v0, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$0:I

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$0:I

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object v0, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v5, v1, Lb23/k;->c:Lb23/e;

    iget-object v12, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSize()I

    move-result v14

    const-string v15, "[handleChatEvents] batchId: "

    const-string v7, ", batchEvent.size: "

    invoke-static {v5, v14, v15, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v13, v12, v5, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v1

    move-object/from16 v5, p1

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$0:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$1:Ljava/lang/Object;

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->label:I

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->parseChatEventResults$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_1
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v10, v0

    move-object v12, v5

    move v0, v6

    move-object v5, v1

    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    instance-of v7, v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;

    if-eqz v7, :cond_9

    check-cast v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$1:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$2:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$3:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$4:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$5:Ljava/lang/Object;

    iput v0, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$0:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$1:I

    iput v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->label:I

    invoke-virtual {v10, v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->addChannel$stream_chat_android_client_release(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v7, 0x4

    goto :goto_2

    :cond_9
    instance-of v7, v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;

    if-eqz v7, :cond_a

    check-cast v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;->getCid()Ljava/lang/String;

    move-result-object v1

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$1:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$2:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$3:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$4:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$5:Ljava/lang/Object;

    iput v0, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$0:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$1:I

    iput v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->label:I

    invoke-virtual {v10, v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->watchAndAddChannel$stream_chat_android_client_release(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_8

    goto :goto_4

    :cond_a
    instance-of v7, v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;

    if-eqz v7, :cond_b

    check-cast v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;->getCid()Ljava/lang/String;

    move-result-object v1

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$1:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$2:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$3:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$4:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->L$5:Ljava/lang/Object;

    iput v0, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$0:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->I$1:I

    const/4 v7, 0x4

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$handleChatEvents$1;->label:I

    invoke-virtual {v10, v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->removeChannel$stream_chat_android_client_release(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    :goto_4
    return-object v4

    :cond_b
    const/4 v7, 0x4

    instance-of v1, v1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    if-eqz v1, :cond_c

    goto :goto_2

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    invoke-virtual {v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_e
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v2, v2, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz v2, :cond_e

    goto :goto_5

    :cond_f
    move-object v1, v11

    :goto_5
    if-eqz v1, :cond_10

    invoke-virtual {v10}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->refreshAllChannelsState$stream_chat_android_client_release()V

    :cond_10
    invoke-virtual {v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v4, :cond_11

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/client/events/CidEvent;

    instance-of v5, v4, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;

    if-nez v5, :cond_13

    instance-of v4, v4, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;

    if-eqz v4, :cond_14

    goto :goto_7

    :cond_14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/CidEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_16
    invoke-static {v1}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_17

    invoke-virtual {v10, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->refreshChannelsState$stream_chat_android_client_release(Ljava/util/Collection;)V

    :cond_17
    invoke-virtual {v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    if-eqz v4, :cond_18

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_19
    invoke-static {v1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v10, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->refreshMembersStateForUser$stream_chat_android_client_release(Lio/getstream/chat/android/models/User;)V

    :cond_1a
    invoke-direct {v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v1

    const-string v5, "[handleChatEvents] completed batchId: "

    invoke-static {v1, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v4, v2, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final handleUserMessagesDeletedEvent(Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;)V
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->isActiveChannel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveChannelsLogic()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    invoke-interface {v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final logEmitOutcome(Lio/getstream/chat/android/client/events/ChatEvent;Z)V
    .locals 10

    const/4 v0, 0x0

    const-string v1, "Chat:SocketEvent"

    if-eqz p2, :cond_0

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->collectedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->emittedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v2

    int-to-double v3, v2

    int-to-double v5, p2

    div-double/2addr v3, v5

    sget-object v5, Lb23/i;->a:Lb23/i;

    sget-object v5, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v6, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v5, Lb23/i;->c:Lb23/j;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->getRealType(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;

    move-result-object p1

    const-string v7, "; "

    const-string v8, " => "

    const-string v9, "[onSocketEventReceived] event.type: "

    invoke-static {v2, v9, p1, v7, v8}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v5, v6, v1, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    sget-object p2, Lb23/i;->a:Lb23/i;

    sget-object p2, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {p2, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lb23/i;->c:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[onSocketEventReceived] failed to emit socket event: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2, v1, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method private final threadFromMessage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->label:I

    invoke-direct {p0, p1, p3, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Lio/getstream/chat/android/models/Thread;

    if-nez p3, :cond_6

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_6

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->L$2:Ljava/lang/Object;

    const/4 p3, 0x0

    iput p3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$threadFromMessage$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p3, Lio/getstream/chat/android/models/Thread;

    :cond_6
    return-object p3
.end method

.method private final threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentThread(Ljava/lang/String;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectThread(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final updateChannelsState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
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

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->label:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$5:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_15

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/client/events/ChatEvent;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ChatEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v8

    goto :goto_1

    :cond_3
    move-object v8, v7

    :goto_1
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChatEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    goto :goto_2

    :cond_4
    move-object v9, v7

    :goto_2
    if-eqz v8, :cond_6

    if-eqz v9, :cond_6

    invoke-virtual {v8, v9}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v8

    if-gez v8, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    const/4 v8, 0x0

    :goto_3
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    goto :goto_4

    :cond_6
    move-object v8, v7

    :goto_4
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v11, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v10

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSize()I

    move-result v13

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ChatEvent;->getSeq()I

    move-result v2

    new-instance v14, Ljava/lang/Integer;

    invoke-direct {v14, v2}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_5

    :cond_7
    move-object v14, v7

    :goto_5
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChatEvent;->getSeq()I

    move-result v2

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v2}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_6

    :cond_8
    move-object v5, v7

    :goto_6
    const-string v2, ", batchEvent.size: "

    const-string v15, ", first("

    const-string v6, "[updateChannelsState] batchId: "

    invoke-static {v10, v13, v6, v2, v15}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, ") < last("

    const-string v10, "): "

    invoke-static {v2, v14, v6, v5, v10}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v9, v12, v11, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v2

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v5, v1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->handleBatchEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_a
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v9, :cond_a

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_b
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-virtual {v9}, Lio/getstream/chat/android/client/events/CidEvent;->getCid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_c

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    check-cast v10, Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_e
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v8

    iget-object v9, v8, Ll83/k;->w:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    move-object v10, v6

    check-cast v10, Ljava/lang/Iterable;

    instance-of v11, v10, Ljava/util/Collection;

    if-eqz v11, :cond_f

    move-object v11, v10

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_10
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/client/events/CidEvent;

    instance-of v12, v11, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-nez v12, :cond_11

    instance-of v11, v11, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz v11, :cond_10

    :cond_11
    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v10, v9, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->removeChannel$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    :goto_a
    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v10, v9, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->isActiveChannel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_e

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v10, v9, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v8

    invoke-interface {v8, v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->handleEvents(Ljava/util/List;)V

    goto :goto_9

    :cond_13
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_14
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz v9, :cond_14

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    invoke-static {v5}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz v5, :cond_16

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveChannelsLogic()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    invoke-interface {v8, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    goto :goto_c

    :cond_16
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_17
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_18

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;

    if-eqz v9, :cond_17

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_18
    invoke-static {v5}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;

    if-eqz v5, :cond_19

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveChannelsLogic()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    invoke-interface {v8, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    goto :goto_e

    :cond_19
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v8, v8, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    if-eqz v8, :cond_1a

    goto :goto_f

    :cond_1b
    move-object v6, v7

    :goto_f
    check-cast v6, Lio/getstream/chat/android/client/events/ChatEvent;

    if-eqz v6, :cond_1e

    move-object v5, v6

    check-cast v5, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v8}, Lio/getstream/chat/android/client/api/state/StateRegistry;->getActiveChannelStates$stream_chat_android_client_release()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1c
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-interface {v11}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembers()Lec3/f2;

    move-result-object v11

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v12

    invoke-virtual {v12}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v0, v11, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->containsWithUserId(Lec3/f2;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1c

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_1d
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/client/channel/state/ChannelState;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-interface {v8}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getChannelType()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getChannelId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v8

    invoke-interface {v8, v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    goto :goto_11

    :cond_1e
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1f
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    if-eqz v8, :cond_1f

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_20
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    invoke-direct {v0, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->handleUserMessagesDeletedEvent(Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;)V

    goto :goto_13

    :cond_21
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryChannelsLogic()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->scope:Lbc3/c0;

    new-instance v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$10$1;

    invoke-direct {v9, v0, v1, v6, v7}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$10$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    const/4 v6, 0x3

    invoke-static {v8, v7, v9, v6}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_22
    iput-object v1, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$0:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$1:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$2:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$3:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$4:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$5:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->L$6:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateChannelsState$1;->label:I

    invoke-static {v5, v3}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_23

    return-object v4

    :cond_23
    :goto_15
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_24

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v1

    const-string v3, "[updateChannelsState] completed batchId: "

    invoke-static {v1, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v5, v4, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_24
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private final updateGlobalState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->label:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;

    invoke-direct {v2, v1, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->result:Ljava/lang/Object;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v2, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->label:I

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v11, :cond_2

    if-ne v2, v10, :cond_1

    iget v2, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$0:I

    iget-object v3, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$14:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;

    iget-object v3, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$13:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v4, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$11:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$10:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$9:Ljava/lang/Object;

    check-cast v5, Lc93/m;

    iget-object v6, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$8:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v7, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$7:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v14, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$6:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    iget-object v14, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$5:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/internal/g0;

    iget-object v15, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$4:Ljava/lang/Object;

    check-cast v15, Lkotlin/jvm/internal/e0;

    iget-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$3:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/e0;

    iget-object v11, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/e0;

    iget-object v12, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lkotlin/jvm/internal/g0;

    iget-object v13, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v2, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$1:I

    iget v3, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$0:I

    iget-object v4, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$14:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    iget-object v4, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$13:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v5, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$11:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$10:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$9:Ljava/lang/Object;

    check-cast v6, Lc93/m;

    iget-object v7, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$8:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$7:Ljava/lang/Object;

    check-cast v10, Lc93/m;

    iget-object v11, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$6:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    iget-object v11, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$5:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/g0;

    iget-object v12, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$4:Ljava/lang/Object;

    check-cast v12, Lkotlin/jvm/internal/e0;

    iget-object v13, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$3:Ljava/lang/Object;

    check-cast v13, Lkotlin/jvm/internal/e0;

    iget-object v14, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$2:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/internal/e0;

    iget-object v15, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$1:Ljava/lang/Object;

    check-cast v15, Lkotlin/jvm/internal/g0;

    move-object/from16 v17, v0

    iget-object v0, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static/range {v17 .. v17}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_3
    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSize()I

    move-result v5

    const-string v6, "[updateGlobalState] batchId: "

    const-string v7, ", batchEvent.size: "

    invoke-static {v2, v5, v6, v7}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v0, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v3, Lkotlin/jvm/internal/e0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getTotalUnreadCount()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, v3, Lkotlin/jvm/internal/e0;->w:I

    new-instance v4, Lkotlin/jvm/internal/e0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getChannelUnreadCount()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, v4, Lkotlin/jvm/internal/e0;->w:I

    new-instance v5, Lkotlin/jvm/internal/e0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getUnreadThreadsCount()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, v5, Lkotlin/jvm/internal/e0;->w:I

    new-instance v6, Lkotlin/jvm/internal/g0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getBlockedUserIds()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$hasReadEventsCapability$1;

    const/4 v10, 0x0

    invoke-direct {v0, v1, v10}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$hasReadEventsCapability$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    invoke-static {v0}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazyKt;->parameterizedLazy(Lc93/m;)Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    move-result-object v11

    new-instance v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;

    invoke-direct {v12, v11, v3, v4, v10}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;-><init>(Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lq83/d;)V

    new-instance v0, Lam2/b;

    const/16 v7, 0xc

    invoke-direct/range {v0 .. v7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v7, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;

    invoke-direct {v7, v11, v5, v10}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;-><init>(Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;Lkotlin/jvm/internal/e0;Lq83/d;)V

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->isFromHistorySync()Z

    move-result v10

    if-nez v10, :cond_5

    move-object/from16 v10, p1

    goto :goto_2

    :cond_5
    const/4 v10, 0x0

    :goto_2
    if-eqz v10, :cond_1f

    invoke-virtual {v10}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_1f

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v11, v12

    move-object v12, v5

    move-object v5, v10

    move-object v10, v11

    move-object v15, v2

    move-object v14, v3

    move-object v13, v4

    move-object v11, v6

    move-object v6, v7

    const/4 v3, 0x0

    move-object v7, v0

    move-object/from16 v0, p1

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v2, v4, Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;

    if-eqz v2, :cond_6

    move-object v2, v4

    check-cast v2, Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_7

    move-object/from16 p1, v2

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    move-object/from16 v17, v9

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v9

    invoke-virtual {v2, v9}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->updateDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_5

    :cond_7
    move-object/from16 v17, v9

    :goto_5
    instance-of v2, v4, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    if-eqz v2, :cond_8

    move-object v2, v4

    check-cast v2, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    :goto_6
    if-eqz v2, :cond_9

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v2

    invoke-virtual {v9, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->removeDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    :cond_9
    instance-of v2, v4, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    if-eqz v2, :cond_a

    move-object v2, v4

    check-cast v2, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    goto :goto_7

    :cond_a
    const/4 v2, 0x0

    :goto_7
    if-eqz v2, :cond_c

    iput-object v0, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$0:Ljava/lang/Object;

    iput-object v15, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$1:Ljava/lang/Object;

    iput-object v14, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$2:Ljava/lang/Object;

    iput-object v13, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$3:Ljava/lang/Object;

    iput-object v12, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$4:Ljava/lang/Object;

    iput-object v11, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$5:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$6:Ljava/lang/Object;

    iput-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$7:Ljava/lang/Object;

    iput-object v7, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$8:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$9:Ljava/lang/Object;

    iput-object v9, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$10:Ljava/lang/Object;

    iput-object v5, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$11:Ljava/lang/Object;

    iput-object v9, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$12:Ljava/lang/Object;

    iput-object v4, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$13:Ljava/lang/Object;

    iput-object v9, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$14:Ljava/lang/Object;

    iput v3, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$0:I

    const/4 v9, 0x0

    iput v9, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$1:I

    iput v9, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$2:I

    const/4 v9, 0x1

    iput v9, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->label:I

    invoke-interface {v10, v2, v8}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v9, v17

    if-ne v2, v9, :cond_b

    goto/16 :goto_c

    :cond_b
    const/4 v2, 0x0

    :goto_8
    move-object/from16 v18, v13

    move-object v13, v0

    move v0, v2

    move v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v14

    move-object v14, v11

    move-object/from16 v11, v18

    move-object/from16 v18, v15

    move-object v15, v12

    move-object/from16 v12, v18

    goto :goto_9

    :cond_c
    move-object/from16 v9, v17

    move-object v2, v14

    move-object v14, v11

    move-object v11, v2

    move-object v2, v15

    move-object v15, v12

    move-object v12, v2

    move v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v10

    move-object v10, v13

    move-object v13, v0

    const/4 v0, 0x0

    :goto_9
    instance-of v1, v3, Lio/getstream/chat/android/client/events/HasOwnUser;

    if-eqz v1, :cond_d

    move-object v1, v3

    check-cast v1, Lio/getstream/chat/android/client/events/HasOwnUser;

    goto :goto_a

    :cond_d
    const/4 v1, 0x0

    :goto_a
    if-eqz v1, :cond_e

    invoke-interface {v1}, Lio/getstream/chat/android/client/events/HasOwnUser;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/a0;

    :cond_e
    instance-of v1, v3, Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;

    if-eqz v1, :cond_f

    move-object v1, v3

    check-cast v1, Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;

    goto :goto_b

    :cond_f
    const/4 v1, 0x0

    :goto_b
    if-eqz v1, :cond_11

    iput-object v13, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$0:Ljava/lang/Object;

    iput-object v12, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$1:Ljava/lang/Object;

    iput-object v11, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$2:Ljava/lang/Object;

    iput-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$3:Ljava/lang/Object;

    iput-object v15, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$4:Ljava/lang/Object;

    iput-object v14, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$5:Ljava/lang/Object;

    move-object/from16 v17, v10

    const/4 v10, 0x0

    iput-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$6:Ljava/lang/Object;

    iput-object v7, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$7:Ljava/lang/Object;

    iput-object v6, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$8:Ljava/lang/Object;

    iput-object v5, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$9:Ljava/lang/Object;

    iput-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$10:Ljava/lang/Object;

    iput-object v4, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$11:Ljava/lang/Object;

    iput-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$12:Ljava/lang/Object;

    iput-object v3, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$13:Ljava/lang/Object;

    iput-object v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->L$14:Ljava/lang/Object;

    iput v2, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$0:I

    iput v0, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$1:I

    const/4 v10, 0x0

    iput v10, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->I$2:I

    const/4 v0, 0x2

    iput v0, v8, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$1;->label:I

    invoke-interface {v5, v1, v8}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_10

    :goto_c
    return-object v9

    :cond_10
    :goto_d
    move-object v1, v14

    move-object v14, v11

    move-object v11, v1

    move-object v1, v15

    move-object v15, v12

    move-object v12, v1

    move-object v1, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    goto :goto_f

    :cond_11
    :goto_e
    move-object/from16 v17, v10

    const/4 v0, 0x2

    const/4 v10, 0x0

    goto :goto_d

    :goto_f
    instance-of v4, v3, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    if-eqz v4, :cond_12

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    goto :goto_10

    :cond_12
    const/4 v4, 0x0

    :goto_10
    if-eqz v4, :cond_16

    invoke-virtual {v4}, Lio/getstream/chat/android/client/events/UserUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v10, p0

    move-object/from16 p1, v1

    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_11

    :cond_13
    const/4 v4, 0x0

    :goto_11
    if-eqz v4, :cond_17

    iget-object v0, v15, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-eqz v0, :cond_14

    invoke-virtual {v4}, Lio/getstream/chat/android/client/events/UserUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/utils/UserUtilsKt;->mergePartially(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/User;

    move-result-object v0

    if-nez v0, :cond_15

    :cond_14
    invoke-virtual {v4}, Lio/getstream/chat/android/client/events/UserUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    :cond_15
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/a0;

    goto :goto_12

    :cond_16
    move-object/from16 v10, p0

    move-object/from16 p1, v1

    :cond_17
    :goto_12
    instance-of v0, v3, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v0, :cond_18

    move-object v0, v3

    check-cast v0, Lio/getstream/chat/android/client/events/NewMessageEvent;

    goto :goto_13

    :cond_18
    const/4 v0, 0x0

    :goto_13
    if-eqz v0, :cond_19

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getSharedLocation()Lio/getstream/chat/android/models/Location;

    move-result-object v0

    if-eqz v0, :cond_19

    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocation(Lio/getstream/chat/android/models/Location;)V

    :cond_19
    instance-of v0, v3, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v0, :cond_1a

    move-object v0, v3

    check-cast v0, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    goto :goto_14

    :cond_1a
    const/4 v0, 0x0

    :goto_14
    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getSharedLocation()Lio/getstream/chat/android/models/Location;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocation(Lio/getstream/chat/android/models/Location;)V

    :cond_1b
    instance-of v0, v3, Lio/getstream/chat/android/client/events/HasChannel;

    if-eqz v0, :cond_1c

    move-object v0, v3

    check-cast v0, Lio/getstream/chat/android/client/events/HasChannel;

    goto :goto_15

    :cond_1c
    const/4 v0, 0x0

    :goto_15
    if-eqz v0, :cond_1d

    invoke-interface {v0}, Lio/getstream/chat/android/client/events/HasChannel;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getActiveLiveLocations()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocations(Ljava/util/List;)V

    :cond_1d
    move v3, v2

    move-object v1, v10

    move-object v0, v13

    move-object/from16 v13, v17

    move-object/from16 v10, p1

    goto/16 :goto_3

    :cond_1e
    move-object v10, v1

    move-object v6, v11

    move-object v5, v12

    move-object v4, v13

    move-object v3, v14

    move-object v2, v15

    goto :goto_16

    :cond_1f
    move-object v10, v1

    move-object/from16 v0, p1

    :goto_16
    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/User;

    if-eqz v1, :cond_20

    iget-object v2, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->isBanned()Z

    move-result v7

    invoke-virtual {v2, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setBanned(Z)V

    iget-object v2, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getMutes()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v2, v7}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setMutedUsers(Ljava/util/List;)V

    iget-object v2, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getChannelMutes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setChannelMutes(Ljava/util/List;)V

    :cond_20
    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget v2, v3, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setTotalUnreadCount(I)V

    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget v2, v4, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setChannelUnreadCount(I)V

    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget v2, v5, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setUnreadThreadsCount(I)V

    iget-object v1, v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget-object v2, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setBlockedUserIds(Ljava/util/List;)V

    invoke-direct {v10}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_21

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v0

    const-string v2, "[updateGlobalState] completed batchId: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-interface {v1, v4, v3, v0, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_21
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final updateGlobalState$lambda$25(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/models/User;)Ll83/a0;
    .locals 1

    const-string v0, "user"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p6, v0

    :goto_0
    if-eqz p6, :cond_1

    iput-object p6, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p6}, Lio/getstream/chat/android/models/User;->getTotalUnreadCount()I

    move-result p0

    iput p0, p2, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {p6}, Lio/getstream/chat/android/models/User;->getUnreadChannels()I

    move-result p0

    iput p0, p3, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {p6}, Lio/getstream/chat/android/models/User;->getUnreadThreads()I

    move-result p0

    iput p0, p4, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {p6}, Lio/getstream/chat/android/models/User;->getBlockedUserIds()Ljava/util/List;

    move-result-object p0

    iput-object p0, p5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    return-object v0
.end method

.method private final updateOfflineStorage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->result:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    const/4 v4, 0x1

    const/16 v5, 0xa

    const/4 v7, 0x0

    const/4 v8, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v2

    move-object v7, v3

    move-object v9, v4

    goto/16 :goto_33

    :pswitch_1
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v4

    move-object v9, v5

    move-object v5, v2

    goto/16 :goto_31

    :pswitch_2
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v3

    move-object v9, v4

    :goto_1
    move-object v5, v2

    goto/16 :goto_2f

    :pswitch_3
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_30

    :pswitch_4
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v2

    move-object v7, v3

    goto/16 :goto_2e

    :pswitch_5
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2d

    :pswitch_6
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v10

    move-object v10, v3

    move-object v3, v1

    move v13, v5

    move-object v1, v9

    move-object v9, v11

    goto/16 :goto_2c

    :pswitch_7
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v13, v5

    goto/16 :goto_29

    :pswitch_8
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v13, v5

    goto/16 :goto_2a

    :pswitch_9
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v13, v5

    goto/16 :goto_28

    :pswitch_a
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/ThreadInfo;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v53, v13

    move v13, v5

    move-object/from16 v5, v53

    goto/16 :goto_27

    :pswitch_b
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_19

    :pswitch_c
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_18

    :pswitch_d
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    check-cast v3, Ljava/util/Date;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    :pswitch_e
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_f
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_10
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_11
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v3

    sget-object v9, Lb23/g;->x:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v3, v9, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v3

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSize()I

    move-result v11

    const-string v12, ", batchEvent.size: "

    const-string v13, " "

    const-string v14, "[updateOfflineStorage] batchId: "

    invoke-static {v10, v11, v14, v12, v13}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v9, v1, v10}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {v9}, Lio/getstream/chat/android/client/extensions/internal/ChatEventKt;->enrichIfNeeded(Lio/getstream/chat/android/client/events/ChatEvent;)Lio/getstream/chat/android/client/events/ChatEvent;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v9

    invoke-direct {v1, v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;-><init>(I)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_3
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v12, :cond_3

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_5
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Lio/getstream/chat/android/client/events/HasPoll;

    if-eqz v13, :cond_5

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_7
    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lio/getstream/chat/android/client/events/CidEvent;

    instance-of v15, v14, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-nez v15, :cond_7

    instance-of v14, v14, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz v14, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v11, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-virtual {v13}, Lio/getstream/chat/android/client/events/CidEvent;->getCid()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->addToFetchChannels(Ljava/util/List;)V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_b
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lio/getstream/chat/android/client/events/CidEvent;

    instance-of v14, v13, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-nez v14, :cond_c

    instance-of v13, v13, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz v13, :cond_b

    :cond_c
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v11, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-virtual {v12}, Lio/getstream/chat/android/client/events/CidEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_e
    invoke-virtual {v1, v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->addToRemoveChannels(Ljava/util/List;)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/client/events/HasPoll;

    invoke-interface {v10}, Lio/getstream/chat/android/client/events/HasPoll;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v10

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->addPollToFetch(Ljava/lang/String;)V

    goto :goto_9

    :cond_f
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_10
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lio/getstream/chat/android/client/events/UserEvent;

    if-eqz v12, :cond_10

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_11
    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/client/events/UserEvent;

    invoke-interface {v11}, Lio/getstream/chat/android/client/events/UserEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_13
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Lio/getstream/chat/android/client/events/HasOwnUser;

    if-eqz v13, :cond_13

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_14
    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v9, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/client/events/HasOwnUser;

    invoke-interface {v12}, Lio/getstream/chat/android/client/events/HasOwnUser;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_15
    invoke-static {v10, v11}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v1, v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->addUsers(Ljava/util/List;)V

    invoke-direct {v0, v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->extractMessageIds(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v1, v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->addToFetchMessages(Ljava/util/List;)V

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    move-object/from16 v12, p1

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v9, v10, v11, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->build(Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_16

    goto/16 :goto_32

    :cond_16
    move-object v9, v12

    :goto_e
    check-cast v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_67

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v12, v11, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v12, :cond_20

    move-object v12, v11

    check-cast v12, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v12}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v13

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v12}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v15

    invoke-direct {v0, v13, v1, v14, v15}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;

    move-result-object v13

    invoke-virtual {v12}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v12}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCid()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1, v14, v15, v13}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessageData(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v12}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCid()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v14

    if-nez v14, :cond_18

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {v12}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/4 v15, 0x2

    iput v15, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v14, v12, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v6, :cond_17

    goto/16 :goto_32

    :cond_17
    move-object/from16 v53, v11

    move-object v11, v1

    move-object v1, v12

    move-object v12, v3

    move-object v3, v13

    move-object v13, v9

    move-object/from16 v9, v53

    :goto_10
    move-object v14, v1

    check-cast v14, Lio/getstream/chat/android/models/Channel;

    move-object v1, v13

    move-object v13, v3

    move-object v3, v9

    move-object v9, v1

    move-object v1, v11

    goto :goto_11

    :cond_18
    move-object v12, v3

    move-object v3, v11

    :goto_11
    if-nez v14, :cond_1b

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v11

    invoke-virtual {v11}, Lb23/k;->c()Lb23/e;

    move-result-object v13

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-virtual {v11}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v13, v14, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_19

    invoke-virtual {v11}, Lb23/k;->a()Lb23/j;

    move-result-object v13

    invoke-virtual {v11}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v11

    check-cast v3, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCid()Ljava/lang/String;

    move-result-object v3

    const-string v15, "[updateOfflineStorage] #new_message; (now channel found for "

    const-string v5, ")"

    invoke-static {v15, v3, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v13, v14, v11, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_19
    move-object v3, v12

    :cond_1a
    :goto_12
    const/16 v5, 0xa

    goto/16 :goto_f

    :cond_1b
    invoke-virtual {v14}, Lio/getstream/chat/android/models/Channel;->getLastMessageAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v14}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v11

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Config;->getSkipLastMsgUpdateForSystemMsgs()Z

    move-result v11

    invoke-static {v13, v5, v11}, Lio/getstream/chat/android/client/utils/channel/ChannelUtilsKt;->calculateNewLastMessageAt(Lio/getstream/chat/android/models/Message;Ljava/util/Date;Z)Ljava/util/Date;

    move-result-object v48

    invoke-virtual {v14}, Lio/getstream/chat/android/models/Channel;->getHidden()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v11

    if-eqz v11, :cond_1c

    goto :goto_13

    :cond_1c
    move-object v5, v8

    :goto_13
    if-eqz v5, :cond_1d

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    goto :goto_14

    :cond_1d
    move v5, v7

    :goto_14
    invoke-virtual {v14}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    invoke-static {v13}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    check-cast v15, Ljava/lang/Iterable;

    invoke-static {v11, v15}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v26

    move-object v11, v3

    check-cast v11, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v11}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getChannelMessageCount()Ljava/lang/Integer;

    move-result-object v11

    if-nez v11, :cond_1e

    invoke-virtual {v14}, Lio/getstream/chat/android/models/Channel;->getMessageCount()Ljava/lang/Integer;

    move-result-object v11

    :cond_1e
    move-object/from16 v45, v11

    invoke-static {v5}, Lhg3/i;->u(Z)Ljava/lang/Boolean;

    move-result-object v34

    const/16 v51, 0x5

    const/16 v52, 0x0

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

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

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

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const v50, -0x40080801

    invoke-static/range {v14 .. v52}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v13, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_1f

    goto/16 :goto_32

    :cond_1f
    move-object v11, v12

    :goto_15
    move-object v12, v9

    move-object v9, v10

    move-object v10, v1

    :goto_16
    move-object v1, v11

    move-object v11, v3

    move-object v3, v1

    move-object v1, v10

    const/16 v13, 0xa

    :goto_17
    move-object v10, v9

    move-object v9, v12

    goto/16 :goto_2b

    :cond_20
    instance-of v5, v11, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    if-eqz v5, :cond_27

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v14

    invoke-direct {v0, v12, v1, v13, v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v13, v5, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessageData(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/4 v5, 0x4

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v12, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_21

    goto/16 :goto_32

    :cond_21
    move-object v12, v11

    move-object v11, v3

    move-object v3, v12

    move-object v12, v9

    move-object v9, v10

    move-object v10, v1

    :goto_18
    move-object v1, v3

    check-cast v1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    if-nez v5, :cond_23

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    const/4 v13, 0x5

    iput v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v5, v1, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_22

    goto/16 :goto_32

    :cond_22
    :goto_19
    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/models/Channel;

    :cond_23
    move-object v1, v9

    move-object/from16 v48, v11

    move-object/from16 v49, v12

    move-object v9, v5

    move-object v5, v3

    move-object v3, v10

    if-eqz v9, :cond_25

    move-object v10, v5

    check-cast v10, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {v10}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getChannelMessageCount()Ljava/lang/Integer;

    move-result-object v10

    if-nez v10, :cond_24

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Channel;->getMessageCount()Ljava/lang/Integer;

    move-result-object v10

    :cond_24
    move-object/from16 v40, v10

    const/16 v46, 0x7

    const/16 v47, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v45, -0x40000001    # -1.9999999f

    invoke-static/range {v9 .. v47}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v9

    invoke-virtual {v3, v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    :cond_25
    move-object v10, v1

    move-object v1, v3

    move-object v11, v5

    move-object/from16 v3, v48

    move-object/from16 v9, v49

    :cond_26
    :goto_1a
    const/16 v13, 0xa

    goto/16 :goto_2b

    :cond_27
    instance-of v5, v11, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v5, :cond_29

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v14

    invoke-direct {v0, v12, v1, v13, v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-direct {v0, v12, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->enrichWithOwnPoll(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v13, v5, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessageData(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/4 v5, 0x6

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v12, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_28

    goto/16 :goto_32

    :cond_28
    move-object v12, v11

    move-object v11, v3

    move-object v3, v12

    goto/16 :goto_15

    :cond_29
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    if-eqz v5, :cond_2b

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v14

    invoke-virtual {v1, v12, v13, v14}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessageData(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_2a

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_2a

    :goto_1b
    move-object v13, v12

    goto :goto_1c

    :cond_2a
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    goto :goto_1b

    :goto_1c
    invoke-static {v7}, Lhg3/i;->u(Z)Ljava/lang/Boolean;

    move-result-object v33

    const/16 v50, 0x7

    const/16 v51, 0x0

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

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

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

    const v49, -0x80001

    invoke-static/range {v13 .. v51}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_2b
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    if-eqz v5, :cond_2d

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_2c

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_2c

    goto :goto_1d

    :cond_2c
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_1d
    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v5

    invoke-static {v12, v13, v5}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->addMembership(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_2d
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationInvitedEvent;

    if-eqz v5, :cond_2e

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationInvitedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInvitedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInvitedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    goto/16 :goto_1a

    :cond_2e
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    if-eqz v5, :cond_30

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_2f

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_2f

    goto :goto_1e

    :cond_2f
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_1e
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v13

    invoke-virtual {v1, v13}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_30
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    if-eqz v5, :cond_32

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_31

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_31

    goto :goto_1f

    :cond_31
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_1f
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v13

    invoke-virtual {v1, v13}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_32
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    if-eqz v5, :cond_34

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    if-eqz v13, :cond_26

    invoke-static {v4}, Lhg3/i;->u(Z)Ljava/lang/Boolean;

    move-result-object v33

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getClearHistory()Z

    move-result v5

    if-eqz v5, :cond_33

    move-object/from16 v34, v12

    goto :goto_20

    :cond_33
    move-object/from16 v34, v8

    :goto_20
    const/16 v50, 0x7

    const/16 v51, 0x0

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

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

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

    const v49, -0x180001

    invoke-static/range {v13 .. v51}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_34
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    if-eqz v5, :cond_35

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_26

    invoke-static {v7}, Lhg3/i;->u(Z)Ljava/lang/Boolean;

    move-result-object v32

    const/16 v49, 0x7

    const/16 v50, 0x0

    const/4 v13, 0x0

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

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

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

    const v48, -0x80001

    invoke-static/range {v12 .. v50}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_35
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    if-eqz v5, :cond_36

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-direct {v0, v12, v1, v13, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/4 v12, 0x7

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_28

    goto/16 :goto_32

    :cond_36
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    if-eqz v5, :cond_37

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-direct {v0, v12, v1, v13, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v12, 0x8

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_28

    goto/16 :goto_32

    :cond_37
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    if-eqz v5, :cond_38

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-direct {v0, v12, v1, v13, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v12, 0x9

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->addThreadIfExists(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_28

    goto/16 :goto_32

    :cond_38
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    if-eqz v5, :cond_39

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_26

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v13

    invoke-virtual {v13}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getShadow()Z

    move-result v14

    invoke-static {v12, v13, v4, v14}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMemberBanned(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ZZ)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v12, v5, v4}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMembershipBanned(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Z)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_39
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    if-eqz v5, :cond_3a

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_26

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v13

    invoke-virtual {v13}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v7, v7}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMemberBanned(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ZZ)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v12, v5, v7}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMembershipBanned(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Z)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_3a
    instance-of v5, v11, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    if-eqz v5, :cond_3b

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_26

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->addMember(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v5

    invoke-static {v12, v13, v5}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->addMembership(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_3b
    instance-of v5, v11, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    if-eqz v5, :cond_3c

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_26

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMember(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v5

    invoke-static {v12, v5}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMembership(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_3c
    instance-of v5, v11, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    if-eqz v5, :cond_3e

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v12

    invoke-virtual {v12}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3d

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v5

    invoke-virtual {v5}, Lb23/k;->c()Lb23/e;

    move-result-object v11

    sget-object v12, Lb23/g;->z:Lb23/g;

    invoke-virtual {v5}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v11, v12, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1a

    invoke-virtual {v5}, Lb23/k;->a()Lb23/j;

    move-result-object v11

    invoke-virtual {v5}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    const-string v13, "[updateOfflineStorage] skip MemberRemovedEvent for currentUser"

    invoke-static {v11, v12, v5, v13}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_12

    :cond_3d
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_26

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v12, v5}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->removeMember(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v5, v12}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->removeMembership(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_3e
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    if-eqz v5, :cond_3f

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_26

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v12, v13}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->removeMembership(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v14

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v25

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v27

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v19

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v28

    const/16 v51, 0x7

    const/16 v52, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

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

    const/16 v50, -0x3411

    invoke-static/range {v14 .. v52}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_3f
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    if-eqz v5, :cond_41

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_40

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_40

    goto :goto_21

    :cond_40
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_21
    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_41
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    if-eqz v5, :cond_43

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_42

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_42

    goto :goto_22

    :cond_42
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_22
    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_43
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-eqz v5, :cond_45

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_44

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_44

    goto :goto_23

    :cond_44
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_23
    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_45
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    if-eqz v5, :cond_47

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_46

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_46

    goto :goto_24

    :cond_46
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_24
    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_47
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz v5, :cond_49

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_48

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_48

    goto :goto_25

    :cond_48
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_25
    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_49
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    if-eqz v5, :cond_4b

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_4a

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v13

    invoke-static {v12, v13}, Lio/getstream/chat/android/models/ChannelKt;->mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_4a

    goto :goto_26

    :cond_4a
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    :goto_26
    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_1a

    :cond_4b
    instance-of v5, v11, Lio/getstream/chat/android/client/events/MessageReadEvent;

    if-eqz v5, :cond_4f

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/MessageReadEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_4c

    invoke-static {v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/MessageReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v13

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v12, v13, v14}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateReads(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/ChannelUserRead;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_4c

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    :cond_4c
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v5

    if-eqz v5, :cond_26

    invoke-virtual {v5}, Lio/getstream/chat/android/models/ThreadInfo;->getParentMessageId()Ljava/lang/String;

    move-result-object v12

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->I$0:I

    const/16 v13, 0xa

    iput v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v12, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v6, :cond_4d

    goto/16 :goto_32

    :cond_4d
    move-object/from16 v53, v11

    move-object v11, v1

    move-object v1, v12

    move-object v12, v3

    move-object v3, v5

    move-object v5, v9

    move-object/from16 v9, v53

    :goto_27
    check-cast v1, Lio/getstream/chat/android/models/Thread;

    if-eqz v1, :cond_4e

    move-object v14, v9

    check-cast v14, Lio/getstream/chat/android/client/events/MessageReadEvent;

    invoke-virtual {v14}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v15

    invoke-virtual {v14}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v14

    invoke-static {v1, v3, v15, v14}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->markAsReadByUser(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/Thread;

    move-result-object v1

    if-eqz v1, :cond_4e

    invoke-virtual {v11, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addThread(Lio/getstream/chat/android/models/Thread;)V

    :cond_4e
    move-object v1, v11

    move-object v3, v12

    move-object v11, v9

    move-object v9, v5

    goto/16 :goto_2b

    :cond_4f
    const/16 v13, 0xa

    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    if-eqz v5, :cond_50

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_63

    invoke-static {v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v5

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v12, v5, v14}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateReads(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/ChannelUserRead;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    if-eqz v5, :cond_63

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    goto/16 :goto_2b

    :cond_50
    instance-of v5, v11, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    if-eqz v5, :cond_54

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_51

    invoke-static {v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v14

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v12, v14, v15}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateReads(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/ChannelUserRead;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    if-eqz v12, :cond_51

    invoke-virtual {v1, v12}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    :cond_51
    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getThreadId()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_63

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->I$0:I

    const/16 v12, 0xb

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_52

    goto/16 :goto_32

    :cond_52
    move-object v12, v11

    move-object v11, v3

    move-object v3, v12

    move-object v12, v9

    move-object v9, v10

    move-object v10, v1

    move-object v1, v5

    :goto_28
    check-cast v1, Lio/getstream/chat/android/models/Thread;

    if-eqz v1, :cond_53

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v14

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    invoke-static {v1, v14, v5}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->markAsUnreadByUser(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/Thread;

    move-result-object v1

    if-eqz v1, :cond_53

    invoke-virtual {v10, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addThread(Lio/getstream/chat/android/models/Thread;)V

    :cond_53
    :goto_29
    move-object v1, v11

    move-object v11, v3

    move-object v3, v1

    move-object v1, v10

    goto/16 :goto_17

    :cond_54
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;

    if-eqz v5, :cond_56

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/ThreadInfo;->getParentMessageId()Ljava/lang/String;

    move-result-object v5

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v12, 0xc

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->threadFromPendingUpdateOrRepo(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_55

    goto/16 :goto_32

    :cond_55
    move-object v12, v11

    move-object v11, v3

    move-object v3, v12

    move-object v12, v9

    move-object v9, v10

    move-object v10, v1

    move-object v1, v5

    :goto_2a
    check-cast v1, Lio/getstream/chat/android/models/Thread;

    if-eqz v1, :cond_53

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v5

    invoke-static {v1, v5}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->applyThreadUpdatedEventChanges(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/ThreadInfo;)Lio/getstream/chat/android/models/Thread;

    move-result-object v1

    if-eqz v1, :cond_53

    invoke-virtual {v10, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addThread(Lio/getstream/chat/android/models/Thread;)V

    goto :goto_29

    :cond_56
    instance-of v5, v11, Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;

    if-eqz v5, :cond_57

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v14

    invoke-static {v4}, Lhg3/i;->u(Z)Ljava/lang/Boolean;

    move-result-object v22

    const v40, 0x1ffff7f

    const/16 v41, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

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

    invoke-static/range {v14 .. v41}, Lio/getstream/chat/android/models/User;->copy$default(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    goto/16 :goto_2b

    :cond_57
    instance-of v5, v11, Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;

    if-eqz v5, :cond_58

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v14

    invoke-static {v7}, Lhg3/i;->u(Z)Ljava/lang/Boolean;

    move-result-object v22

    const v40, 0x1ffff7f

    const/16 v41, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

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

    invoke-static/range {v14 .. v41}, Lio/getstream/chat/android/models/User;->copy$default(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUser(Lio/getstream/chat/android/models/User;)V

    goto/16 :goto_2b

    :cond_58
    instance-of v5, v11, Lio/getstream/chat/android/client/events/PollClosedEvent;

    if-eqz v5, :cond_59

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/PollClosedEvent;

    new-instance v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$25;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$25;-><init>(Ljava/lang/Object;)V

    invoke-static {v5, v12}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollClosedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addPoll(Lio/getstream/chat/android/models/Poll;)V

    goto/16 :goto_2b

    :cond_59
    instance-of v5, v11, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    if-eqz v5, :cond_5a

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    new-instance v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$26;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$26;-><init>(Ljava/lang/Object;)V

    invoke-static {v5, v12}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollUpdatedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addPoll(Lio/getstream/chat/android/models/Poll;)V

    goto/16 :goto_2b

    :cond_5a
    instance-of v5, v11, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    if-eqz v5, :cond_5b

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    new-instance v14, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$27;

    invoke-direct {v14, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$27;-><init>(Ljava/lang/Object;)V

    invoke-static {v5, v12, v14}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteCastedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addPoll(Lio/getstream/chat/android/models/Poll;)V

    goto/16 :goto_2b

    :cond_5b
    instance-of v5, v11, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    if-eqz v5, :cond_5c

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    new-instance v14, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$28;

    invoke-direct {v14, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$28;-><init>(Ljava/lang/Object;)V

    invoke-static {v5, v12, v14}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteChangedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addPoll(Lio/getstream/chat/android/models/Poll;)V

    goto/16 :goto_2b

    :cond_5c
    instance-of v5, v11, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    if-eqz v5, :cond_5d

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    new-instance v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$29;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$29;-><init>(Ljava/lang/Object;)V

    invoke-static {v5, v12}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteRemovedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addPoll(Lio/getstream/chat/android/models/Poll;)V

    goto/16 :goto_2b

    :cond_5d
    instance-of v5, v11, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    if-eqz v5, :cond_5e

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    new-instance v12, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$30;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$30;-><init>(Ljava/lang/Object;)V

    invoke-static {v5, v12}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/AnswerCastedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addPoll(Lio/getstream/chat/android/models/Poll;)V

    goto/16 :goto_2b

    :cond_5e
    instance-of v5, v11, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    if-eqz v5, :cond_5f

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/PollDeletedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->deletePoll(Lio/getstream/chat/android/models/Poll;)V

    goto/16 :goto_2b

    :cond_5f
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    if-eqz v5, :cond_61

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v5

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v14, 0xd

    iput v14, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v12, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->upsertReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_60

    goto/16 :goto_32

    :cond_60
    move-object v12, v11

    move-object v11, v3

    move-object v3, v12

    move-object v12, v9

    move-object v9, v10

    move-object v10, v1

    goto/16 :goto_29

    :cond_61
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    if-eqz v5, :cond_62

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v5

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v14, 0xe

    iput v14, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v12, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->upsertReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_60

    goto/16 :goto_32

    :cond_62
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    if-eqz v5, :cond_63

    move-object v5, v11

    check-cast v5, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v5

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v12, 0xf

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct {v0, v1, v5, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->deleteReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_60

    goto/16 :goto_32

    :cond_63
    :goto_2b
    instance-of v5, v11, Lio/getstream/chat/android/client/events/ConnectedEvent;

    if-eqz v5, :cond_65

    invoke-virtual {v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->isFromSocketConnection()Z

    move-result v5

    if-eqz v5, :cond_64

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v11, Lio/getstream/chat/android/client/events/ConnectedEvent;

    invoke-virtual {v11}, Lio/getstream/chat/android/client/events/ConnectedEvent;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object v11

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v12, 0x10

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v5, v11, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_64

    goto/16 :goto_32

    :cond_64
    :goto_2c
    move v5, v13

    goto/16 :goto_f

    :cond_65
    instance-of v5, v11, Lio/getstream/chat/android/client/events/HasOwnUser;

    if-eqz v5, :cond_66

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v11, Lio/getstream/chat/android/client/events/HasOwnUser;

    invoke-interface {v11}, Lio/getstream/chat/android/client/events/HasOwnUser;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object v11

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v12, 0x11

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v5, v11, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_64

    goto/16 :goto_32

    :cond_66
    instance-of v5, v11, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    if-eqz v5, :cond_64

    check-cast v11, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    invoke-virtual {v11}, Lio/getstream/chat/android/client/events/UserUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_64

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {v11}, Lio/getstream/chat/android/client/events/UserUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v11

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v12, 0x12

    iput v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v5, v11, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_64

    goto/16 :goto_32

    :cond_67
    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$10:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$11:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$12:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$13:Ljava/lang/Object;

    const/16 v4, 0x13

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->execute(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_68

    goto/16 :goto_32

    :cond_68
    move-object v4, v9

    :goto_2d
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v7, v1

    move-object v5, v2

    :goto_2e
    move-object v9, v4

    :cond_69
    :goto_2f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_78

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v1, v3, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    if-eqz v1, :cond_6a

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v4, 0x14

    iput v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v3, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto/16 :goto_32

    :cond_6a
    instance-of v1, v3, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    if-eqz v1, :cond_6b

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v3, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v4, 0x15

    iput v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v3, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto/16 :goto_32

    :cond_6b
    instance-of v1, v3, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-eqz v1, :cond_6e

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-object v2, v3

    check-cast v2, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v10, 0x16

    iput v10, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v4, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_6c

    goto/16 :goto_32

    :cond_6c
    move-object v2, v5

    move-object v4, v7

    move-object v5, v9

    :goto_30
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v3, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v9, 0x17

    iput v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v7, v3, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->setChannelDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_6d

    goto/16 :goto_32

    :cond_6d
    move-object v7, v4

    move-object v9, v5

    goto/16 :goto_1

    :cond_6e
    instance-of v1, v3, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    if-eqz v1, :cond_70

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-object v2, v3

    check-cast v2, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v4, 0x18

    iput v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_6f

    goto/16 :goto_32

    :cond_6f
    :goto_31
    check-cast v3, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getClearHistory()Z

    move-result v1

    if-eqz v1, :cond_69

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v4, 0x19

    iput v4, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v3, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto/16 :goto_32

    :cond_70
    instance-of v1, v3, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    if-eqz v1, :cond_72

    check-cast v3, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getHardDelete()Z

    move-result v1

    if-eqz v1, :cond_71

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v3, 0x1a

    iput v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto/16 :goto_32

    :cond_71
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v3, 0x1b

    iput v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->markMessageAsDeleted(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto/16 :goto_32

    :cond_72
    instance-of v1, v3, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v1, :cond_73

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v3, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v3, 0x1c

    iput v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->updateChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto/16 :goto_32

    :cond_73
    instance-of v1, v3, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    if-eqz v1, :cond_74

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v3, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v3, 0x1d

    iput v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto/16 :goto_32

    :cond_74
    instance-of v1, v3, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    if-eqz v1, :cond_75

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v3, 0x1e

    iput v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto :goto_32

    :cond_75
    instance-of v1, v3, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    if-eqz v1, :cond_76

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast v3, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/PollDeletedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v3, 0x1f

    iput v3, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_69

    goto :goto_32

    :cond_76
    instance-of v1, v3, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    if-eqz v1, :cond_77

    check-cast v3, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    invoke-virtual {v4}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getHardDelete()Z

    move-result v3

    invoke-virtual {v4}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    iput-object v9, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$8:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->L$9:Ljava/lang/Object;

    const/16 v10, 0x20

    iput v10, v5, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$1;->label:I

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->deleteMessagesFromUser(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_77

    :goto_32
    return-object v6

    :cond_77
    :goto_33
    move-object/from16 v0, p0

    goto/16 :goto_2f

    :cond_78
    invoke-direct/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_79

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[updateOfflineStorage] completed batchId: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_79
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method private final updateQueryThreadsState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSize()I

    move-result v1

    const-string v4, "[updateQueryThreadsState] batchEvent.size: "

    invoke-static {v1, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->handleEvents$stream_chat_android_client_release(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final updateThreadState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSize()I

    move-result v1

    const-string v5, "[updateThreadState] batchEvent.size: "

    invoke-static {v1, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lio/getstream/chat/android/client/events/HasMessage;

    if-eqz v5, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/client/events/HasMessage;

    invoke-interface {v5}, Lio/getstream/chat/android/client/events/HasMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-interface {v5}, Lio/getstream/chat/android/client/events/HasMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    :cond_3
    invoke-virtual {v2, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->isActiveThread(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v3

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handleMessageEvents$stream_chat_android_client_release(Ljava/util/List;)V

    goto :goto_3

    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lio/getstream/chat/android/client/events/HasReminder;

    if-eqz v5, :cond_9

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/client/events/HasReminder;

    invoke-interface {v5}, Lio/getstream/chat/android/client/events/HasReminder;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/MessageReminder;->getMessageId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_b

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->isActiveThread(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_e
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v3

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handleReminderEvents$stream_chat_android_client_release(Ljava/util/List;)V

    goto :goto_7

    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lio/getstream/chat/android/client/events/HasPoll;

    if-eqz v3, :cond_10

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/events/HasPoll;

    invoke-interface {v3}, Lio/getstream/chat/android/client/events/HasPoll;->getMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_12

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_13
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_14

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->isActiveThread(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_15
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_16
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v2, :cond_16

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handlePollEvents$stream_chat_android_client_release(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_b

    :cond_17
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_18

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getId()I

    move-result p1

    const-string v1, "[updateThreadState] completed batchId: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v2, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_18
    return-void
.end method

.method private final upsertReminder(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Lq83/d;)Ljava/lang/Object;
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/MessageReminder;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/MessageReminder;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p3 .. p3}, Lio/getstream/chat/android/models/MessageReminder;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual/range {p1 .. p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-nez v1, :cond_4

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-object/from16 v4, p1

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->L$1:Ljava/lang/Object;

    move-object/from16 v6, p3

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$upsertReminder$1;->label:I

    move-object/from16 v5, p2

    invoke-virtual {v1, v5, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v4

    move-object v3, v6

    :goto_1
    check-cast v1, Lio/getstream/chat/android/models/Message;

    move-object v7, v1

    move-object v4, v2

    move-object v6, v3

    goto :goto_2

    :cond_4
    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object v7, v1

    :goto_2
    if-eqz v7, :cond_5

    invoke-static {v6}, Lio/getstream/chat/android/client/extensions/internal/MessageReminderKt;->toMessageReminderInfo(Lio/getstream/chat/android/models/MessageReminder;)Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v52

    const v57, 0xefff

    const/16 v58, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, -0x1

    invoke-static/range {v7 .. v58}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method


# virtual methods
.method public final handleEvents([Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {p1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;-><init>(ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->handleBatchEvent(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final startListening()V
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    invoke-interface {v0}, Lio/getstream/chat/android/client/utils/observable/Disposable;->isDisposed()Z

    move-result v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->z:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->currentUserId:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[startListening] isDisposed: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, ", currentUserId: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$initJob$1;

    invoke-direct {v1, p0, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$initJob$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, v5, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->scope:Lbc3/c0;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2;

    invoke-direct {v3, p0, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lq83/d;)V

    invoke-static {v1, v5, v5, v3, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;

    invoke-direct {v1, p0, v0, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lbc3/k1;Lq83/d;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->scope:Lbc3/c0;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$3;

    invoke-direct {v3, p0, v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$3;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lc93/m;Lq83/d;)V

    invoke-static {v0, v5, v5, v3, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferConfig:Lio/getstream/chat/android/client/api/MessageBufferConfig;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/MessageBufferConfig;->getChannelTypes()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->scope:Lbc3/c0;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$4;

    invoke-direct {v4, p0, v1, v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$4;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lc93/m;Lq83/d;)V

    invoke-static {v3, v5, v5, v4, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->bufferedSocketEventListener:Lio/getstream/chat/android/client/ChatEventListener;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->defaultSocketEventListener:Lio/getstream/chat/android/client/ChatEventListener;

    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->subscribeForEvents:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/utils/observable/Disposable;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    :cond_3
    return-void
.end method

.method public final stopListening()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[stopListening] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->eventsDisposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    invoke-interface {v0}, Lio/getstream/chat/android/client/utils/observable/Disposable;->dispose()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->scope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->k(Lbc3/k1;)V

    return-void
.end method
