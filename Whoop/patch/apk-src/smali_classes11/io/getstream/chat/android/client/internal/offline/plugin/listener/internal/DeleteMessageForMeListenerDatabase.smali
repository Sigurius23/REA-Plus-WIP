.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ&\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V",
        "",
        "messageId",
        "Ll83/a0;",
        "onDeleteMessageForMeRequest",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "onDeleteMessageForMeResult",
        "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
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
.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V
    .locals 1

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    return-void
.end method


# virtual methods
.method public final onDeleteMessageForMeRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 60
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

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$0:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->label:I

    move-object/from16 v4, p1

    invoke-interface {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_4

    :cond_4
    :goto_1
    move-object v8, v1

    check-cast v8, Lio/getstream/chat/android/models/Message;

    if-eqz v8, :cond_6

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    :goto_2
    move-object/from16 v23, v4

    goto :goto_3

    :cond_5
    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_2

    :goto_3
    const/16 v58, 0x7fff

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

    const/16 v56, 0x1

    const/16 v57, -0x4001

    invoke-static/range {v8 .. v59}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v4

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->I$0:I

    iput-boolean v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->Z$0:Z

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1;->label:I

    invoke-interface {v6, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    :goto_4
    return-object v3

    :cond_6
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final onDeleteMessageForMeResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
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

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->label:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v9, :cond_1

    if-eq v5, v8, :cond_3

    if-ne v5, v7, :cond_2

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    :cond_1
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v1, Ln23/g;

    if-eqz v2, :cond_5

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

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

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$1:Ljava/lang/Object;

    iput v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->label:I

    invoke-interface {v2, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    goto/16 :goto_2

    :cond_5
    instance-of v1, v1, Ln23/f;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$1:Ljava/lang/Object;

    iput v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->label:I

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

    const/16 v61, 0x7fff

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

    const/16 v59, 0x1

    const/16 v60, -0x4001

    invoke-static/range {v11 .. v62}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$1:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$2:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->L$3:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->I$0:I

    iput v7, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1;->label:I

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
