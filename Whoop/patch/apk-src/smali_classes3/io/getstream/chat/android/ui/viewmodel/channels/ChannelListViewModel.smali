.class public final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;,
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Companion;,
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;,
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;,
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;,
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010%\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 z2\u00020\u0001:\u0006{|}~\u007fzBS\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bs\u0008\u0016\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0018B\u008f\u0001\u0008\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0016\u0008\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0016\u0008\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u001fJ\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0015\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016\u00a2\u0006\u0004\u0008(\u0010\'J\r\u0010)\u001a\u00020\"\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u0013\u00a2\u0006\u0004\u0008,\u0010-J\u0015\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000eH\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u00080\u0010*J\u000f\u00101\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u00081\u0010*J%\u00108\u001a\u0002072\u0006\u00103\u001a\u0002022\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020504H\u0002\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010:\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008:\u0010*J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0002\u00a2\u0006\u0004\u0008<\u0010=J#\u0010A\u001a\u00020\"2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ1\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u0016042\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u0016042\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020504H\u0002\u00a2\u0006\u0004\u0008D\u0010EJG\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J\"\u0004\u0008\u0000\u0010F\"\u0004\u0008\u0001\u0010G*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b2\u0006\u0010H\u001a\u00028\u00002\u0006\u0010I\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\u0008K\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010NR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010OR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010OR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010PR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010QR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010RR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u001a\u0010X\u001a\u0008\u0012\u0004\u0012\u0002070W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u001d\u0010[\u001a\u0008\u0012\u0004\u0012\u0002070Z8\u0006\u00a2\u0006\u000c\n\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^R)\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020_0\u001b0Z8\u0006\u00a2\u0006\u000c\n\u0004\u0008`\u0010\\\u001a\u0004\u0008a\u0010^R)\u0010c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020b0\u001b0Z8\u0006\u00a2\u0006\u000c\n\u0004\u0008c\u0010\\\u001a\u0004\u0008d\u0010^R \u00106\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u000205040e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u0010fR\u001a\u0010g\u001a\u0008\u0012\u0004\u0012\u00020?0W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010YR\u001d\u0010h\u001a\u0008\u0012\u0004\u0012\u00020?0Z8\u0006\u00a2\u0006\u000c\n\u0004\u0008h\u0010\\\u001a\u0004\u0008i\u0010^R \u0010m\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020l0k0j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR#\u0010o\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020l0k0Z8\u0006\u00a2\u0006\u000c\n\u0004\u0008o\u0010\\\u001a\u0004\u0008p\u0010^R\u001b\u0010v\u001a\u00020q8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008r\u0010s\u001a\u0004\u0008t\u0010uR\u001c\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010nR\u001e\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010x0e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008y\u0010f\u00a8\u0006\u0080\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;",
        "mode",
        "",
        "limit",
        "messageLimit",
        "memberLimit",
        "",
        "isDraftMessagesEnabled",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "chatEventHandlerFactory",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "<init>",
        "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "sort",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V",
        "",
        "predefinedFilterName",
        "",
        "",
        "filterValues",
        "sortValues",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;",
        "action",
        "Ll83/a0;",
        "onAction",
        "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;)V",
        "channel",
        "leaveChannel",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "deleteChannel",
        "markAllRead",
        "()V",
        "filterObject",
        "setFilters",
        "(Lio/getstream/chat/android/models/FilterObject;)V",
        "buildDefaultFilter",
        "()Lec3/l;",
        "initData",
        "init",
        "Lio/getstream/chat/android/client/api/state/ChannelsStateData;",
        "channelState",
        "",
        "Lio/getstream/chat/android/models/ChannelMute;",
        "channelMutes",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;",
        "handleChannelStateNews",
        "(Lio/getstream/chat/android/client/api/state/ChannelsStateData;Ljava/util/List;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;",
        "requestMoreChannels",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "buildQueryChannelsRequest",
        "()Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;",
        "reducer",
        "setPaginationState",
        "(Lkotlin/jvm/functions/Function1;)V",
        "channels",
        "parseMutedChannels",
        "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;",
        "K",
        "V",
        "changeKey",
        "changeValue",
        "",
        "clone",
        "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;",
        "I",
        "Ljava/lang/Integer;",
        "Z",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lec3/l;",
        "Lbc3/k1;",
        "queryJob",
        "Lbc3/k1;",
        "Landroidx/lifecycle/t0;",
        "stateMerger",
        "Landroidx/lifecycle/t0;",
        "Landroidx/lifecycle/p0;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "typingEvents",
        "getTypingEvents",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "draftMessages",
        "getDraftMessages",
        "Lec3/f2;",
        "Lec3/f2;",
        "paginationStateMerger",
        "paginationState",
        "getPaginationState",
        "Landroidx/lifecycle/u0;",
        "Lio/getstream/chat/android/client/api/state/Event;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;",
        "_errorEvents",
        "Landroidx/lifecycle/u0;",
        "errorEvents",
        "getErrorEvents",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "filterLiveData",
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "queryChannelsState",
        "Companion",
        "State",
        "PaginationState",
        "Action",
        "ErrorEvent",
        "QueryMode",
        "stream-chat-android-ui-components_release"
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
.field public static final Companion:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Companion;

.field public static final DEFAULT_CHANNEL_LIMIT:I = 0x1e

.field public static final DEFAULT_SORT:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field

.field private static final INITIAL_STATE:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;


# instance fields
.field private final _errorEvents:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final channelMutes:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

.field private final draftMessages:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final errorEvents:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final filterLiveData:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final globalState:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final isDraftMessagesEnabled:Z

.field private final limit:I

.field private final logger$delegate:Ll83/h;

.field private final memberLimit:Ljava/lang/Integer;

.field private final messageLimit:Ljava/lang/Integer;

.field private final mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

.field private final paginationState:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final paginationStateMerger:Landroidx/lifecycle/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/t0;"
        }
    .end annotation
