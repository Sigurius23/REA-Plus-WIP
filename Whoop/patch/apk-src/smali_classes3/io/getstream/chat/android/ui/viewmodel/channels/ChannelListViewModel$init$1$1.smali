.class final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "queryChannelsState",
        "Ll83/a0;",
        "<anonymous>",
        "(Lio/getstream/chat/android/client/api/state/QueryChannelsState;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$init$1$1"
    f = "ChannelListViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $$this$launch:Lbc3/c0;

.field final synthetic $queryJob:Lbc3/u;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lbc3/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;",
            "Lbc3/u;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$$this$launch:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$queryJob:Lbc3/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invokeSuspend$lambda$5(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)Ll83/a0;

    return-void
.end method

.method public static synthetic h(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invokeSuspend$lambda$5$lambda$4(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ljava/util/List;)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/state/ChannelsStateData;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object v0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getChannelMutes$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {p0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$handleChannelStateNews(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/state/ChannelsStateData;Ljava/util/List;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ljava/util/List;)Ll83/a0;
    .locals 6

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;->getChannels()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-ne v3, v4, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;->getChannels()Ljava/util/List;

    move-result-object v5

    invoke-static {p0, v5, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$parseMutedChannels(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, p0, v4, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;ZLjava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    move-result-object p0

    invoke-virtual {v3, p0}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object p0

    if-eqz v0, :cond_1

    const/4 p1, 0x3

    invoke-static {v0, v1, v2, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;ZLjava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    move-result-object v2

    :cond_1
    invoke-virtual {p0, v2}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$3(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)Ll83/a0;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/d;-><init>(ZI)V

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$setPaginationState(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$3$lambda$2(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p0, v2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$5(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)Ll83/a0;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/d;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/d;-><init>(ZI)V

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$setPaginationState(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$5$lambda$4(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, p0, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invokeSuspend$lambda$3$lambda$2(ZLio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invokeSuspend$lambda$3(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)Ll83/a0;

    return-void
.end method

.method public static synthetic l(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/state/ChannelsStateData;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invokeSuspend$lambda$0(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/state/ChannelsStateData;)Ll83/a0;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$$this$launch:Lbc3/c0;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$queryJob:Lbc3/u;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;-><init>(Lbc3/c0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lbc3/u;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lio/getstream/chat/android/client/api/state/QueryChannelsState;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->invoke(Lio/getstream/chat/android/client/api/state/QueryChannelsState;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->label:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$$this$launch:Lbc3/c0;

    invoke-static {p1}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p1

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$queryJob:Lbc3/u;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/QueryChannelsState;->getChannelsStateData()Lec3/f2;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    new-instance v5, Lio/getstream/chat/android/ui/viewmodel/channels/c;

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Lio/getstream/chat/android/ui/viewmodel/channels/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V

    new-instance v4, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v2, v3, v4}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->addFlow(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$queryJob:Lbc3/u;

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {v3}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getChannelMutes$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Lec3/f2;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    new-instance v5, Lio/getstream/chat/android/ui/viewmodel/channels/c;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Lio/getstream/chat/android/ui/viewmodel/channels/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V

    new-instance v4, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v2, v3, v4}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->addFlow(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getPaginationStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$queryJob:Lbc3/u;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/QueryChannelsState;->getLoadingMore()Lec3/f2;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    new-instance v5, Lio/getstream/chat/android/ui/viewmodel/channels/c;

    const/4 v6, 0x2

    invoke-direct {v5, v4, v6}, Lio/getstream/chat/android/ui/viewmodel/channels/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V

    new-instance v4, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v2, v3, v4}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->addFlow(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->access$getPaginationStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)Landroidx/lifecycle/t0;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->$queryJob:Lbc3/u;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/QueryChannelsState;->getEndOfChannels()Lec3/f2;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    new-instance v4, Lio/getstream/chat/android/ui/viewmodel/channels/c;

    const/4 v5, 0x3

    invoke-direct {v4, v3, v5}, Lio/getstream/chat/android/ui/viewmodel/channels/c;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v2, v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->addFlow(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V

    return-object v1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
