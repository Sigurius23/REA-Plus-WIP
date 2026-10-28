.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ \u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J6\u0010\u0018\u001a\u00020\u000c2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V",
        "",
        "cid",
        "Lio/getstream/chat/android/models/Message;",
        "processedMessage",
        "Ll83/a0;",
        "handleSendMessageSuccess",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "message",
        "Ln23/e;",
        "error",
        "handleSendMessageFailure",
        "(Lio/getstream/chat/android/models/Message;Ln23/e;Lq83/d;)Ljava/lang/Object;",
        "Ln23/h;",
        "result",
        "channelType",
        "channelId",
        "onMessageSendResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
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
.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

.field private final userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V
    .locals 1

    const-string v0, "userRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    return-void
.end method

.method public static final synthetic access$handleSendMessageFailure(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;Lio/getstream/chat/android/models/Message;Ln23/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->handleSendMessageFailure(Lio/getstream/chat/android/models/Message;Ln23/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleSendMessageSuccess(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->handleSendMessageSuccess(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final handleSendMessageFailure(Lio/getstream/chat/android/models/Message;Ln23/e;Lq83/d;)Ljava/lang/Object;
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ln23/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ln23/e;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->I$0:I

    iget-boolean v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->Z$0:Z

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$3:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$2:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/models/Message;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ln23/e;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result v1

    sget-object v4, Lb23/i;->a:Lb23/i;

    sget-object v4, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    const-string v9, "Chat:SendMessageHandlerDB"

    invoke-interface {v4, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lb23/i;->c:Lb23/j;

    const-string v10, "[handleSendMessageFailure] isPermanentError: "

    invoke-static {v10, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v4, v8, v9, v10, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    if-eqz v1, :cond_5

    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    :goto_1
    move-object/from16 v23, v4

    goto :goto_2

    :cond_5
    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_1

    :goto_2
    new-instance v30, Ljava/util/Date;

    invoke-direct/range {v30 .. v30}, Ljava/util/Date;-><init>()V

    const v58, 0xffff

    const/16 v59, 0x0

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

    const/16 v24, 0x0

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

    const v57, -0x204001

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v59}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v8

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-static {v8}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v9

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$3:Ljava/lang/Object;

    iput-boolean v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->Z$0:Z

    const/4 v10, 0x0

    iput v10, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->I$0:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->label:I

    invoke-interface {v4, v9, v2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto :goto_4

    :cond_6
    move v6, v1

    move-object v9, v8

    move v4, v10

    :goto_3
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->L$3:Ljava/lang/Object;

    iput-boolean v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->Z$0:Z

    iput v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageFailure$1;->label:I

    invoke-interface {v1, v8, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    :goto_4
    return-object v3

    :cond_7
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private final handleSendMessageSuccess(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->I$0:I

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/Message;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/models/Message;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v8

    sget-object v23, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const v58, 0xffff

    const/16 v59, 0x0

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

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, -0x4001

    invoke-static/range {v8 .. v59}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v8

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$2:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$3:Ljava/lang/Object;

    const/4 v9, 0x0

    iput v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->I$0:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->label:I

    invoke-interface {v4, v8, v2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v6, v1

    move-object v8, v6

    move v4, v9

    :goto_1
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->L$3:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$handleSendMessageSuccess$1;->label:I

    invoke-interface {v1, v6, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method


# virtual methods
.method public final onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;

    invoke-direct {v0, p0, p5}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$3:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Lio/getstream/chat/android/models/Message;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ln23/h;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_1

    :cond_4
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-virtual {p4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p5

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$3:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$4:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    invoke-interface {p3, p5, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p5, Lio/getstream/chat/android/models/Message;

    if-eqz p5, :cond_6

    invoke-virtual {p5}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p3

    goto :goto_2

    :cond_6
    move-object p3, v7

    :goto_2
    sget-object p5, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    if-ne p3, p5, :cond_7

    return-object v6

    :cond_7
    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_9

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$4:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    invoke-direct {p0, p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->handleSendMessageSuccess(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    return-object v6

    :cond_9
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_b

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->L$4:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase$onMessageSendResult$1;->label:I

    invoke-direct {p0, p4, p1, v0}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;->handleSendMessageFailure(Lio/getstream/chat/android/models/Message;Ln23/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    :goto_5
    return-object v6

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
