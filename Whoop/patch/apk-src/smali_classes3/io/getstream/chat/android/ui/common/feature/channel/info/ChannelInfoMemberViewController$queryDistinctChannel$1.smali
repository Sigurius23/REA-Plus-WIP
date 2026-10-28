.class final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->queryDistinctChannel()Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lio/getstream/chat/android/models/Channel;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$queryDistinctChannel$1"
    f = "ChannelInfoMemberViewController.kt"
    l = {
        0x83,
        0x87,
        0x8b,
        0x90
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->label:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$7:Ljava/lang/Object;

    check-cast v1, Ln23/e;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$6:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$5:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$9:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Channel;

    goto :goto_0

    :cond_2
    iget v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$0:I

    :goto_0
    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$8:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$7:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$6:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$4:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$3:Ljava/lang/Object;

    check-cast v6, Ln23/h;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$0:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v4, v3

    move-object/from16 v3, p1

    goto/16 :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_f

    iget-object v10, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-static {v10}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lb23/k;

    move-result-object v11

    iget-object v12, v11, Lb23/k;->c:Lb23/e;

    iget-object v13, v11, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->y:Lb23/g;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    invoke-static {v10}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getMemberId$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Ljava/lang/String;

    move-result-object v12

    const-string v15, "[queryDistinctChannel] currentUserId: "

    const-string v4, ", memberId: "

    invoke-static {v15, v3, v4, v12}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v11, v14, v13, v4, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-static {v10}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object v4

    invoke-static {v10}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getMemberId$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v11, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lio/getstream/chat/android/models/Filters;->distinct(Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v17

    sget-object v3, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    const-string v11, "last_updated"

    invoke-virtual {v3, v11}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v20

    new-instance v16, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v8}, Ljava/lang/Integer;-><init>(I)V

    new-instance v11, Ljava/lang/Integer;

    invoke-direct {v11, v7}, Ljava/lang/Integer;-><init>(I)V

    const/16 v26, 0x1c2

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v3

    move-object/from16 v22, v11

    invoke-direct/range {v16 .. v27}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v16

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/ChatClient;->queryChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object v3

    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$0:Ljava/lang/Object;

    iput-object v10, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$2:Ljava/lang/Object;

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$0:I

    iput v7, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->label:I

    invoke-interface {v3, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto/16 :goto_4

    :cond_6
    move v4, v8

    move-object v7, v10

    :goto_1
    check-cast v3, Ln23/h;

    instance-of v10, v3, Ln23/g;

    if-eqz v10, :cond_b

    move-object v10, v3

    check-cast v10, Ln23/g;

    iget-object v10, v10, Ln23/g;->a:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-static {v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lb23/k;

    move-result-object v5

    iget-object v10, v5, Lb23/k;->c:Lb23/e;

    iget-object v11, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-static {v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getMemberId$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Ljava/lang/String;

    move-result-object v10

    const-string v13, "[queryDistinctChannel] No distinct channel found of member: "

    invoke-static {v13, v10}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5, v12, v11, v10, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$3:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$4:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$5:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$6:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$7:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$8:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$0:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$1:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$2:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$3:I

    iput v6, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->label:I

    invoke-interface {v1, v9, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_8

    goto/16 :goto_4

    :cond_8
    move-object v5, v3

    move v3, v4

    move-object v6, v7

    :goto_2
    move v4, v3

    move-object v3, v5

    move-object v7, v6

    goto :goto_3

    :cond_9
    invoke-static {v10}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Channel;

    invoke-static {v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lb23/k;

    move-result-object v10

    iget-object v11, v10, Lb23/k;->c:Lb23/e;

    iget-object v12, v10, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_a

    iget-object v10, v10, Lb23/k;->b:Lb23/j;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v11

    const-string v14, "[queryDistinctChannel] Found distinct channel: "

    invoke-static {v14, v11}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v13, v12, v11, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iput-object v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$3:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$4:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$5:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$6:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$7:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$8:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$9:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$0:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$1:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$2:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$3:I

    iput v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->label:I

    invoke-interface {v1, v6, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_8

    goto :goto_4

    :cond_b
    instance-of v5, v3, Ln23/f;

    if-eqz v5, :cond_e

    :goto_3
    instance-of v5, v3, Ln23/g;

    if-nez v5, :cond_f

    instance-of v5, v3, Ln23/f;

    if-eqz v5, :cond_d

    invoke-static {v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v10, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->F:Lb23/g;

    invoke-interface {v6, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-static {v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getMemberId$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "[queryDistinctChannel] Error querying distinct channel of member: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v11, v10, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$4:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$5:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$6:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$7:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$8:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->L$9:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$0:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$1:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$2:I

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->I$3:I

    const/4 v3, 0x4

    iput v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$queryDistinctChannel$1;->label:I

    invoke-interface {v1, v9, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_f

    :goto_4
    return-object v2

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
