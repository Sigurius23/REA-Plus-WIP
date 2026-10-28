.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0006\u0008\u0001\u0010\u0001\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lkotlin/Array;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3"
    f = "MessageListController.kt"
    l = {
        0xea
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channel$inlined:Lio/getstream/chat/android/models/Channel;

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->$channel$inlined:Lio/getstream/chat/android/models/Channel;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "[",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->$channel$inlined:Lio/getstream/chat/android/models/Channel;

    invoke-direct {v0, p3, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Channel;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$1:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$0:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$1:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aget-object v5, v4, v5

    const-string v6, "null cannot be cast to non-null type io.getstream.chat.android.models.MessagesState"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lio/getstream/chat/android/models/MessagesState;

    aget-object v6, v4, v3

    const-string v7, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.ChannelUserRead>"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v6

    check-cast v23, Ljava/util/List;

    const/4 v6, 0x2

    aget-object v6, v4, v6

    const-string v7, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const/4 v8, 0x3

    aget-object v8, v4, v8

    const-string v9, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.feature.messages.list.DateSeparatorHandler"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v47, v8

    check-cast v47, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    const/4 v8, 0x4

    aget-object v8, v4, v8

    const-string v9, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.state.messages.list.MessageFooterVisibility"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v48, v8

    check-cast v48, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

    const/4 v8, 0x5

    aget-object v8, v4, v8

    const-string v9, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.feature.messages.list.MessagePositionHandler"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v49, v8

    check-cast v49, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    const/4 v8, 0x6

    aget-object v8, v4, v8

    const-string v9, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.User>"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v50, v8

    check-cast v50, Ljava/util/List;

    const/4 v8, 0x7

    aget-object v8, v4, v8

    move-object/from16 v51, v8

    check-cast v51, Lio/getstream/chat/android/models/Message;

    const/16 v8, 0x8

    aget-object v8, v4, v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v52

    const/16 v8, 0x9

    aget-object v8, v4, v8

    move-object/from16 v53, v8

    check-cast v53, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    const/16 v8, 0xa

    aget-object v8, v4, v8

    const-string v9, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.Member>"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v18, v8

    check-cast v18, Ljava/util/List;

    const/16 v8, 0xb

    aget-object v8, v4, v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const/16 v8, 0xc

    aget-object v4, v4, v8

    const-string v8, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/Set;

    instance-of v8, v5, Lio/getstream/chat/android/models/MessagesState$Loading;

    if-nez v8, :cond_5

    instance-of v8, v5, Lio/getstream/chat/android/models/MessagesState$NoQueryActive;

    if-eqz v8, :cond_2

    goto/16 :goto_0

    :cond_2
    instance-of v8, v5, Lio/getstream/chat/android/models/MessagesState$OfflineNoResults;

    if-eqz v8, :cond_3

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messageListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v18, 0xff6

    const/16 v19, 0x0

    sget-object v6, Lm83/y;->w:Lm83/y;

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

    invoke-static/range {v5 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v4

    goto/16 :goto_1

    :cond_3
    instance-of v8, v5, Lio/getstream/chat/android/models/MessagesState$Result;

    if-eqz v8, :cond_4

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v8}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messageListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v8

    check-cast v8, Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v54, v8

    check-cast v54, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    check-cast v5, Lio/getstream/chat/android/models/MessagesState$Result;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/MessagesState$Result;->getMessages()Ljava/util/List;

    move-result-object v5

    invoke-static {v8, v5, v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$filterMessagesToShow(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v5

    move-object v6, v8

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->$channel$inlined:Lio/getstream/chat/android/models/Channel;

    const/16 v45, 0x7

    const/16 v46, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

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

    const/16 v44, -0x5001

    invoke-static/range {v8 .. v46}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v20

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->$channel$inlined:Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Channel;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v8

    const/4 v10, 0x0

    move-object/from16 v22, v4

    move-object v9, v5

    move/from16 v19, v7

    move-object/from16 v18, v21

    move-object/from16 v11, v23

    move-object/from16 v12, v47

    move-object/from16 v13, v48

    move-object/from16 v14, v49

    move-object/from16 v15, v50

    move-object/from16 v16, v51

    move-object/from16 v17, v53

    move-object/from16 v21, v8

    move-object v8, v6

    invoke-static/range {v8 .. v22}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$groupMessages(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/util/List;ZLjava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;Ljava/util/List;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Ljava/util/List;ZLio/getstream/chat/android/models/Channel;Ljava/util/Set;Ljava/util/Set;)Ljava/util/List;

    move-result-object v25

    const/16 v37, 0xff4

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    move/from16 v26, v52

    move-object/from16 v24, v54

    invoke-static/range {v24 .. v38}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v4

    goto :goto_1

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    :goto_0
    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messageListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v18, 0xff7

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v4

    :goto_1
    const/4 v5, 0x0

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3;->label:I

    invoke-interface {v2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
