.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;,
        Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 I2\u00020\u0001:\u0002JIBy\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\n\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000f\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020\u0004\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\u0004\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010(\u001a\u00020\u0004\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010+\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\r\u00a2\u0006\u0004\u0008+\u0010,J\u001b\u0010/\u001a\u00020\u00192\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00110-\u00a2\u0006\u0004\u0008/\u00100J\u0015\u00102\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0011\u00a2\u0006\u0004\u00082\u00103J\u0017\u00106\u001a\u0004\u0018\u0001052\u0006\u00104\u001a\u00020\u0004\u00a2\u0006\u0004\u00086\u00107J\u0015\u00109\u001a\u00020\u00192\u0006\u00108\u001a\u000205\u00a2\u0006\u0004\u00089\u0010:J\u0015\u0010;\u001a\u00020\u00192\u0006\u00108\u001a\u000205\u00a2\u0006\u0004\u0008;\u0010:J\u0010\u0010<\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\u0008<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010@R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010AR \u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010BR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010BR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010BR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\u00a8\u0006K"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
        "",
        "",
        "id",
        "",
        "currentUserId",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "channelMap",
        "Lio/getstream/chat/android/models/Message;",
        "messageMap",
        "Lio/getstream/chat/android/models/Thread;",
        "threadMap",
        "Lio/getstream/chat/android/models/User;",
        "userMap",
        "<init>",
        "(ILjava/lang/String;Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V",
        "Ljava/util/Date;",
        "receivedEventDate",
        "cid",
        "message",
        "Ll83/a0;",
        "addMessageData",
        "(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V",
        "channel",
        "addChannel",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "thread",
        "addThread",
        "(Lio/getstream/chat/android/models/Thread;)V",
        "cId",
        "getCurrentChannel",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;",
        "messageId",
        "getCurrentMessage",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "threadId",
        "getCurrentThread",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Thread;",
        "addMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "",
        "newUsers",
        "addUsers",
        "(Ljava/util/List;)V",
        "newUser",
        "addUser",
        "(Lio/getstream/chat/android/models/User;)V",
        "pollId",
        "Lio/getstream/chat/android/models/Poll;",
        "getPoll",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;",
        "poll",
        "addPoll",
        "(Lio/getstream/chat/android/models/Poll;)V",
        "deletePoll",
        "execute",
        "(Lq83/d;)Ljava/lang/Object;",
        "I",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Ljava/util/Map;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Companion",
        "Builder",
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
.field private static final Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Companion;

.field private static final TAG:Ljava/lang/String; = "Chat:EventBatchUpdate"


# instance fields
.field private final channelMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field

.field private final currentUserId:Ljava/lang/String;

.field private final globalState:Lio/getstream/chat/android/client/api/state/GlobalState;

.field private final id:I

.field private final logger$delegate:Ll83/h;

.field private final messageMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final threadMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end field

.field private final userMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Companion;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/state/GlobalState;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Thread;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->id:I

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->currentUserId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->globalState:Lio/getstream/chat/android/client/api/state/GlobalState;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->channelMap:Ljava/util/Map;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->messageMap:Ljava/util/Map;

    .line 9
    iput-object p7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->threadMap:Ljava/util/Map;

    .line 10
    iput-object p8, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    .line 11
    const-string p1, "Chat:EventBatchUpdate"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;-><init>(ILjava/lang/String;Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getPoll$lambda$2(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private static final getPoll$lambda$2(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addChannel(Lio/getstream/chat/android/models/Channel;)V
    .locals 9

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->id:I

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getLastMessageAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->latestOrNull(Ljava/util/List;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[addChannel] id: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", channel.lastMessageAt: "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel.latestMessageId: "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->users(Lio/getstream/chat/android/models/Channel;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUsers(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->channelMap:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final addMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addUsers(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->messageMap:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final addMessageData(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "receivedEventDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->currentUserId:Ljava/lang/String;

    invoke-static {p2, p1, p3, v0}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateLastMessage(Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addChannel(Lio/getstream/chat/android/models/Channel;)V

    :cond_0
    return-void
.end method

.method public final addPoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 54

    move-object/from16 v0, p0

    const-string v1, "poll"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->messageMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    const v52, 0xfbff

    const/16 v53, 0x0

    move-object v2, v3

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

    move-object/from16 v45, p1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    move-object/from16 v2, p1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final addThread(Lio/getstream/chat/android/models/Thread;)V
    .locals 2

    const-string v0, "thread"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->threadMap:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final addUser(Lio/getstream/chat/android/models/User;)V
    .locals 2

    const-string v0, "newUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final addUsers(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "newUsers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final deletePoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 55

    move-object/from16 v0, p0

    const-string v1, "poll"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->messageMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    const v53, 0xfbff

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

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->addMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final execute(Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->currentUserId:Ljava/lang/String;

    if-eqz p1, :cond_6

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v7, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->id:I

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->channelMap:Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->size()I

    move-result v9

    const-string v10, "[execute] id: "

    const-string v11, ", channelMap.size: "

    invoke-static {v2, v9, v10, v11}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v9, 0x0

    invoke-interface {p1, v8, v7, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iput v6, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->channelMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    invoke-static {v2, v6}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object v2

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_4

    :cond_9
    :goto_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->messageMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->userMap:Ljava/util/Map;

    invoke-static {v2, v5}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object v2

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_4

    :cond_a
    :goto_3
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->threadMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$execute$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final getCurrentChannel(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;
    .locals 1

    const-string v0, "cId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->channelMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    return-object p1
.end method

.method public final getCurrentMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->messageMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    return-object p1
.end method

.method public final getCurrentThread(Ljava/lang/String;)Lio/getstream/chat/android/models/Thread;
    .locals 1

    const-string v0, "threadId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->threadMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Thread;

    return-object p1
.end method

.method public final getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 3

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->messageMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-static {v0, v1}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    new-instance v1, Lxb3/e;

    invoke-direct {v1, v0}, Lxb3/e;-><init>(Lxb3/f;)V

    :cond_0
    invoke-virtual {v1}, Lxb3/e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method
