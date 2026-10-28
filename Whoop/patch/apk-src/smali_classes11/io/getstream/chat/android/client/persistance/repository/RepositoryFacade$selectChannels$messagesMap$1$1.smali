.class final Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/k;",
        "",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "<anonymous>",
        "(Lbc3/c0;)Ll83/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade$selectChannels$messagesMap$1$1"
    f = "RepositoryFacade.kt"
    l = {
        0x50
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $pagination:Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->$cid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->this$0:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object p3, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->$pagination:Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->$cid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->this$0:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->$pagination:Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)V

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
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->$cid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->this$0:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v3, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->$pagination:Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iput-object p1, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$selectChannels$messagesMap$1$1;->label:I

    invoke-virtual {v1, p1, v3, p0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessagesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
