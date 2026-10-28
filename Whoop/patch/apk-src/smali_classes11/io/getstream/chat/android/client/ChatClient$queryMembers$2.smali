.class final Lio/getstream/chat/android/client/ChatClient$queryMembers$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->queryMembers(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ln23/h;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Ln23/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$queryMembers$2"
    f = "ChatClient.kt"
    l = {
        0x3c4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $filter:Lio/getstream/chat/android/models/FilterObject;

.field final synthetic $limit:I

.field final synthetic $members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $offset:I

.field final synthetic $sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$queryMembers$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$channelId:Ljava/lang/String;

    iput p4, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$offset:I

    iput p5, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$limit:I

    iput-object p6, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$filter:Lio/getstream/chat/android/models/FilterObject;

    iput-object p7, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object p8, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$members:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$channelId:Ljava/lang/String;

    iget v4, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$offset:I

    iget v5, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$limit:I

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$members:Ljava/util/List;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v9, p0

    iget-object v0, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln23/h;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v0, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->label:I

    const/4 v12, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v12, :cond_0

    iget v0, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->I$2:I

    iget v2, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->I$1:I

    iget v3, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->I$0:I

    iget-object v4, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$10:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v4, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$8:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$7:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$6:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v7, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$5:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/models/FilterObject;

    iget-object v8, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$4:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v14, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$3:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$2:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/client/ChatClient;

    iget-object v12, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v5

    move v5, v2

    move-object v2, v14

    move-object v14, v4

    move v4, v3

    move-object v3, v8

    move-object v8, v9

    move-object v9, v7

    move-object v7, v6

    move-object v6, v9

    move-object v9, v10

    const/4 v10, 0x0

    const/4 v12, 0x1

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$channelType:Ljava/lang/String;

    iget-object v4, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$channelId:Ljava/lang/String;

    iget v5, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$offset:I

    iget v6, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$limit:I

    iget-object v7, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v8, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v12, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->$members:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v14, v0

    move-object v15, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v12

    const/4 v12, 0x0

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v15}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v11

    iget-object v13, v11, Lb23/k;->c:Lb23/e;

    move-object/from16 p1, v0

    iget-object v0, v11, Lb23/k;->a:Ljava/lang/String;

    move-object/from16 v16, v10

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v10, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_2

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    move/from16 v17, v12

    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-interface {v12}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "[queryMembers] #doOnResult; plugin: "

    invoke-static {v13, v12}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-interface {v11, v10, v0, v12, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    move/from16 v17, v12

    const/4 v13, 0x0

    :goto_1
    iput-object v1, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$0:Ljava/lang/Object;

    iput-object v13, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$1:Ljava/lang/Object;

    iput-object v15, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$2:Ljava/lang/Object;

    iput-object v2, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$3:Ljava/lang/Object;

    iput-object v3, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$4:Ljava/lang/Object;

    iput-object v6, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$5:Ljava/lang/Object;

    iput-object v7, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$6:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$7:Ljava/lang/Object;

    iput-object v14, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$8:Ljava/lang/Object;

    iput-object v13, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$9:Ljava/lang/Object;

    iput-object v13, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->L$10:Ljava/lang/Object;

    iput v4, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->I$0:I

    iput v5, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->I$1:I

    move/from16 v11, v17

    iput v11, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->I$2:I

    const/4 v10, 0x0

    iput v10, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->I$3:I

    const/4 v12, 0x1

    iput v12, v9, Lio/getstream/chat/android/client/ChatClient$queryMembers$2;->label:I

    move-object/from16 v0, p1

    invoke-interface/range {v0 .. v9}, Lio/getstream/chat/android/client/plugin/Plugin;->onQueryMembersResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v9, v16

    if-ne v0, v9, :cond_3

    return-object v9

    :cond_3
    move v0, v11

    :goto_2
    invoke-static {v15}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v11

    iget-object v13, v11, Lb23/k;->c:Lb23/e;

    iget-object v10, v11, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v12, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_6

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    instance-of v13, v1, Ln23/g;

    if-eqz v13, :cond_4

    move-object v13, v1

    check-cast v13, Ln23/g;

    iget-object v13, v13, Ln23/g;->a:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    move/from16 p1, v0

    const-string v0, "Members(count="

    move-object/from16 v16, v2

    const-string v2, ")"

    invoke-static {v13, v0, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    move/from16 p1, v0

    move-object/from16 v16, v2

    instance-of v0, v1, Ln23/f;

    if-eqz v0, :cond_5

    move-object v0, v1

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    const-string v2, "[queryMembers] result: "

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v13, 0x0

    invoke-interface {v11, v12, v10, v0, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    move/from16 p1, v0

    move-object/from16 v16, v2

    const/4 v13, 0x0

    :goto_4
    move/from16 v12, p1

    move-object v10, v9

    move-object/from16 v2, v16

    move-object/from16 v9, p0

    goto/16 :goto_0

    :cond_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
