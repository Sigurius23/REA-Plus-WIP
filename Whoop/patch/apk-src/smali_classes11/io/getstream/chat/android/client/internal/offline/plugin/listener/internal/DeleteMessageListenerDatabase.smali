.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ&\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V",
        "",
        "messageId",
        "Ln23/h;",
        "Ll83/a0;",
        "onMessageDeletePrecondition",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onMessageDeleteRequest",
        "originalMessageId",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "onMessageDeleteResult",
        "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
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
.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V
    .locals 1

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    return-void
.end method


# virtual methods
.method public final onMessageDeletePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/Message;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/User;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    move-object p1, v5

    :goto_2
    if-nez p2, :cond_6

    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_6
    invoke-static {p2, p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->shouldDeleteRemote(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ln23/h;

    move-result-object p1

    instance-of v2, p1, Ln23/f;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeletePrecondition$1;->label:I

    invoke-interface {v2, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    return-object p1
.end method

.method public final onMessageDeleteRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 61
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

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->Z$0:Z

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->I$0:I

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$0:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->label:I

    move-object/from16 v4, p1

    invoke-interface {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_1
    move-object v9, v1

    check-cast v9, Lio/getstream/chat/android/models/Message;

    if-eqz v9, :cond_8

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v4

    new-instance v30, Ljava/util/Date;

    invoke-direct/range {v30 .. v30}, Ljava/util/Date;-><init>()V

    if-nez v4, :cond_6

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    :goto_2
    move-object/from16 v24, v1

    goto :goto_3

    :cond_6
    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_2

    :goto_3
    const v59, 0xffff

    const/16 v60, 0x0

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

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

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

    const v58, -0x104001

    invoke-static/range {v9 .. v60}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v7

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-static {v7}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v9

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$2:Ljava/lang/Object;

    const/4 v10, 0x0

    iput v10, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->I$0:I

    iput-boolean v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->Z$0:Z

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->label:I

    invoke-interface {v1, v9, v2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto :goto_5

    :cond_7
    move v6, v10

    :goto_4
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->I$0:I

    iput-boolean v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->Z$0:Z

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteRequest$1;->label:I

    invoke-interface {v1, v7, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    :goto_5
    return-object v3

    :cond_8
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final onMessageDeleteResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 63
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->label:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v9, :cond_1

    if-eq v5, v8, :cond_3

    if-ne v5, v7, :cond_2

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    :cond_1
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v1, Ln23/g;

    if-eqz v2, :cond_5

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lio/getstream/chat/android/models/Message;

    sget-object v26, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const v61, 0xffff

    const/16 v62, 0x0

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

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, -0x4001

    invoke-static/range {v11 .. v62}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$1:Ljava/lang/Object;

    iput v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->label:I

    invoke-interface {v2, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    goto/16 :goto_2

    :cond_5
    instance-of v1, v1, Ln23/f;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$1:Ljava/lang/Object;

    iput v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->label:I

    move-object/from16 v2, p1

    invoke-interface {v1, v2, v3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    goto/16 :goto_2

    :cond_6
    :goto_1
    move-object v11, v2

    check-cast v11, Lio/getstream/chat/android/models/Message;

    if-eqz v11, :cond_7

    sget-object v26, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    new-instance v33, Ljava/util/Date;

    invoke-direct/range {v33 .. v33}, Ljava/util/Date;-><init>()V

    const v61, 0xffff

    const/16 v62, 0x0

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

    const v60, -0x204001

    invoke-static/range {v11 .. v62}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$1:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$2:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->L$3:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->I$0:I

    iput v7, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase$onMessageDeleteResult$1;->label:I

    invoke-interface {v2, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    :goto_2
    return-object v4

    :cond_7
    return-object v6

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
