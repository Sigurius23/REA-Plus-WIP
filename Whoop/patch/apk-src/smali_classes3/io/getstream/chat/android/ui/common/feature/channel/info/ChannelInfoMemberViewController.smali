.class public final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0019R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR#\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!8\u0006\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u0012\u0004\u0008\'\u0010(\u001a\u0004\u0008%\u0010&R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u001d\u0010.\u001a\u0008\u0012\u0004\u0012\u00020*0-8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010\u0018\u00a8\u00066"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;",
        "",
        "",
        "cid",
        "memberId",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lec3/l;)V",
        "Lio/getstream/chat/android/models/Channel;",
        "queryDistinctChannel",
        "()Lec3/l;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;",
        "action",
        "Ll83/a0;",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;)V",
        "Ljava/lang/String;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "getState$annotations",
        "()V",
        "Lec3/o1;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;",
        "_events",
        "Lec3/o1;",
        "Lec3/t1;",
        "events",
        "Lec3/t1;",
        "getEvents",
        "()Lec3/t1;",
        "Lio/getstream/chat/android/models/Member;",
        "member",
        "Lio/getstream/chat/android/models/Member;",
        "distinctCid",
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

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private distinctCid:Ljava/lang/String;

.field private final events:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private member:Lio/getstream/chat/android/models/Member;

.field private final memberId:Ljava/lang/String;

.field private final scope:Lbc3/c0;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lec3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/l;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "memberId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "scope"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "chatClient"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelState"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "globalState"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->memberId:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->scope:Lbc3/c0;

    .line 4
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 5
    const-string p1, "Chat:ChannelInfoMemberViewController"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->logger$delegate:Ll83/h;

    .line 6
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$flatMapLatest$1;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p5, p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lec3/l;Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)V

    invoke-static {p6, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    .line 7
    new-instance p4, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1;

    invoke-direct {p4, p1, p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1;-><init>(Lec3/l;Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)V

    const-wide/16 p5, 0x1388

    const/4 p1, 0x2

    .line 8
    invoke-static {p1, p5, p6}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p1

    .line 9
    sget-object p5, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Loading;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Loading;

    .line 10
    invoke-static {p4, p3, p1, p5}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->state:Lec3/f2;

    const/4 p1, 0x1

    const/4 p3, 0x5

    const/4 p4, 0x0

    .line 11
    invoke-static {p4, p1, p2, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    .line 12
    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->events:Lec3/t1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 13
    sget-object p4, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p4}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p4, 0x0

    .line 14
    invoke-static {v4, p1, p4, p3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object p4

    .line 15
    new-instance p5, Lch/i;

    const/4 p8, 0x2

    invoke-direct {p5, p4, p8}, Lch/i;-><init>(Lec3/l;I)V

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    .line 16
    invoke-static {v4}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getGlobalStateFlow(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;

    move-result-object p6

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    .line 17
    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;-><init>(Ljava/lang/String;Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lec3/l;)V

    return-void
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMemberId$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->memberId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$queryDistinctChannel(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->queryDistinctChannel()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setDistinctCid$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->distinctCid:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setMember$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;Lio/getstream/chat/android/models/Member;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    return-void
.end method

.method public static final synthetic access$state$lambda$4$lambda$3$lambda$2(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    new-instance p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    invoke-direct/range {p0 .. p5}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;-><init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static synthetic getState$annotations()V
    .locals 0

    return-void
.end method

.method private final queryDistinctChannel()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private static final synthetic state$lambda$4$lambda$3$lambda$2(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    new-instance p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    invoke-direct/range {p0 .. p5}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;-><init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method


# virtual methods
.method public final getEvents()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->events:Lec3/t1;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->state:Lec3/f2;

    return-object v0
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;)V
    .locals 6

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->getLogger()Lb23/k;

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
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$MessageMemberClick;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->memberId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->distinctCid:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$MuteUserClick;

    const-string v1, "member"

    if-eqz v0, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MuteUser;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v2, :cond_2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MuteUser;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnmuteUserClick;

    if-eqz v0, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnmuteUser;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v2, :cond_4

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnmuteUser;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$BlockUserClick;

    if-eqz v0, :cond_7

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BlockUser;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v2, :cond_6

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BlockUser;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnblockUserClick;

    if-eqz v0, :cond_9

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnblockUser;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v2, :cond_8

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnblockUser;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_9
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$BanMemberClick;

    if-eqz v0, :cond_b

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BanMember;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v2, :cond_a

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BanMember;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_a
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_b
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnbanMemberClick;

    if-eqz v0, :cond_d

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnbanMember;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v2, :cond_c

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnbanMember;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_c
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_d
    instance-of p1, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$RemoveMemberClick;

    if-eqz p1, :cond_f

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->_events:Lec3/o1;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$RemoveMember;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v2, :cond_e

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$RemoveMember;-><init>(Lio/getstream/chat/android/models/Member;)V

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_e
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
