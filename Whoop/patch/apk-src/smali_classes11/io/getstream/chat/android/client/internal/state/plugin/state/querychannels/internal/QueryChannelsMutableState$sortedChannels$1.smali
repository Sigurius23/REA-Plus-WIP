.class final Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lbc3/c0;Lec3/f2;Lec3/f2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "channelMap",
        "",
        "",
        "userMap",
        "Lio/getstream/chat/android/models/User;",
        "activeLocations",
        "Lio/getstream/chat/android/models/Location;",
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState$sortedChannels$1"
    f = "QueryChannelsMutableState.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field synthetic L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    check-cast p3, Ljava/util/List;

    check-cast p4, Lio/getstream/chat/android/models/querysort/QuerySorter;

    check-cast p5, Lq83/d;

    invoke-virtual/range {p0 .. p5}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->invoke(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;

    const/4 v1, 0x5

    .line 2
    invoke-direct {v0, v1, p5}, Ls83/i;-><init>(ILq83/d;)V

    .line 3
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$3:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/querysort/QuerySorter;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;->label:I

    if-nez v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v2}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateLiveLocations(Ljava/util/Collection;Ljava/util/List;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {v3}, Lio/getstream/chat/android/models/querysort/QuerySorter;->getComparator()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
