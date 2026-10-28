.class public final Lio/getstream/chat/android/client/receipts/MessageReceiptManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B3\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J\u001e\u0010\u001b\u001a\u00020\u001a2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0018H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\'\u0010 \u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u001e\u0010\'\u001a\u00020&2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0018H\u0086@\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008(\u0010\u0014R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010+R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010+R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u0014\u00105\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u00104\u00a8\u00066"
    }
    d2 = {
        "Lio/getstream/chat/android/client/receipts/MessageReceiptManager;",
        "",
        "Lkotlin/Function0;",
        "Ljava/util/Date;",
        "now",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "getRepositoryFacade",
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "messageReceiptRepository",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "api",
        "<init>",
        "(Lc93/a;Lc93/a;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V",
        "Lio/getstream/chat/android/models/User;",
        "retrieveCurrentUser",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "cid",
        "Lio/getstream/chat/android/models/Channel;",
        "retrieveChannel",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "id",
        "Lio/getstream/chat/android/models/Message;",
        "retrieveMessage",
        "",
        "messages",
        "",
        "markMessagesAsDelivered",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "currentUser",
        "channel",
        "message",
        "canMarkMessageAsDelivered",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Z",
        "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
        "toDeliveryReceipt",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/receipts/MessageReceipt;",
        "channels",
        "Ll83/a0;",
        "markChannelsAsDelivered",
        "markMessageAsDelivered",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "messageId",
        "Lc93/a;",
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repositoryFacade",
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
.field private final api:Lio/getstream/chat/android/client/api/ChatApi;

.field private final getRepositoryFacade:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
            "Lio/getstream/chat/android/client/api/ChatApi;",
            ")V"
        }
    .end annotation

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getRepositoryFacade"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageReceiptRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->now:Lc93/a;

    iput-object p2, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getRepositoryFacade:Lc93/a;

    iput-object p3, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    iput-object p4, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->api:Lio/getstream/chat/android/client/api/ChatApi;

    const-string p1, "Chat:MessageReceiptManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$markMessagesAsDelivered(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->markMessagesAsDelivered(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveChannel(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->retrieveChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveCurrentUser(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->retrieveCurrentUser(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retrieveMessage(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->retrieveMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final canMarkMessageAsDelivered(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Z
    .locals 5

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getDeliveryEventsEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p3

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v0, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p3

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[canMarkMessageAsDelivered] Delivery events disabled for channel "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, v0, p1, p2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "[canMarkMessageAsDelivered] Message "

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p2

    invoke-virtual {p2}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p2}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v4, " was sent by the current user "

    invoke-static {v2, p3, v4, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v3, p2, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v0, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    const-string v3, " is shadowed"

    invoke-static {v2, p3, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v0, p1, p3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getMutes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_3

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Mute;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Mute;->getTarget()Lio/getstream/chat/android/models/User;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_5
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v0, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p3

    invoke-virtual {p3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p3

    const-string v4, " was sent by a muted user "

    invoke-static {v2, v3, v4, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v0, p1, p3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_6
    :goto_1
    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v0, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    const-string v3, " is a reply and not shown in channel"

    invoke-static {v2, p3, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v0, p1, p3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_7
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->userRead(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p3

    invoke-virtual {p3}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-virtual {p3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p3}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object p2

    const-string v3, "[canMarkMessageAsDelivered] No read state for user "

    const-string v4, " in channel "

    invoke-static {v3, p1, v4, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p3, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_8
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    invoke-static {p3, p1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p2

    if-gtz p2, :cond_9

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v0, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    const-string v3, " is already marked as read"

    invoke-static {v2, p3, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v0, p1, p3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_9
    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object p2

    if-nez p2, :cond_a

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p2

    :cond_a
    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    if-gtz p1, :cond_c

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v0, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    const-string v3, " is already marked as delivered"

    invoke-static {v2, p3, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v0, p1, p3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    return v1

    :cond_c
    const/4 p1, 0x1

    return p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getRepositoryFacade:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-object v0
.end method

.method private final markMessagesAsDelivered(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;

    iget v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[markMessagesAsDelivered] No receipts to send"

    invoke-static {p2, v0, p1, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p2

    invoke-virtual {p2}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p2}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const-string v6, "[markMessagesAsDelivered] Processing delivery receipts for "

    const-string v7, " messages\u2026"

    invoke-static {v5, v6, v7}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4, p2, v5}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, v4}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->toDeliveryReceipt(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/receipts/MessageReceipt;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object p2, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->messageReceiptRepository:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessagesAsDelivered$1;->label:I

    invoke-interface {p2, v2, v0}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->upsertMessageReceipts(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p2

    invoke-virtual {p2}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v1, Lb23/g;->y:Lb23/g;

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v2, "[markMessagesAsDelivered] "

    const-string v3, " delivery receipts upserted"

    invoke-static {p1, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p2, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private final retrieveChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object p2

    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->label:I

    invoke-virtual {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    if-nez p2, :cond_6

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    new-instance v2, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-direct {v2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;-><init>()V

    iget-object v4, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->api:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v4, p2, p1, v2}, Lio/getstream/chat/android/client/api/ChatApi;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;

    move-result-object p1

    const/4 p2, 0x0

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$3:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->L$4:Ljava/lang/Object;

    const/4 p2, 0x0

    iput p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveChannel$1;->label:I

    invoke-interface {p1, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Ln23/h;

    invoke-virtual {p2}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    return-object p1

    :cond_6
    return-object p2
.end method

.method private final retrieveCurrentUser(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v0

    const-string v1, "me"

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectUser(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final retrieveMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object p2

    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->label:I

    invoke-virtual {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/Message;

    if-nez p2, :cond_6

    iget-object p2, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->api:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/api/ChatApi;->getMessage(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    const/4 p2, 0x0

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->L$1:Ljava/lang/Object;

    const/4 p2, 0x0

    iput p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$retrieveMessage$1;->label:I

    invoke-interface {p1, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Ln23/h;

    invoke-virtual {p2}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    return-object p1

    :cond_6
    return-object p2
.end method

.method private final toDeliveryReceipt(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/receipts/MessageReceipt;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceipt;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->now:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    invoke-direct {v0, v1, p1, v2}, Lio/getstream/chat/android/client/receipts/MessageReceipt;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    return-object v0
.end method


# virtual methods
.method public final markChannelsAsDelivered(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;

    iget v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->retrieveCurrentUser(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/User;

    if-nez p2, :cond_5

    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[markChannelsAsDelivered] Current user not found"

    invoke-static {p2, v0, p1, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return-object v5

    :cond_5
    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->isDeliveryReceiptsEnabled()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    invoke-static {v4}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->getLastMessage(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Message;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-direct {p0, p2, v4, v7}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->canMarkMessageAsDelivered(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object v6, v7

    :cond_8
    if-eqz v6, :cond_7

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    iput-object v6, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markChannelsAsDelivered$1;->label:I

    invoke-direct {p0, v2, v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->markMessagesAsDelivered(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_3
    return-object v1

    :cond_a
    :goto_4
    return-object v5
.end method

.method public final markMessageAsDelivered(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;

    iget v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 1
    iget v2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    iget-object v2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->retrieveCurrentUser(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/User;

    if-nez p2, :cond_7

    .line 3
    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 5
    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    .line 6
    const-string v1, "[markMessageAsDelivered] Current user not found"

    .line 7
    invoke-static {p2, v0, p1, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 9
    :cond_7
    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->isDeliveryReceiptsEnabled()Z

    move-result v2

    if-nez v2, :cond_8

    .line 10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 11
    :cond_8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->label:I

    invoke-direct {p0, v2, v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->retrieveChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    goto :goto_3

    :cond_9
    move-object v6, v2

    move-object v2, p1

    move-object p1, p2

    move-object p2, v6

    :goto_2
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    if-nez p2, :cond_b

    .line 12
    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 14
    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "[markMessageAsDelivered] Channel "

    const-string v3, " not found"

    .line 16
    invoke-static {v2, v1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-static {p2, v0, p1, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    :cond_a
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 19
    :cond_b
    invoke-direct {p0, p1, p2, v2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->canMarkMessageAsDelivered(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 20
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$1;->label:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->markMessagesAsDelivered(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_3
    return-object v1

    :cond_c
    return-object p1

    .line 21
    :cond_d
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final markMessageAsDelivered(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p2, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;

    iget v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 27
    iget v2, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 28
    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->label:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->retrieveMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/Message;

    if-nez p2, :cond_6

    .line 29
    invoke-direct {p0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->getLogger()Lb23/k;

    move-result-object p2

    .line 30
    invoke-virtual {p2}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v1, Lb23/g;->E:Lb23/g;

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 31
    invoke-virtual {p2}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p2

    .line 32
    const-string v2, "[markMessageAsDelivered] Message "

    const-string v3, " not found"

    .line 33
    invoke-static {v2, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 34
    invoke-static {v0, v1, p2, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :cond_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    const/4 p1, 0x0

    .line 36
    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptManager$markMessageAsDelivered$2;->label:I

    invoke-virtual {p0, p2, v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;->markMessageAsDelivered(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object p1
.end method
