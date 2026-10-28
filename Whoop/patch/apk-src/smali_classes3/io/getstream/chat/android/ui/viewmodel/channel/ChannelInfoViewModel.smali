.class public final Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00080\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001f\u001a\u0004\u0008$\u0010!\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;",
        "Landroidx/lifecycle/w1;",
        "",
        "cid",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
        "",
        "optionFilter",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;",
        "controllerProvider",
        "<init>",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;",
        "action",
        "Ll83/a0;",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;)V",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;",
        "event",
        "onMemberViewEvent",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;)V",
        "Ljava/lang/String;",
        "Lkotlin/jvm/functions/Function1;",
        "controller$delegate",
        "Ll83/h;",
        "getController",
        "()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;",
        "controller",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;",
        "events",
        "getEvents",
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
.field private final cid:Ljava/lang/String;

.field private final controller$delegate:Ll83/h;

.field private final events:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final optionFilter:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
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
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controllerProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 5
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->cid:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->optionFilter:Lkotlin/jvm/functions/Function1;

    .line 7
    new-instance p1, Li;

    const/4 p2, 0x5

    invoke-direct {p1, p2, p3, p0}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->controller$delegate:Ll83/h;

    .line 8
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getState()Lec3/f2;

    move-result-object p1

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->state:Landroidx/lifecycle/p0;

    .line 9
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->getEvents()Lec3/t1;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p3, p2, p3}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt;->asSingleLiveEvent$default(Lec3/l;Lq83/j;ILjava/lang/Object;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->events:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 1
    new-instance p2, Lp;

    const/4 p5, 0x4

    invoke-direct {p2, p5}, Lp;-><init>(I)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 2
    new-instance p3, La23/c;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, La23/c;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final _init_$lambda$1(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-static {p2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;-><init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final controller_delegate$lambda$2(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->_init_$lambda$1(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    move-result-object p0

    return-object p0
.end method

.method private final getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->controller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    return-object v0
.end method

.method public static synthetic j(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->_init_$lambda$0(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)Z

    return-void
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

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->events:Landroidx/lifecycle/p0;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final onMemberViewEvent(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->onMemberViewEvent(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;)V

    return-void
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;)V

    return-void
.end method
