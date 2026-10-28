.class final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->onQueryMembersError(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ln23/e;",
        "originalError",
        "Ln23/h;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "<anonymous>",
        "(Ln23/e;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.QueryMembersErrorHandlerImpl$onQueryMembersError$1"
    f = "QueryMembersErrorHandlerImpl.kt"
    l = {
        0x49
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $limit:I

.field final synthetic $offset:I

.field final synthetic $originalCall:Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo23/d;"
        }
    .end annotation
.end field

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

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;IILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lo23/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Lo23/d;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$offset:I

    iput p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$limit:I

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$channelType:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$channelId:Ljava/lang/String;

    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object p7, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$originalCall:Lo23/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$offset:I

    iget v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$limit:I

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$channelType:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$channelId:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v7, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$originalCall:Lo23/d;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;-><init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;IILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lo23/d;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->invoke(Ln23/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/e;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->I$1:I

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->I$0:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->access$getLogger(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;)Lb23/k;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$originalCall:Lo23/d;

    iget-object v4, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "An error happened while wuery members. Error message: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ". Full error: "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v6, v5, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ln23/f;

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_3
    iget p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$offset:I

    const/4 v0, 0x0

    if-gez p1, :cond_4

    move p1, v0

    :cond_4
    iget v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$limit:I

    if-gez v2, :cond_5

    goto :goto_0

    :cond_5
    move v0, v2

    :goto_0
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->access$getChannelRepository$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    move-result-object v2

    new-instance v4, Ll83/k;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$channelType:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$channelId:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lio/getstream/chat/android/client/extensions/internal/PairKt;->toCid(Ll83/k;)Ljava/lang/String;

    move-result-object v4

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->L$0:Ljava/lang/Object;

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->I$0:I

    iput v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->I$1:I

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->label:I

    invoke-interface {v2, v4, p0}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectMembersForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    move v1, p1

    move-object p1, v2

    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;->$sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->getComparator()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {p1, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    if-lez v0, :cond_7

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    :cond_7
    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
