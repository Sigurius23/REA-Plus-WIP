.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:Lec3/m;


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2;->$this_unsafeFlow:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 60

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;

    iget v3, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2;->$this_unsafeFlow:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v9, v8, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v9, :cond_3

    check-cast v8, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    invoke-virtual {v8}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getFocusState()Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    move-result-object v8

    sget-object v9, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocused;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocused;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_4
    move-object v6, v7

    :goto_1
    instance-of v4, v6, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v4, :cond_5

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    goto :goto_2

    :cond_5
    move-object v6, v7

    :goto_2
    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    new-instance v8, Lio/getstream/chat/android/models/Message;

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

    const/16 v57, -0x1

    invoke-direct/range {v8 .. v59}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v8

    :goto_3
    iput-object v7, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->L$3:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$special$$inlined$map$2$2$1;->label:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    :cond_7
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