.end field

.field private queryChannelsState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private queryJob:Lbc3/k1;

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final stateMerger:Landroidx/lifecycle/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/t0;"
        }
    .end annotation
.end field

.field private final typingEvents:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->Companion:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Companion;

    sget-object v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    const-string v1, "last_updated"

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->DEFAULT_SORT:Lio/getstream/chat/android/models/querysort/QuerySorter;

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    const/4 v1, 0x1

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;-><init>(ZLjava/util/List;)V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->INITIAL_STATE:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalState"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    .line 53
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    move-object p1, p0

    .line 54
    invoke-direct/range {p1 .. p9}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 48
    sget-object p2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->DEFAULT_SORT:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    const/16 p3, 0x1e

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_5

    .line 49
    new-instance p7, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    const/4 p11, 0x1

    invoke-direct {p7, v0, p11, v0}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_5
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_6

    .line 50
    sget-object p8, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p8}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p8

    :cond_6
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_7

    .line 51
    invoke-static {p8}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getGlobalStateFlow(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;

    move-result-object p9

    :cond_7
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 52
    invoke-direct/range {p1 .. p10}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    .line 3
    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->limit:I

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->messageLimit:Ljava/lang/Integer;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->memberLimit:Ljava/lang/Integer;

    .line 6
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->isDraftMessagesEnabled:Z

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->globalState:Lec3/l;

    .line 10
    new-instance p2, Landroidx/lifecycle/t0;

    invoke-direct {p2}, Landroidx/lifecycle/t0;-><init>()V

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->stateMerger:Landroidx/lifecycle/t0;

    .line 11
    invoke-static {p2}, Landroidx/lifecycle/x1;->a(Landroidx/lifecycle/t0;)Landroidx/lifecycle/t0;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->state:Landroidx/lifecycle/p0;

    .line 12
    new-instance p3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$special$$inlined$flatMapLatest$1;

    const/4 p4, 0x3

    const/4 p6, 0x0

    .line 13
    invoke-direct {p3, p4, p6}, Ls83/i;-><init>(ILq83/d;)V

    .line 14
    invoke-static {p8, p3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p3

    .line 15
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p7

    sget-object v0, Lec3/z1;->a:Lec3/b2;

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-static {p3, p7, v0, v1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p3

    .line 16
    invoke-static {p3, p6, p4}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->typingEvents:Landroidx/lifecycle/p0;

    if-eqz p5, :cond_0

    .line 17
    new-instance p3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$special$$inlined$flatMapLatest$2;

    .line 18
    invoke-direct {p3, p4, p6}, Ls83/i;-><init>(ILq83/d;)V

    .line 19
    invoke-static {p8, p3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p3

    .line 20
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p5

    invoke-static {p3, p5, v0, v1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p3

    .line 21
    invoke-static {p3, p6, p4}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p3

    goto :goto_0

    .line 22
    :cond_0
    new-instance p3, Landroidx/lifecycle/u0;

    .line 23
    invoke-direct {p3, v1}, Landroidx/lifecycle/p0;-><init>(Ljava/lang/Object;)V

    .line 24
    :goto_0
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->draftMessages:Landroidx/lifecycle/p0;

    .line 25
    new-instance p3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$special$$inlined$flatMapLatest$3;

    .line 26
    invoke-direct {p3, p4, p6}, Ls83/i;-><init>(ILq83/d;)V

    .line 27
    invoke-static {p8, p3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p3

    .line 28
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p5

    sget-object p7, Lm83/y;->w:Lm83/y;

    invoke-static {p3, p5, v0, p7}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->channelMutes:Lec3/f2;

    .line 29
    new-instance p3, Landroidx/lifecycle/t0;

    invoke-direct {p3}, Landroidx/lifecycle/t0;-><init>()V

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->paginationStateMerger:Landroidx/lifecycle/t0;

    .line 30
    invoke-static {p3}, Landroidx/lifecycle/x1;->a(Landroidx/lifecycle/t0;)Landroidx/lifecycle/t0;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->paginationState:Landroidx/lifecycle/p0;

    .line 31
    new-instance p3, Landroidx/lifecycle/u0;

    .line 32
    invoke-direct {p3}, Landroidx/lifecycle/p0;-><init>()V

    .line 33
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->_errorEvents:Landroidx/lifecycle/u0;

    .line 34
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    .line 35
    const-string p3, "Chat:ChannelList-VM"

    invoke-static {p0, p3}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->logger$delegate:Ll83/h;

    .line 36
    new-instance p3, Landroidx/lifecycle/u0;

    .line 37
    instance-of p5, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    if-eqz p5, :cond_1

    move-object p7, p1

    check-cast p7, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    invoke-virtual {p7}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;->getInitialFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object p7

    goto :goto_1

    .line 38
    :cond_1
    instance-of p7, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    if-eqz p7, :cond_5

    move-object p7, p6

    .line 39
    :goto_1
    invoke-direct {p3, p7}, Landroidx/lifecycle/p0;-><init>(Ljava/lang/Object;)V

    .line 40
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->filterLiveData:Landroidx/lifecycle/u0;

    .line 41
    invoke-static {p6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p7

    iput-object p7, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->queryChannelsState:Lec3/f2;

    if-eqz p5, :cond_3

    .line 42
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;->getInitialFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    if-nez p1, :cond_2

    .line 43
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p5, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$1;

    invoke-direct {p5, p0, p6}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lq83/d;)V

    invoke-static {p1, p6, p6, p5, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    .line 44
    :cond_2
    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/channels/c;

    const/4 p4, 0x5

    invoke-direct {p1, p0, p4}, Lio/getstream/chat/android/ui/viewmodel/channels/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V

    new-instance p4, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p4, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p3, p4}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    return-void

    .line 45
    :cond_3
    instance-of p1, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->initData()V

    return-void

    .line 46
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 47
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalState"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    .line 59
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    invoke-direct {p2, p1, v0, p3}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    move-object p1, p0

    move p3, p4

    move-object p4, p5

    move-object p5, p6

    move p6, p7

    move-object p7, p8

    move-object p8, p9

    move-object p9, p10

    .line 60
    invoke-direct/range {p1 .. p9}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x2

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_2

    const/16 p4, 0x1e

    :cond_2
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_5

    .line 55
    new-instance p8, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    const/4 p12, 0x1

    invoke-direct {p8, v0, p12, v0}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_5
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_6

    .line 56
    sget-object p9, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p9}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p9

    :cond_6
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_7

    .line 57
    invoke-static {p9}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getGlobalStateFlow(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;

    move-result-object p10

    :cond_7
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 58
    invoke-direct/range {p1 .. p11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V

    return-void
.end method

.method private static final _init_$lambda$3(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/FilterObject;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->initData()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic access$buildDefaultFilter(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->buildDefaultFilter()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getChannelMutes$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lec3/f2;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->channelMutes:Lec3/f2;

    return-object p0
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$getFilterLiveData$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/u0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->filterLiveData:Landroidx/lifecycle/u0;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPaginationStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->paginationStateMerger:Landroidx/lifecycle/t0;

    return-object p0
.end method

.method public static final synthetic access$getQueryChannelsState$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lec3/f2;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->queryChannelsState:Lec3/f2;

    return-object p0
.end method

.method public static final synthetic access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->stateMerger:Landroidx/lifecycle/t0;

    return-object p0
.end method

.method public static final synthetic access$handleChannelStateNews(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/state/ChannelsStateData;Ljava/util/List;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->handleChannelStateNews(Lio/getstream/chat/android/client/api/state/ChannelsStateData;Ljava/util/List;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$parseMutedChannels(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->parseMutedChannels(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setPaginationState(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->setPaginationState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final buildDefaultFilter()Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/models/Filters;->INSTANCE:Lio/getstream/chat/android/models/Filters;

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$buildDefaultFilter$$inlined$map$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$buildDefaultFilter$$inlined$map$1;-><init>(Lec3/l;Lio/getstream/chat/android/models/Filters;)V

    new-instance v0, Lch/i;

    const/4 v1, 0x2

    invoke-direct {v0, v2, v1}, Lch/i;-><init>(Lec3/l;I)V

    return-object v0
.end method

.method private final buildQueryChannelsRequest()Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    instance-of v1, v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->filterLiveData:Landroidx/lifecycle/u0;

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/FilterObject;

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;->getInitialSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v5

    iget v4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->limit:I

    iget-object v6, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->messageLimit:Ljava/lang/Integer;

    iget-object v7, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->memberLimit:Ljava/lang/Integer;

    new-instance v1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    const/16 v11, 0x1c2

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v1, v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    if-eqz v1, :cond_2

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;->getName()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;->getFilterValues()Ljava/util/Map;

    move-result-object v4

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;->getSortValues()Ljava/util/Map;

    move-result-object v5

    iget v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->limit:I

    iget-object v7, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->messageLimit:Ljava/lang/Integer;

    iget-object v8, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->memberLimit:Ljava/lang/Integer;

    new-instance v1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final clone(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;+TV;>;TK;TV;)",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static final deleteChannel$lambda$11(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)Ll83/a0;
    .locals 8

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object v4

    const-string v5, ". Error: "

    const-string v6, ". Cause: "

    const-string v7, "Could not delete channel with id: "

    invoke-static {v7, p1, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->_errorEvents:Landroidx/lifecycle/u0;

    new-instance p1, Lio/getstream/chat/android/client/api/state/Event;

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;-><init>(Ln23/e;)V

    invoke-direct {p1, v0}, Lio/getstream/chat/android/client/api/state/Event;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->deleteChannel$lambda$11(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handleChannelStateNews(Lio/getstream/chat/android/client/api/state/ChannelsStateData;Ljava/util/List;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/state/ChannelsStateData;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;)",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/client/api/state/ChannelsStateData$NoQueryActive;

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_3

    instance-of v0, p1, Lio/getstream/chat/android/client/api/state/ChannelsStateData$Loading;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/api/state/ChannelsStateData$OfflineNoResults;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    invoke-direct {p1, v2, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;-><init>(ZLjava/util/List;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/api/state/ChannelsStateData$Result;

    if-eqz v0, :cond_2

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    check-cast p1, Lio/getstream/chat/android/client/api/state/ChannelsStateData$Result;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/state/ChannelsStateData$Result;->getChannels()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->parseMutedChannels(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;-><init>(ZLjava/util/List;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    const/4 p2, 0x1

    invoke-direct {p1, p2, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;-><init>(ZLjava/util/List;)V

    return-object p1
.end method

.method private final init()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->buildQueryChannelsRequest()Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[init] rejected (filter not yet initialized)"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v4

    invoke-static {v2, v0, v3, v4}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryChannelsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;)Lec3/f2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->queryChannelsState:Lec3/f2;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->queryJob:Lbc3/k1;

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    iget-object v0, v0, Ln8/a;->w:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v0

    new-instance v2, Lbc3/l1;

    invoke-direct {v2, v0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->queryJob:Lbc3/k1;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1;

    invoke-direct {v3, p0, v2, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lbc3/u;Lq83/d;)V

    const/4 v4, 0x2

    invoke-static {v0, v2, v1, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final initData()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->stateMerger:Landroidx/lifecycle/t0;

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->INITIAL_STATE:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->init()V

    return-void
.end method

.method public static synthetic j(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/FilterObject;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->_init_$lambda$3(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/FilterObject;)Ll83/a0;

    return-void
.end method

.method public static synthetic l(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->markAllRead$lambda$13(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private static final leaveChannel$lambda$9$lambda$8(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)Ll83/a0;
    .locals 8

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object v4

    const-string v5, ". Error: "

    const-string v6, ". Cause: "

    const-string v7, "Could not leave channel with id: "

    invoke-static {v7, p1, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->_errorEvents:Landroidx/lifecycle/u0;

    new-instance p1, Lio/getstream/chat/android/client/api/state/Event;

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;-><init>(Ln23/e;)V

    invoke-direct {p1, v0}, Lio/getstream/chat/android/client/api/state/Event;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final markAllRead$lambda$13(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not mark all messages as read. Error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Cause: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic n(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->leaveChannel$lambda$9$lambda$8(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private final parseMutedChannels(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/ChannelMute;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/ChannelMute;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_1

    const-string v3, ""

    :cond_1
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->isMuted(Lio/getstream/chat/android/models/Channel;)Z

    move-result v2

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eq v2, v5, :cond_3

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v2

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->isMuted(Lio/getstream/chat/android/models/Channel;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "mutedChannel"

    move-object/from16 v7, p0

    invoke-direct {v7, v2, v6, v5}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->clone(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v39

    const/16 v41, 0x3

    const/16 v42, 0x0

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

    const/16 v40, -0x1

    invoke-static/range {v4 .. v42}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v4

    :cond_3
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object v3
.end method

.method private final requestMoreChannels()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    instance-of v0, v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->filterLiveData:Landroidx/lifecycle/u0;

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->queryChannelsState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/QueryChannelsState;->getNextPageRequest()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v3, v3, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final setPaginationState(Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->paginationStateMerger:Landroidx/lifecycle/t0;

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    if-nez v1, :cond_0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final deleteChannel(Lio/getstream/chat/android/models/Channel;)V
    .locals 3

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/channel/ChannelClient;->delete()Lo23/d;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/b;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;I)V

    invoke-static {v0, v1}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getDraftMessages()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->draftMessages:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getErrorEvents()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getPaginationState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->paginationState:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getTypingEvents()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->typingEvents:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final leaveChannel(Lio/getstream/chat/android/models/Channel;)V
    .locals 10

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lio/getstream/chat/android/client/channel/ChannelClient;->removeMembers$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;ILjava/lang/Object;)Lo23/d;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/b;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;I)V

    invoke-static {v0, v1}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final markAllRead()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->markAllRead()Lo23/d;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/c;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V

    invoke-static {v0, v1}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onAction(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action$ReachedEndOfList;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->requestMoreChannels()V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final setFilters(Lio/getstream/chat/android/models/FilterObject;)V
    .locals 6

    const-string v0, "filterObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    instance-of v0, v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "[setFilters] ignored \u2014 view model uses predefined filter \'"

    const-string v5, "\'"

    invoke-static {v4, v0, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[setFilters] filterObject: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->filterLiveData:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
