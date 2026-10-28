.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ2\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J@\u0010\u0016\u001a\u00020\u00102\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00132\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "reactionsRepository",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V",
        "",
        "cid",
        "messageId",
        "reactionType",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Ll83/a0;",
        "onDeleteReactionRequest",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "onDeleteReactionResult",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onDeleteReactionPrecondition",
        "(Lio/getstream/chat/android/models/User;)Ln23/h;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
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

.field private final reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V
    .locals 1

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    return-void
.end method


# virtual methods
.method public final onDeleteReactionPrecondition(Lio/getstream/chat/android/models/User;)Ln23/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Current user is null!"

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method

.method public final onDeleteReactionRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 61
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$5:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Reaction;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/User;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$4:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$4:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/models/User;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v7

    goto :goto_3

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p4 .. p4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v15

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    :goto_1
    move-object/from16 v20, v1

    goto :goto_2

    :cond_5
    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_1

    :goto_2
    new-instance v19, Ljava/util/Date;

    invoke-direct/range {v19 .. v19}, Ljava/util/Date;-><init>()V

    new-instance v10, Lio/getstream/chat/android/models/Reaction;

    const/16 v25, 0x3ce4

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v14, p4

    invoke-direct/range {v10 .. v26}, Lio/getstream/chat/android/models/Reaction;-><init>(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$3:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$4:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->label:I

    invoke-interface {v1, v10, v2}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object v4, v10

    :goto_3
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$3:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$4:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->label:I

    invoke-interface {v1, v11, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_5

    :cond_7
    :goto_4
    move-object v9, v1

    check-cast v9, Lio/getstream/chat/android/models/Message;

    if-eqz v9, :cond_8

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

    const/16 v57, 0x0

    const/16 v58, -0x1

    invoke-static/range {v9 .. v60}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-static {v1, v4}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->removeMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->L$5:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionRequest$1;->label:I

    invoke-interface {v6, v1, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    :goto_5
    return-object v3

    :cond_8
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final onDeleteReactionResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;

    if-eqz p1, :cond_0

    move-object p1, p6

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;

    iget v0, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->label:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;

    invoke-direct {p1, p0, p6}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p6, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$5:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Reaction;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$4:Ljava/lang/Object;

    check-cast p2, Ln23/h;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$3:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/User;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$4:Ljava/lang/Object;

    move-object p5, p2

    check-cast p5, Ln23/h;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$3:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/User;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p6, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-virtual {p4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p4

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$3:Ljava/lang/Object;

    iput-object p5, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$4:Ljava/lang/Object;

    iput v3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->label:I

    invoke-interface {p6, p3, p2, p4, p1}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p6, Lio/getstream/chat/android/models/Reaction;

    if-eqz p6, :cond_5

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-static {p6, p5}, Lio/getstream/chat/android/client/extensions/internal/ReactionKt;->updateSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;

    move-result-object p3

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$3:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$4:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->L$5:Ljava/lang/Object;

    const/4 p4, 0x0

    iput p4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->I$0:I

    iput v2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase$onDeleteReactionResult$1;->label:I

    invoke-interface {p2, p3, p1}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
