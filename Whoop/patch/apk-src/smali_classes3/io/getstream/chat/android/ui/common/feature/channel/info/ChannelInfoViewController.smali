.class public final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000c\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00172\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008(\u0010\'J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00080\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u00082\u00103J\u001b\u00105\u001a\u00020\u00172\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u00085\u0010.J\u001b\u00106\u001a\u00020\u00172\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u00086\u0010.J\u001b\u00107\u001a\u00020\u00172\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u00087\u0010.J\u001b\u00108\u001a\u00020\u00172\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u00088\u0010.J\u0019\u0010;\u001a\u00020\u00172\u0008\u0010:\u001a\u0004\u0018\u000109H\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u000f\u0010=\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008=\u0010\'J!\u0010A\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00022\u0008\u0010@\u001a\u0004\u0018\u00010?H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010C\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008C\u0010.J\u0017\u0010D\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008D\u0010.JI\u0010J\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00022\u0008\u0010E\u001a\u0004\u0018\u0001092\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00170\u00062\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00170\u0006H\u0002\u00a2\u0006\u0004\u0008J\u0010KJ\u001f\u0010N\u001a\u0008\u0012\u0004\u0012\u00020M0L*\u0008\u0012\u0004\u0012\u00020M0LH\u0002\u00a2\u0006\u0004\u0008N\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010QR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010SR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010TR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010YR\u001a\u0010]\u001a\u0008\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u001d\u0010`\u001a\u0008\u0012\u0004\u0012\u00020\\0_8\u0006\u00a2\u0006\u000c\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010cR\u001a\u0010f\u001a\u0008\u0012\u0004\u0012\u00020e0d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u001d\u0010i\u001a\u0008\u0012\u0004\u0012\u00020e0h8\u0006\u00a2\u0006\u000c\n\u0004\u0008i\u0010j\u001a\u0004\u0008k\u0010l\u00a8\u0006m"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;",
        "",
        "",
        "cid",
        "Lbc3/c0;",
        "scope",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
        "",
        "optionFilter",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "channelClient",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "<init>",
        "(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;)V",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;",
        "action",
        "Ll83/a0;",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;)V",
        "",
        "userIds",
        "addMembers",
        "(Ljava/util/Set;)V",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;",
        "event",
        "onMemberViewEvent",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;)V",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;",
        "data",
        "onChannelInfoData",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;)V",
        "expandMembers",
        "()V",
        "collapseMembers",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;",
        "memberClick",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;)V",
        "name",
        "renameChannel",
        "(Ljava/lang/String;)V",
        "mute",
        "setChannelMute",
        "(Z)V",
        "getDmMemberId",
        "()Ljava/lang/String;",
        "userId",
        "muteUser",
        "unmuteUser",
        "blockUser",
        "unblockUser",
        "Lio/getstream/chat/android/models/Message;",
        "quitMessage",
        "leaveChannel",
        "(Lio/getstream/chat/android/models/Message;)V",
        "deleteChannel",
        "memberId",
        "",
        "timeout",
        "banMember",
        "(Ljava/lang/String;Ljava/lang/Integer;)V",
        "unbanMember",
        "removeMember",
        "systemMessage",
        "Lio/getstream/chat/android/models/Channel;",
        "onSuccess",
        "Ln23/e;",
        "onError",
        "removeMemberFromChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "filterNotCurrentUser",
        "(Ljava/util/List;)Ljava/util/List;",
        "Ljava/lang/String;",
        "Lbc3/c0;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "Lec3/o1;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;",
        "_events",
        "Lec3/o1;",
        "Lec3/t1;",
        "events",
        "Lec3/t1;",
        "getEvents",
        "()Lec3/t1;",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final _events:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final channelClient:Lio/getstream/chat/android/client/channel/ChannelClient;

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final cid:Ljava/lang/String;

