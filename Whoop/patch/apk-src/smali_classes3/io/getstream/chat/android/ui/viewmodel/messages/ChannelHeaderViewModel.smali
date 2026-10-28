.class public final Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 82\u00020\u0001:\u00018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0 8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R#\u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\'0&0 8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010#\u001a\u0004\u0008)\u0010%R#\u0010+\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0&0 8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010#\u001a\u0004\u0008,\u0010%R\u001f\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0 8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010#\u001a\u0004\u0008/\u0010%R\u001d\u00101\u001a\u0008\u0012\u0004\u0012\u0002000 8\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010#\u001a\u0004\u00082\u0010%R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0 8\u0006\u00a2\u0006\u000c\n\u0004\u00086\u0010#\u001a\u0004\u00087\u0010%\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;",
        "Landroidx/lifecycle/w1;",
        "",
        "cid",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "messageId",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ljava/lang/String;)V",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "observeChannelState",
        "()Lec3/l;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "setActiveThread",
        "(Lio/getstream/chat/android/models/Message;)V",
        "resetThread",
        "()V",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "channelState",
        "Lec3/l;",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Landroidx/lifecycle/p0;",
        "getChannel",
        "()Landroidx/lifecycle/p0;",
        "",
        "Lio/getstream/chat/android/models/User;",
        "typingUsers",
        "getTypingUsers",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "getMembers",
        "",
        "membersCount",
        "getMembersCount",
        "Lio/getstream/chat/android/models/ConnectionState;",
        "online",
        "getOnline",
        "Landroidx/lifecycle/u0;",
        "_activeThread",
        "Landroidx/lifecycle/u0;",
        "activeThread",
        "getActiveThread",
        "Companion",
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
.field private static final Companion:Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$Companion;

.field private static final DEFAULT_MESSAGES_LIMIT:I = 0x1e


# instance fields
.field private final _activeThread:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final activeThread:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final channel:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final channelState:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final cid:Ljava/lang/String;

.field private final logger$delegate:Ll83/h;

.field private final members:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final membersCount:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final messageId:Ljava/lang/String;

.field private final online:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final typingUsers:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->Companion:Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ljava/lang/String;)V
    .locals 2

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 5
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->cid:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 7
    iput-object p4, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->messageId:Ljava/lang/String;

    .line 8
    const-string p1, "Chat:MessagesHeaderVM"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->logger$delegate:Ll83/h;

    .line 9
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->observeChannelState()Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->channelState:Lec3/l;

    .line 10
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$1;

    const/4 p4, 0x3

    const/4 v0, 0x0

    .line 11
    invoke-direct {p2, p4, v0}, Ls83/i;-><init>(ILq83/d;)V

    .line 12
    invoke-static {p1, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    .line 13
    invoke-static {p2, v0, p4}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->channel:Landroidx/lifecycle/p0;

    .line 14
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$2;

    .line 15
    invoke-direct {p2, p4, v0}, Ls83/i;-><init>(ILq83/d;)V

    .line 16
    invoke-static {p1, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    .line 17
    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$map$1;

    invoke-direct {v1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$map$1;-><init>(Lec3/l;)V

    .line 18
    invoke-static {v1, v0, p4}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->typingUsers:Landroidx/lifecycle/p0;

    .line 19
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$3;

    .line 20
    invoke-direct {p2, p4, v0}, Ls83/i;-><init>(ILq83/d;)V

    .line 21
    invoke-static {p1, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    .line 22
    invoke-static {p2, v0, p4}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->members:Landroidx/lifecycle/p0;

    .line 23
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;

    .line 24
    invoke-direct {p2, p4, v0}, Ls83/i;-><init>(ILq83/d;)V

    .line 25
    invoke-static {p1, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    .line 26
    invoke-static {p1, v0, p4}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->membersCount:Landroidx/lifecycle/p0;

    .line 27
    invoke-interface {p3}, Lio/getstream/chat/android/client/setup/state/ClientState;->getConnectionState()Lec3/f2;

    move-result-object p1

    invoke-static {p1, v0, p4}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->online:Landroidx/lifecycle/p0;

    .line 28
    new-instance p1, Landroidx/lifecycle/u0;

    .line 29
    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    .line 30
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->_activeThread:Landroidx/lifecycle/u0;

    .line 31
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->activeThread:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ljava/lang/String;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final observeChannelState()Lec3/l;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->messageId:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1e

    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->cid:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->messageId:Ljava/lang/String;

    const-string v6, ", messageId: "

    const-string v7, ", messageLimit: "

    const-string v8, "[observeChannelState] cid: "

    invoke-static {v8, v2, v6, v5, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->cid:Ljava/lang/String;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object v0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    return-object v1
.end method


# virtual methods
.method public final getActiveThread()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->activeThread:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getChannel()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->channel:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getMembers()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->members:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getMembersCount()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->membersCount:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getOnline()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->online:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getTypingUsers()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->typingUsers:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final resetThread()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->_activeThread:Landroidx/lifecycle/u0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setActiveThread(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->_activeThread:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method
