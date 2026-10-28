.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0002~\u007fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\n2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008*\u0010+J\r\u0010,\u001a\u00020\n\u00a2\u0006\u0004\u0008,\u0010\u0018J\u000f\u0010-\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008-\u0010\u0018J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020.H\u0002\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00101\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u00081\u0010\u0018J#\u00103\u001a\u00020\n2\u0008\u00102\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u00085\u0010\u0018J\u0017\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008:\u00108J1\u0010>\u001a\u00020\n2\u0006\u00109\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\r2\u0008\u0010<\u001a\u0004\u0018\u00010\r2\u0006\u0010=\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\u000f\u0010@\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008@\u0010\u0018J\u0015\u0010C\u001a\u0004\u0018\u00010B*\u00020AH\u0002\u00a2\u0006\u0004\u0008C\u0010DR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010E\u001a\u0004\u0008F\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008J\u0010K\u001a\u0004\u0008L\u0010MR\u001f\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0O8\u0006\u00a2\u0006\u000c\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010TR\u001d\u0010W\u001a\u0008\u0012\u0004\u0012\u00020V0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010ZR#\u0010\\\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0[0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008\\\u0010X\u001a\u0004\u0008]\u0010ZR\u001d\u0010^\u001a\u0008\u0012\u0004\u0012\u00020(0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008^\u0010X\u001a\u0004\u0008_\u0010ZR\u001d\u0010`\u001a\u0008\u0012\u0004\u0012\u00020$0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008`\u0010X\u001a\u0004\u0008a\u0010ZR\u001a\u0010c\u001a\u0008\u0012\u0004\u0012\u00020A0b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\u001d\u0010e\u001a\u0008\u0012\u0004\u0012\u00020A0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008e\u0010X\u001a\u0004\u0008f\u0010ZR\u001d\u0010h\u001a\u0008\u0012\u0004\u0012\u00020g0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008h\u0010X\u001a\u0004\u0008i\u0010ZR\u001d\u0010j\u001a\u0008\u0012\u0004\u0012\u00020(0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008j\u0010X\u001a\u0004\u0008k\u0010ZR\u001d\u0010l\u001a\u0008\u0012\u0004\u0012\u00020\u000f0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008l\u0010X\u001a\u0004\u0008m\u0010ZR#\u0010p\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020o0n0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008p\u0010X\u001a\u0004\u0008q\u0010ZR\u001f\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008s\u0010X\u001a\u0004\u0008t\u0010ZR\u001d\u0010u\u001a\u0008\u0012\u0004\u0012\u00020\u00120U8\u0006\u00a2\u0006\u000c\n\u0004\u0008u\u0010X\u001a\u0004\u0008v\u0010ZR\u001d\u0010w\u001a\u0008\u0012\u0004\u0012\u00020(0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008w\u0010X\u001a\u0004\u0008x\u0010ZR\u001d\u0010y\u001a\u0008\u0012\u0004\u0012\u00020(0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008y\u0010X\u001a\u0004\u0008z\u0010ZR\u001d\u0010|\u001a\u0008\u0012\u0004\u0012\u00020{0U8\u0006\u00a2\u0006\u000c\n\u0004\u0008|\u0010X\u001a\u0004\u0008}\u0010Z\u00a8\u0006\u0080\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
        "messageListController",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/client/ChatClient;)V",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;",
        "event",
        "Ll83/a0;",
        "onEvent",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V",
        "",
        "messageId",
        "Lio/getstream/chat/android/models/Message;",
        "getMessageById",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "",
        "messageLimit",
        "Lkotlin/Function0;",
        "scrollToBottom",
        "(ILc93/a;)V",
        "scrollToFirstUnreadMessage",
        "()V",
        "hideUnreadSeparator",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "dateSeparatorHandler",
        "setDateSeparatorHandler",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V",
        "threadDateSeparatorHandler",
        "setThreadDateSeparatorHandler",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "messagePositionHandler",
        "setMessagePositionHandler",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "messageFooterVisibility",
        "setMessageFooterVisibility",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V",
        "",
        "showSystemMessages",
        "setAreSystemMessagesVisible",
        "(Z)V",
        "pauseAudioRecordingAttachments",
        "onCleared",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;",
        "onGiphyActionSelected",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;)V",
        "onEndRegionReached",
        "baseMessageId",
        "onBottomEndRegionReached",
        "(Ljava/lang/String;I)V",
        "onBackButtonPressed",
        "parentMessage",
        "onThreadModeEntered",
        "(Lio/getstream/chat/android/models/Message;)V",
        "message",
        "onOpenThread",
        "reactionType",
        "emojiCode",
        "skipPush",
        "onMessageReaction",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Z)V",
        "onNormalModeEntered",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;",
        "asResultOrNull",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
        "getMessageListController$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "Lec3/f2;",
        "getChannelState",
        "()Lec3/f2;",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Landroidx/lifecycle/p0;",
        "getChannel",
        "()Landroidx/lifecycle/p0;",
        "",
        "ownCapabilities",
        "getOwnCapabilities",
        "showSystemMessagesState",
        "getShowSystemMessagesState",
        "messageFooterVisibilityState",
        "getMessageFooterVisibilityState",
        "Landroidx/lifecycle/t0;",
        "stateMerger",
        "Landroidx/lifecycle/t0;",
        "state",
        "getState",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "mode",
        "getMode",
        "loadMoreLiveData",
        "getLoadMoreLiveData",
        "targetMessage",
        "getTargetMessage",
        "Lio/getstream/chat/android/client/api/state/Event;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;",
        "errorEvents",
        "getErrorEvents",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "getUser",
        "unreadCount",
        "getUnreadCount",
        "insideSearch",
        "getInsideSearch",
        "shouldRequestMessagesAtBottom",
        "getShouldRequestMessagesAtBottom",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
        "unreadLabel",
        "getUnreadLabel",
        "State",
        "Event",
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


