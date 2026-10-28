.class final Lio/getstream/chat/android/client/ChatClient$editMessage$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->editMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$editMessage$1"
    f = "ChatClient.kt"
    l = {
        0xac4,
        0xacc,
        0xad4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $message:Lio/getstream/chat/android/models/Message;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$editMessage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$message:Lio/getstream/chat/android/models/Message;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelType:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelId:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/ChatClient$editMessage$1;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$editMessage$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 61

    move-object/from16 v5, p0

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->label:I

    const/4 v7, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v7, :cond_0

    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    iget-object v1, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v0

    move-object/from16 v0, p1

    goto/16 :goto_2

    :cond_2
    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v9, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/attachment/MessagePreparerKt;->prepareForUpload(Ljava/util/List;)Ljava/util/List;

    move-result-object v16

    const v59, 0xffff

    const/16 v60, 0x0

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

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, -0x41

    invoke-static/range {v9 .. v60}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->hasPendingAttachments(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v1, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/ChatClient;->updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v0

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$0:Ljava/lang/Object;

    iput v2, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->label:I

    invoke-interface {v0, v5}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_4

    goto/16 :goto_3

    :cond_4
    return-object v0

    :cond_5
    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getLogicRegistry()Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelType:Ljava/lang/String;

    iget-object v4, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelId:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;->channelStateLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    move-result-object v2

    move-object v9, v2

    goto :goto_0

    :cond_6
    move-object v9, v8

    :goto_0
    if-eqz v9, :cond_7

    invoke-interface {v9}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->channelState()Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    move-object v10, v2

    goto :goto_1

    :cond_7
    move-object v10, v8

    :goto_1
    if-eqz v9, :cond_8

    invoke-interface {v9, v0}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_8
    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getAttachmentsSender$stream_chat_android_client_release()Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    move-result-object v2

    move-object v3, v0

    move-object v0, v2

    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelType:Ljava/lang/String;

    move-object v4, v3

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$channelId:Ljava/lang/String;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$0:Ljava/lang/Object;

    iput-object v9, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$1:Ljava/lang/Object;

    iput-object v10, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$2:Ljava/lang/Object;

    iput v1, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->label:I

    move-object v1, v4

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;->sendAttachments$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_9

    goto :goto_3

    :cond_9
    move-object v1, v9

    :goto_2
    check-cast v0, Ln23/h;

    instance-of v2, v0, Ln23/g;

    if-eqz v2, :cond_b

    iget-object v1, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/ChatClient;->updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object v0

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->L$3:Ljava/lang/Object;

    iput v7, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->label:I

    invoke-interface {v0, v5}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_a

    :goto_3
    return-object v6

    :cond_a
    :goto_4
    check-cast v0, Ln23/h;

    return-object v0

    :cond_b
    instance-of v2, v0, Ln23/f;

    if-eqz v2, :cond_e

    if-eqz v10, :cond_c

    invoke-interface {v1, v10}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    return-object v0

    :cond_c
    iget-object v1, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v1

    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$editMessage$1;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "[editMessage] Upload failed and original message is unavailable for rollback (messageId="

    const-string v7, "). Channel state may be stale."

    invoke-static {v3, v2, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v6, v4, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    return-object v0

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
