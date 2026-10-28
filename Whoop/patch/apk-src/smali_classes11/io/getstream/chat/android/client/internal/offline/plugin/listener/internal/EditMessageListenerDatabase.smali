.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ&\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\n2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "saveMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "onMessageEditRequest",
        "originalMessage",
        "Ln23/h;",
        "result",
        "onMessageEditResult",
        "(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
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
.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

.field private final userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 1

    const-string v0, "userRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-void
.end method

.method public static final synthetic access$saveMessage(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->saveMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final saveMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v2

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->label:I

    invoke-interface {p2, v2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase$saveMessage$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final onMessageEditRequest(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->updateMessageOnlineState(Lio/getstream/chat/android/models/Message;Z)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->saveMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onMessageEditResult(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_0

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/Message;

    sget-object v16, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

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

    const/16 v50, -0x4001

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p3

    goto :goto_1

    :cond_0
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_2

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->updateFailedMessage(Lio/getstream/chat/android/models/Message;Ln23/e;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-direct {v1, v0, v2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;->saveMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v0, v2, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_2
    move-object/from16 v1, p0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