# instance fields
.field private final channel:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final channelState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final errorEvents:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final insideSearch:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final loadMoreLiveData:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final messageFooterVisibilityState:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

.field private final mode:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final ownCapabilities:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final shouldRequestMessagesAtBottom:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final showSystemMessagesState:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

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

.field private final targetMessage:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final unreadCount:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final unreadLabel:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final user:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/client/ChatClient;)V
    .locals 6

    const-string v0, "messageListController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    const-string p2, "Chat:MessageListVM"

    invoke-static {p0, p2}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->logger$delegate:Ll83/h;

    .line 7
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getChannelState()Lec3/f2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->channelState:Lec3/f2;

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getChannel()Lec3/f2;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->channel:Landroidx/lifecycle/p0;

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getOwnCapabilities()Lec3/f2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->ownCapabilities:Landroidx/lifecycle/p0;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getShowSystemMessagesState()Lec3/f2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->showSystemMessagesState:Landroidx/lifecycle/p0;

    .line 11
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessageFooterVisibilityState()Lec3/f2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageFooterVisibilityState:Landroidx/lifecycle/p0;

    .line 12
    new-instance p2, Landroidx/lifecycle/t0;

    invoke-direct {p2}, Landroidx/lifecycle/t0;-><init>()V

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->stateMerger:Landroidx/lifecycle/t0;

    .line 13
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->state:Landroidx/lifecycle/p0;

    .line 14
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMode()Lec3/f2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->mode:Landroidx/lifecycle/p0;

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessageListState()Lec3/f2;

    move-result-object p2

    .line 16
    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$1;

    invoke-direct {v2, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$1;-><init>(Lec3/l;)V

    .line 17
    invoke-static {v2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->loadMoreLiveData:Landroidx/lifecycle/p0;

    .line 18
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getListState()Lec3/f2;

    move-result-object p2

    .line 19
    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2;

    invoke-direct {v2, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2;-><init>(Lec3/l;)V

    .line 20
    new-instance p2, Lio/getstream/chat/android/client/api2/d;

    const/16 v3, 0x13

    invoke-direct {p2, v3}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    .line 21
    invoke-static {p2, v2}, Lec3/v;->s(Lc93/m;Lec3/l;)Lec3/j;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->targetMessage:Landroidx/lifecycle/p0;

    .line 22
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getErrorEvents()Lec3/f2;

    move-result-object p2

    .line 23
    new-instance v2, Lch/i;

    const/4 v3, 0x2

    invoke-direct {v2, p2, v3}, Lch/i;-><init>(Lec3/l;I)V

    .line 24
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$3;

    invoke-direct {p2, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$3;-><init>(Lec3/l;)V

    .line 25
    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    .line 26
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getUser()Lec3/f2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->user:Landroidx/lifecycle/p0;

    .line 27
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getUnreadCount()Lec3/f2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->unreadCount:Landroidx/lifecycle/p0;

    .line 28
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInsideSearch()Lec3/f2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->insideSearch:Landroidx/lifecycle/p0;

    .line 29
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isInsideSearch()Lec3/f2;

    move-result-object p2

    .line 30
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMode()Lec3/f2;

    move-result-object v2

    new-array v4, v3, [Lec3/l;

    const/4 v5, 0x0

    aput-object p2, v4, v5

    const/4 p2, 0x1

    aput-object v2, v4, p2

    .line 31
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$combine$1;

    invoke-direct {p2, v4, p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$combine$1;-><init>([Lec3/l;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V

    .line 32
    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->shouldRequestMessagesAtBottom:Landroidx/lifecycle/p0;

    .line 33
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getUnreadLabelState()Lec3/p1;

    move-result-object p1

    .line 34
    new-instance p2, Lch/i;

    invoke-direct {p2, p1, v3}, Lch/i;-><init>(Lec3/l;I)V

    .line 35
    invoke-static {p2, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->unreadLabel:Landroidx/lifecycle/p0;

    .line 36
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lq83/d;)V

    invoke-static {p1, v0, v0, p2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/client/ChatClient;)V

    return-void
.end method

.method public static final synthetic access$asResultOrNull(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->asResultOrNull(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)Landroidx/lifecycle/t0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->stateMerger:Landroidx/lifecycle/t0;

    return-object p0
.end method

.method private final asResultOrNull(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent$lambda$9(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static synthetic j(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent$lambda$7(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)Ll83/a0;

    return-void
.end method

.method public static synthetic l(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->targetMessage$lambda$3(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent$lambda$11(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)Ll83/a0;

    return-void
.end method

.method public static synthetic o(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent$lambda$13(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)Ll83/a0;

    return-void
.end method

.method private final onBackButtonPressed()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->mode:Landroidx/lifecycle/p0;

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    if-eqz v0, :cond_2

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isStartedForThread()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onNormalModeEntered()V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->stateMerger:Landroidx/lifecycle/t0;

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$NavigateUp;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$NavigateUp;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private final onBottomEndRegionReached(Ljava/lang/String;I)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onBottomEndRegionReached] baseMessageId: "

    const-string v4, ", messageLimit: "

    invoke-static {p2, v3, p1, v4}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadNewerMessages(Ljava/lang/String;I)V

    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->F:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[onBottomEndRegionReached] there\'s no base message to request more message at bottom of limit"

    invoke-static {p2, v0, p1, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static synthetic onBottomEndRegionReached$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    iget-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessageLimit()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onBottomEndRegionReached(Ljava/lang/String;I)V

    return-void
.end method

.method private final onEndRegionReached()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadOlderMessages$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;IILjava/lang/Object;)V

    return-void
.end method

.method private static final onEvent$lambda$11(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getLogger()Lb23/k;

    move-result-object p0

    invoke-virtual {p0}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Attachment download error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Cause: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p0, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onEvent$lambda$13(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)Ll83/a0;
    .locals 4

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ln23/g;

    if-eqz v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;->getCid()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Ln23/g;

    invoke-virtual {p2}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    goto :goto_0

    :cond_0
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_2

    check-cast p2, Ln23/f;

    invoke-virtual {p2}, Ln23/f;->e()Ln23/e;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getLogger()Lb23/k;

    move-result-object p0

    invoke-virtual {p0}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->F:Lb23/g;

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not load message to reply: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Cause: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, p0, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final onEvent$lambda$7(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;Ln23/h;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;->getResultHandler()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onEvent$lambda$9(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ln23/e;)Ll83/a0;
    .locals 5

    const-string v0, "streamError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getLogger()Lb23/k;

    move-result-object p0

    invoke-virtual {p0}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not reply message: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Cause: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p0, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final onGiphyActionSelected(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;->getAction()Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->performGiphyAction(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V

    return-void
.end method

.method private final onMessageReaction(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 17

    new-instance v0, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    const/16 v15, 0x1ff8

    const/16 v16, 0x0

    const/4 v3, 0x1

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

    move-object/from16 v2, p2

    move-object/from16 v14, p3

    invoke-direct/range {v0 .. v16}, Lio/getstream/chat/android/models/Reaction;-><init>(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    move-object/from16 v0, p0

    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    move-object/from16 v3, p1

    move/from16 v4, p4

    invoke-virtual {v2, v1, v3, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->reactToMessage(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;Z)V

    return-void
.end method

.method private final onNormalModeEntered()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->enterNormalMode()V

    return-void
.end method

.method private final onOpenThread(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$onOpenThread$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$onOpenThread$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final onThreadModeEntered(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$onThreadModeEntered$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$onThreadModeEntered$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic scrollToBottom$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;ILc93/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessageLimit()I

    move-result p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->scrollToBottom(ILc93/a;)V

    return-void
.end method

.method private static final targetMessage$lambda$3(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "old"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final getChannel()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->channel:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getChannelState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->channelState:Lec3/f2;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getInsideSearch()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->insideSearch:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getLoadMoreLiveData()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->loadMoreLiveData:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMessageFromListStateById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method public final getMessageFooterVisibilityState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageFooterVisibilityState:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getMessageListController$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    return-object v0
.end method

.method public final getMode()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->mode:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getOwnCapabilities()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->ownCapabilities:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getShouldRequestMessagesAtBottom()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->shouldRequestMessagesAtBottom:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getShowSystemMessagesState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->showSystemMessagesState:Landroidx/lifecycle/p0;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getTargetMessage()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->targetMessage:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getUnreadCount()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->unreadCount:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getUnreadLabel()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->unreadLabel:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getUser()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->user:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final hideUnreadSeparator()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->hideUnreadSeparator()V

    return-void
.end method

.method public final onCleared()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->onCleared()V

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    return-void
.end method

.method public final onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[onEvent] event: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$EndRegionReached;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEndRegionReached()V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BottomEndRegionReached;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BottomEndRegionReached;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BottomEndRegionReached;->getMessageId()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onBottomEndRegionReached$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Ljava/lang/String;IILjava/lang/Object;)V

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$LastMessageRead;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markLastMessageRead()V

    return-void

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ThreadModeEntered;

    if-eqz v0, :cond_4

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ThreadModeEntered;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ThreadModeEntered;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onThreadModeEntered(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$OpenThread;

    if-eqz v0, :cond_5

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$OpenThread;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$OpenThread;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onOpenThread(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_5
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ToggleOriginalText;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ToggleOriginalText;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ToggleOriginalText;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->toggleOriginalText(Ljava/lang/String;)V

    return-void

    :cond_6
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;

    if-eqz v0, :cond_7

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onBackButtonPressed()V

    return-void

    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MarkAsUnreadMessage;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MarkAsUnreadMessage;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MarkAsUnreadMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-static {v0, p1, v2, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->markUnread$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;->getHard()Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->deleteMessage(Lio/getstream/chat/android/models/Message;Z)V

    return-void

    :cond_9
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PinMessage;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PinMessage;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PinMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-static {v0, p1, v2, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pinMessage$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Ljava/util/Date;ILjava/lang/Object;)V

    return-void

    :cond_a
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnpinMessage;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnpinMessage;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnpinMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unpinMessage(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_b
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;

    if-eqz v0, :cond_c

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;->getAction()Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->performGiphyAction(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V

    return-void

    :cond_c
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->resendMessage(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_d
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;

    if-eqz v0, :cond_e

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;->getReactionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;->getEmojiCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;->getSkipPush()Z

    move-result p1

    invoke-direct {p0, v0, v1, v2, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onMessageReaction(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_e
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MuteUser;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MuteUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MuteUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->muteUser(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_f
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnmuteUser;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnmuteUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnmuteUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unmuteUser(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_10
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnbanUser;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnbanUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnbanUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unbanUser(Ljava/lang/String;)V

    return-void

    :cond_11
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;

    if-eqz v0, :cond_12

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->shadowBanUser$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)V

    return-void

    :cond_12
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveShadowBanFromUser;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveShadowBanFromUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveShadowBanFromUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeShadowBanFromUser(Ljava/lang/String;)V

    return-void

    :cond_13
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;->getReason()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;->getCustomData()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagUser(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_14
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnflagUser;

    if-eqz v0, :cond_15

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnflagUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnflagUser;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unflagUser(Ljava/lang/String;)V

    return-void

    :cond_15
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;

    if-eqz v0, :cond_16

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeAttachment(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)V

    return-void

    :cond_16
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;

    if-eqz v0, :cond_17

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    move-object v1, p1

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;->getReason()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;->getCustomData()Ljava/util/Map;

    move-result-object v1

    new-instance v4, Lio/getstream/chat/android/ui/viewmodel/messages/f;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v5}, Lio/getstream/chat/android/ui/viewmodel/messages/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2, v3, v1, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->flagMessage(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_17
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;

    if-eqz v0, :cond_18

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;->getReason()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;->getTimeout()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->banUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void

    :cond_18
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;

    if-eqz v0, :cond_19

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;->getRepliedMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->setMessageForReply(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/g;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/g;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_19
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;

    if-eqz v0, :cond_1a

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;->getDownloadAttachmentCall()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo23/d;

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/g;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/g;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;I)V

    invoke-static {p1, v0}, Lo23/f;->d(Lo23/d;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1a
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;->getParentMessageId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scrollToMessage(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1b
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    move-object v1, p1

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;->getRepliedMessageId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->loadMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1c
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;

    if-eqz v0, :cond_1f

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;->getNavigateToFirstUnreadMessage()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1d

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scrollToFirstUnreadMessage()V

    return-void

    :cond_1d
    if-nez p1, :cond_1e

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->disableUnreadLabelButton()V

    return-void

    :cond_1e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1f
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BlockUser;

    if-eqz v0, :cond_20

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BlockUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BlockUser;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->blockUser(Ljava/lang/String;)V

    return-void

    :cond_20
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnblockUser;

    if-eqz v0, :cond_21

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnblockUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnblockUser;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->unblockUser(Ljava/lang/String;)V

    return-void

    :cond_21
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;

    if-eqz v0, :cond_22

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updatePollOption(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V

    return-void

    :cond_22
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollClosed;

    if-eqz v0, :cond_23

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollClosed;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollClosed;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->closePoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_23
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;

    if-eqz v0, :cond_24

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;->getPollId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;->getOption()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->addPollOption(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_24
    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;

    if-eqz v0, :cond_25

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;->getPollId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;->getAnswer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->castAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_25
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final pauseAudioRecordingAttachments()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->pauseAudioRecordingAttachments()V

    return-void
.end method

.method public final scrollToBottom(ILc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "scrollToBottom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scrollToBottom(ILc93/a;)V

    return-void
.end method

.method public final scrollToFirstUnreadMessage()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scrollToFirstUnreadMessage()V

    return-void
.end method

.method public final setAreSystemMessagesVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setSystemMessageVisibility(Z)V

    return-void
.end method

.method public final setDateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setDateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V

    return-void
.end method

.method public final setMessageFooterVisibility(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V
    .locals 1

    const-string v0, "messageFooterVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessageFooterVisibility(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V

    return-void
.end method

.method public final setMessagePositionHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V
    .locals 1

    const-string v0, "messagePositionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setMessagePositionHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V

    return-void
.end method

.method public final setThreadDateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->messageListController:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->setThreadDateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V

    return-void
.end method
