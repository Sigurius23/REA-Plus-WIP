.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J&\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V",
        "",
        "cid",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "Ll83/a0;",
        "onShuffleGiphyResult",
        "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
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
.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-void
.end method


# virtual methods
.method public final onShuffleGiphyResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 54
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

    instance-of v2, v1, Ln23/g;

    if-eqz v2, :cond_2

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    sget-object v17, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const v52, 0xffff

    const/16 v53, 0x0

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

    const/16 v51, -0x4001

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ShuffleGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
