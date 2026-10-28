.class public final Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;",
        "controllerProvider",
        "<init>",
        "(Lio/getstream/chat/android/models/Poll;Lkotlin/jvm/functions/Function1;)V",
        "controller$delegate",
        "Ll83/h;",
        "getController",
        "()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;",
        "controller",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
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

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Poll;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Poll;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "controllerProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    new-instance p1, Li01/d;

    const/16 v0, 0x17

    invoke-direct {p1, p2, p0, v0}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->controller$delegate:Ll83/h;

    .line 5
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;->getState()Lec3/f2;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x3

    invoke-static {p1, p2, v0}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->state:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Poll;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/f;

    const/4 p3, 0x1

    invoke-direct {p2, p1, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/f;-><init>(Ljava/lang/Object;I)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;-><init>(Lio/getstream/chat/android/models/Poll;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/models/Poll;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;-><init>(Lio/getstream/chat/android/models/Poll;)V

    return-object p1
.end method

.method private static final controller_delegate$lambda$1(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/models/Poll;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->_init_$lambda$0(Lio/getstream/chat/android/models/Poll;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;

    move-result-object p0

    return-object p0
.end method

.method private final getController()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->controller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;

    return-object v0
.end method


# virtual methods
.method public final getState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method
