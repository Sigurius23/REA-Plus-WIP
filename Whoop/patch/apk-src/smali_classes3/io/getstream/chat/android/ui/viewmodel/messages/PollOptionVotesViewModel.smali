.class public final Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008\u001d\u0010\u001a\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Lio/getstream/chat/android/models/Option;",
        "option",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;",
        "controllerProvider",
        "<init>",
        "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;",
        "action",
        "Ll83/a0;",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V",
        "controller$delegate",
        "Ll83/h;",
        "getController",
        "()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;",
        "controller",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;",
        "events",
        "getEvents",
        "Factory",
        "stream-chat-android-ui-components_release"
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
.field private final controller$delegate:Ll83/h;

.field private final events:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Poll;",
            "Lio/getstream/chat/android/models/Option;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "option"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "controllerProvider"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    new-instance p1, Li01/d;

    const/16 p2, 0x16

    invoke-direct {p1, p3, p0, p2}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->controller$delegate:Ll83/h;

    .line 5
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getState()Lec3/f2;

    move-result-object p1

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->state:Landroidx/lifecycle/p0;

    .line 6
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->getEvents()Lec3/t1;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p3, p2, p3}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt;->asSingleLiveEvent$default(Lec3/l;Lq83/j;ILjava/lang/Object;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->events:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    new-instance p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 p4, 0x16

    invoke-direct {p3, p4, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    invoke-static {p2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final controller_delegate$lambda$1(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->_init_$lambda$0(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    move-result-object p0

    return-object p0
.end method

.method private final getController()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->controller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    return-object v0
.end method


# virtual methods
.method public final getEvents()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->events:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->onViewAction(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V

    return-void
.end method
