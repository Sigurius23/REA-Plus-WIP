.class final Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->loadMore()V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.pinned.PinnedMessageListController$loadMore$1"
    f = "PinnedMessageListController.kt"
    l = {
        0x67
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->this$0:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->this$0:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;-><init>(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 62

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->this$0:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->access$shouldLoadMore(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->this$0:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;)Lec3/p1;

    move-result-object v2

    :cond_3
    move-object v5, v2

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    invoke-virtual {v7}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->getResults()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    new-instance v9, Lio/getstream/chat/android/ui/common/model/MessageResult;

    new-instance v10, Lio/getstream/chat/android/models/Message;

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

    const/16 v58, 0x0

    const/16 v59, -0x1

    invoke-direct/range {v10 .. v61}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v9, v10, v11}, Lio/getstream/chat/android/ui/common/model/MessageResult;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V

    invoke-static {v9, v8}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v9

    const/16 v12, 0x9

    const/4 v8, 0x0

    const/4 v10, 0x1

    invoke-static/range {v7 .. v13}, Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;ZLjava/util/List;ZLjava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->this$0:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$loadMore$1;->label:I

    invoke-static {v2, v0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->access$loadPinnedMessages(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_0
    return-object v3
.end method
