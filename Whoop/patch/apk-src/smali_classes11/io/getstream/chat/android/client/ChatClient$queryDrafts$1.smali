.class final Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->queryDrafts(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/QueryDraftsResult;",
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
    c = "io.getstream.chat.android.client.ChatClient$queryDrafts$1"
    f = "ChatClient.kt"
    l = {
        0xa60
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $filter:Lio/getstream/chat/android/models/FilterObject;

.field final synthetic $limit:I

.field final synthetic $next:Ljava/lang/String;

.field final synthetic $sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/DraftsSort;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field I$2:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/DraftsSort;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$filter:Lio/getstream/chat/android/models/FilterObject;

    iput p3, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$limit:I

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$next:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$filter:Lio/getstream/chat/android/models/FilterObject;

    iget v3, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$limit:I

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$next:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ln23/h;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v9, :cond_0

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->I$1:I

    iget v3, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->I$0:I

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$4:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/models/FilterObject;

    iget-object v10, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v6

    move-object v6, v5

    move-object v5, p1

    move p1, v1

    move-object v10, v4

    move v4, v3

    move-object v3, v7

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$filter:Lio/getstream/chat/android/models/FilterObject;

    iget v3, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$limit:I

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$next:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v10, p1

    move-object v6, v5

    move p1, v8

    move-object v5, v4

    move v4, v3

    move-object v3, v1

    :cond_2
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    iput-object v2, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$3:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$4:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$5:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$6:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->L$7:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->I$0:I

    iput p1, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->I$1:I

    iput v8, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->I$2:I

    iput v9, p0, Lio/getstream/chat/android/client/ChatClient$queryDrafts$1;->label:I

    move-object v7, p0

    invoke-interface/range {v1 .. v7}, Lio/getstream/chat/android/client/plugin/Plugin;->onQueryDraftMessagesResult(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
