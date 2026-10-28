.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V",
        "",
        "cid",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "Ll83/a0;",
        "onShuffleGiphyResult",
        "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
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

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    return-void
.end method


# virtual methods
.method public final onShuffleGiphyResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 62
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

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->label:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v1, Ln23/g;

    if-eqz v2, :cond_5

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lio/getstream/chat/android/models/Message;

    sget-object v25, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const v60, 0xffff

    const/16 v61, 0x0

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

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, -0x4001

    invoke-static/range {v10 .. v61}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->users(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v5

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$1:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$2:Ljava/lang/Object;

    iput v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->label:I

    invoke-interface {v2, v5, v3}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$1:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->L$2:Ljava/lang/Object;

    iput v7, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase$onShuffleGiphyResult$1;->label:I

    invoke-interface {v2, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_5

    :goto_2
    return-object v4

    :cond_5
    return-object v6
.end method
