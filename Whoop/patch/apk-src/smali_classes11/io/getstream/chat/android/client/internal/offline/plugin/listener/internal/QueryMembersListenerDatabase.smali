.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007Jh\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "channelRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V",
        "Ln23/h;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "result",
        "",
        "channelType",
        "channelId",
        "",
        "offset",
        "limit",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "members",
        "Ll83/a0;",
        "onQueryMembersResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
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
.field private final channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

.field private final userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V
    .locals 1

    const-string v0, "userRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    return-void
.end method


# virtual methods
.method public final onQueryMembersResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p6, p9, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;

    if-eqz p6, :cond_0

    move-object p6, p9

    check-cast p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;

    iget p7, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->label:I

    const/high16 p8, -0x80000000

    and-int v0, p7, p8

    if-eqz v0, :cond_0

    sub-int/2addr p7, p8

    iput p7, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;

    invoke-direct {p6, p0, p9}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p7, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->result:Ljava/lang/Object;

    sget-object p8, Lr83/a;->w:Lr83/a;

    iget p9, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->label:I

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p9, :cond_3

    if-eq p9, v2, :cond_2

    if-ne p9, v1, :cond_1

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/FilterObject;

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p5, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->I$1:I

    iget p4, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->I$0:I

    iget-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$5:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object p2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$4:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object p2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$3:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/FilterObject;

    iget-object p2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$2:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/lang/String;

    iget-object p2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p9, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$0:Ljava/lang/Object;

    check-cast p9, Ln23/h;

    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p7, p1, Ln23/g;

    if-eqz p7, :cond_6

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    move-object p9, p1

    check-cast p9, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p9, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p9

    :goto_1
    invoke-interface {p9}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$0:Ljava/lang/Object;

    iput-object p2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$1:Ljava/lang/Object;

    iput-object p3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$2:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$3:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$4:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$5:Ljava/lang/Object;

    iput-object p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$6:Ljava/lang/Object;

    iput p4, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->I$0:I

    iput p5, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->I$1:I

    iput v2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->label:I

    invoke-interface {p7, v4, p6}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p7

    if-ne p7, p8, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p7, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    new-instance p9, Ll83/k;

    invoke-direct {p9, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p9}, Lio/getstream/chat/android/client/extensions/internal/PairKt;->toCid(Ll83/k;)Ljava/lang/String;

    move-result-object p2

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$0:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$1:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$2:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$3:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$4:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$5:Ljava/lang/Object;

    iput-object v3, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->L$6:Ljava/lang/Object;

    iput p4, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->I$0:I

    iput p5, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->I$1:I

    iput v1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase$onQueryMembersResult$1;->label:I

    invoke-interface {p7, p2, p1, p6}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->updateMembersForChannel(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p8, :cond_6

    :goto_3
    return-object p8

    :cond_6
    return-object v0
.end method