.field private final events:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final optionFilter:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbc3/c0;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/l;",
            "Lio/getstream/chat/android/client/channel/ChannelClient;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelClient"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->cid:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->optionFilter:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    iput-object p6, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->channelClient:Lio/getstream/chat/android/client/channel/ChannelClient;

    .line 7
    const-string p1, "Chat:ChannelInfoViewController"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->logger$delegate:Ll83/h;

    .line 8
    sget-object p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Loading;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Loading;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_state:Lec3/p1;

    .line 9
    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->state:Lec3/f2;

    const/4 p1, 0x5

    const/4 p3, 0x0

    const/4 p4, 0x1

    const/4 p6, 0x0

    .line 10
    invoke-static {p3, p4, p6, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    .line 11
    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->events:Lec3/t1;

    .line 12
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$special$$inlined$flatMapLatest$1;

    invoke-direct {p1, p6, p5, p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lec3/l;Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)V

    invoke-static {p7, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    .line 13
    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 14
    new-instance p3, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$3;

    invoke-direct {p3, p0, p6}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$3;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V

    .line 15
    new-instance p4, Lec3/j1;

    const/4 p5, 0x0

    invoke-direct {p4, p1, p3, p5}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 16
    invoke-static {p4, p2}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    .line 17
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    .line 18
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 19
    invoke-static {v4, p1, v0, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object v0

    .line 20
    new-instance v5, Lch/i;

    const/4 v6, 0x2

    invoke-direct {v5, v0, v6}, Lch/i;-><init>(Lec3/l;I)V

    goto :goto_2

    :cond_2
    move-object v5, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    .line 21
    invoke-virtual {v4, p1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object v0

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, p6

    :goto_3
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    .line 22
    invoke-static {v4}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getGlobalStateFlow(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;

    move-result-object v0

    move-object v7, v0

    move-object v1, p1

    move-object v2, p2

    move-object v0, p0

    goto :goto_4

    :cond_4
    move-object v7, p7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 23
    :goto_4
    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;-><init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->expandMembers$lambda$13(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getChannelClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lio/getstream/chat/android/client/channel/ChannelClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->channelClient:Lio/getstream/chat/android/client/channel/ChannelClient;

    return-object p0
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get_events$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic access$lambda$4$lambda$3$lambda$2(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    new-instance p3, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;

    invoke-direct {p3, p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;-><init>(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;Z)V

    return-object p3
.end method

.method public static final synthetic access$onChannelInfoData(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->onChannelInfoData(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_init_$lambda$0(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)Z

    return-void
.end method

.method private final banMember(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[banMember] memberId: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$banMember$2;

    invoke-direct {v1, p0, p1, p2, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$banMember$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final blockUser(Ljava/lang/String;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[blockUser] userId: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$blockUser$2;

    invoke-direct {v1, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$blockUser$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic blockUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getDmMemberId()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->blockUser(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->leaveChannel$lambda$29$lambda$28(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lio/getstream/chat/android/models/Channel;)Ll83/a0;

    return-void
.end method

.method private final collapseMembers()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[collapseMembers]"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_state:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->access$updateContent(Lec3/p1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final collapseMembers$lambda$15(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;
    .locals 13

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->getMembers()Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v1

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/utils/ExpandableList;->copy$default(Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;IZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v9

    const/4 v11, 0x5

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->removeMember$lambda$35(Lio/getstream/chat/android/models/Channel;)Ll83/a0;

    return-void
.end method

.method private final deleteChannel()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[deleteChannel]"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$deleteChannel$2;

    invoke-direct {v1, p0, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$deleteChannel$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v4, v4, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->collapseMembers$lambda$15(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    move-result-object p0

    return-object p0
.end method

.method private final expandMembers()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[expandMembers]"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_state:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->access$updateContent(Lec3/p1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final expandMembers$lambda$13(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;
    .locals 13

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->getMembers()Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v1

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/utils/ExpandableList;->copy$default(Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;IZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v9

    const/4 v11, 0x5

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->removeMember$lambda$37(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private final filterNotCurrentUser(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
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

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->leaveChannel$lambda$25(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)Ll83/a0;

    return-void
.end method

.method private final getDmMemberId()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->getMembers()Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Member;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v2
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private static final synthetic lambda$4$lambda$3$lambda$2(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    new-instance p3, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;

    invoke-direct {p3, p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;-><init>(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;Z)V

    return-object p3
.end method

.method private final leaveChannel(Lio/getstream/chat/android/models/Message;)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    const-string v5, "[leaveChannel] quitMessage: "

    invoke-static {v5, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/a;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;I)V

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    const-string v1, "User not connected"

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v4

    :goto_3
    instance-of v1, v4, Ll83/m;

    if-nez v1, :cond_4

    move-object v1, v4

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/channel/info/a;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/common/feature/channel/info/a;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;I)V

    invoke-direct {p0, v1, p1, v2, v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->removeMemberFromChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    invoke-static {v4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v1, Ln23/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    const-string v2, ""

    :cond_5
    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method private static final leaveChannel$lambda$25(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)Ll83/a0;
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[leaveChannel] error: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    sget-object p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelError;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelError;

    invoke-interface {p0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final leaveChannel$lambda$29$lambda$28(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lio/getstream/chat/android/models/Channel;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateUp;

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason$LeaveChannelSuccess;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason$LeaveChannelSuccess;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateUp;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;)V

    invoke-interface {p0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final memberClick(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[memberClick] member: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MemberInfoModal;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->cid:Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MemberInfoModal;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Member;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method private final muteUser(Ljava/lang/String;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[muteUser] userId: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$muteUser$2;

    invoke-direct {v1, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$muteUser$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic muteUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getDmMemberId()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->muteUser(Ljava/lang/String;)V

    return-void
.end method

.method private final onChannelInfoData(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;)V
    .locals 13

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;->getMembers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;->getChannelData()Lio/getstream/chat/android/models/ChannelData;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->access$isGroupChannel(Lio/getstream/chat/android/models/ChannelData;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v0

    :goto_1
    if-nez v1, :cond_2

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->filterNotCurrentUser(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :cond_2
    move-object v5, v1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_state:Lec3/p1;

    :cond_3
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v10

    move-object v4, v10

    check-cast v4, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;

    instance-of v6, v4, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Loading;

    if-eqz v6, :cond_4

    new-instance v4, Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x5

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/ui/common/utils/ExpandableList;-><init>(Ljava/util/List;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_4
    instance-of v6, v4, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    if-eqz v6, :cond_9

    check-cast v4, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->getMembers()Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v4

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lio/getstream/chat/android/ui/common/utils/ExpandableList;->copy$default(Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;IZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v4

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v3, :cond_5

    invoke-static {v5}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Member;

    goto :goto_3

    :cond_5
    move-object v6, v2

    :goto_3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;->getChannelData()Lio/getstream/chat/android/models/ChannelData;

    move-result-object v7

    invoke-virtual {v7}, Lio/getstream/chat/android/models/ChannelData;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v7

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;->getChannelData()Lio/getstream/chat/android/models/ChannelData;

    move-result-object v8

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;->isMuted()Z

    move-result v9

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;->getMutedUsers()Ljava/util/List;

    move-result-object v11

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;->getBlockedUserIds()Ljava/util/List;

    move-result-object v12

    invoke-static {v8, v6, v9, v11, v12}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->access$buildChannelOptionList(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;ZLjava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;

    iget-object v11, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->optionFilter:Lkotlin/jvm/functions/Function1;

    invoke-interface {v11, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_5

    :cond_7
    move-object v9, v2

    :goto_5
    if-eqz v9, :cond_6

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    new-instance v6, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    invoke-direct {v6, v7, v4, v8}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)V

    invoke-virtual {v1, v10, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final removeMember(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[removeMember] memberId: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/a;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;I)V

    invoke-direct {p0, p1, v4, v0, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->removeMemberFromChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final removeMember$lambda$35(Lio/getstream/chat/android/models/Channel;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final removeMember$lambda$37(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ln23/e;)Ll83/a0;
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[removeMember] error: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    sget-object p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberError;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberError;

    invoke-interface {p0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final removeMemberFromChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$removeMemberFromChannel$1;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$removeMemberFromChannel$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final renameChannel(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[renameChannel] name: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$renameChannel$2;

    invoke-direct {v1, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$renameChannel$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final setChannelMute(Z)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setChannelMute] mute: "

    invoke-static {v1, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;

    invoke-direct {v1, p1, p0, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;-><init>(ZLio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final unbanMember(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[unbanMember] memberId: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;

    invoke-direct {v1, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final unblockUser(Ljava/lang/String;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[unblockUser] userId: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unblockUser$2;

    invoke-direct {v1, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unblockUser$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic unblockUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getDmMemberId()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unblockUser(Ljava/lang/String;)V

    return-void
.end method

.method private final unmuteUser(Ljava/lang/String;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[unmuteUser] userId: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unmuteUser$2;

    invoke-direct {v1, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unmuteUser$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic unmuteUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getDmMemberId()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unmuteUser(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final addMembers(Ljava/util/Set;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "userIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[addMembers] userIds: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;

    invoke-direct {v1, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/util/Set;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final getEvents()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->events:Lec3/t1;

    return-object v0
.end method

.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->state:Lec3/f2;

    return-object v0
.end method

.method public final onMemberViewEvent(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;)V
    .locals 5

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onMemberViewEvent] event: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;->getDistinctCid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToChannel;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;->getDistinctCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToChannel;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToDraftChannel;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;->getMemberId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToDraftChannel;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MuteUser;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MuteUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MuteUser;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->muteUser(Ljava/lang/String;)V

    return-void

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnmuteUser;

    if-eqz v0, :cond_4

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnmuteUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnmuteUser;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unmuteUser(Ljava/lang/String;)V

    return-void

    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BlockUser;

    if-eqz v0, :cond_5

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BlockUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BlockUser;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->blockUser(Ljava/lang/String;)V

    return-void

    :cond_5
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnblockUser;

    if-eqz v0, :cond_6

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnblockUser;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnblockUser;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unblockUser(Ljava/lang/String;)V

    return-void

    :cond_6
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BanMember;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BanMember;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BanMember;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnbanMember;

    if-eqz v0, :cond_8

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnbanMember;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnbanMember;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unbanMember(Ljava/lang/String;)V

    return-void

    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$RemoveMember;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberModal;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$RemoveMember;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$RemoveMember;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberModal;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;)V
    .locals 6

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onViewAction] action: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$ExpandMembersClick;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->expandMembers()V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$CollapseMembersClick;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->collapseMembers()V

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->memberClick(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;)V

    return-void

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RenameChannelClick;

    if-eqz v0, :cond_4

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RenameChannelClick;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RenameChannelClick;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->renameChannel(Ljava/lang/String;)V

    return-void

    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$PinnedMessagesClick;

    if-eqz v0, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToPinnedMessages;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToPinnedMessages;

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_5
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MediaAttachmentsClick;

    if-eqz v0, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToMediaAttachments;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToMediaAttachments;

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_6
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$FilesAttachmentsClick;

    if-eqz v0, :cond_7

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToFilesAttachments;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToFilesAttachments;

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MuteChannelClick;

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->setChannelMute(Z)V

    return-void

    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnmuteChannelClick;

    if-eqz v0, :cond_9

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->setChannelMute(Z)V

    return-void

    :cond_9
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MuteUserClick;

    if-eqz v0, :cond_a

    invoke-static {p0, v4, v1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->muteUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_a
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnmuteUserClick;

    if-eqz v0, :cond_b

    invoke-static {p0, v4, v1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unmuteUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_b
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BlockUserClick;

    if-eqz v0, :cond_c

    invoke-static {p0, v4, v1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->blockUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_c
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnblockUserClick;

    if-eqz v0, :cond_d

    invoke-static {p0, v4, v1, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unblockUser$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_d
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelClick;

    if-eqz v0, :cond_e

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelModal;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelModal;

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_e
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelConfirmationClick;

    if-eqz v0, :cond_f

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelConfirmationClick;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelConfirmationClick;->getQuitMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->leaveChannel(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_f
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$DeleteChannelClick;

    if-eqz v0, :cond_10

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->_events:Lec3/o1;

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelModal;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelModal;

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_10
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$DeleteChannelConfirmationClick;

    if-eqz v0, :cond_11

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->deleteChannel()V

    return-void

    :cond_11
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BanMemberConfirmationClick;

    if-eqz v0, :cond_12

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BanMemberConfirmationClick;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BanMemberConfirmationClick;->getMemberId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BanMemberConfirmationClick;->getTimeoutInMinutes()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->banMember(Ljava/lang/String;Ljava/lang/Integer;)V

    return-void

    :cond_12
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RemoveMemberConfirmationClick;

    if-eqz v0, :cond_13

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RemoveMemberConfirmationClick;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RemoveMemberConfirmationClick;->getMemberId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->removeMember(Ljava/lang/String;)V

    return-void

    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
