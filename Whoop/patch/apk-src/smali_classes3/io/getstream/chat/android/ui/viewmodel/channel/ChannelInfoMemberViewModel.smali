.class public final Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008\u001d\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;",
        "Landroidx/lifecycle/w1;",
        "",
        "cid",
        "memberId",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;",
        "controllerProvider",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;",
        "action",
        "Ll83/a0;",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;)V",
        "Ljava/lang/String;",
        "controller$delegate",
        "Ll83/h;",
        "getController",
        "()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;",
        "controller",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;",
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

.field private final memberId:Ljava/lang/String;

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controllerProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->cid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->memberId:Ljava/lang/String;

    .line 6
    new-instance p1, Li;

    const/4 p2, 0x4

    invoke-direct {p1, p2, p3, p0}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->controller$delegate:Ll83/h;

    .line 7
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->getState()Lec3/f2;

    move-result-object p1

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->state:Landroidx/lifecycle/p0;

    .line 8
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->getEvents()Lec3/t1;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p3, p2, p3}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt;->asSingleLiveEvent$default(Lec3/l;Lq83/j;ILjava/lang/Object;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->events:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    new-instance p3, La23/b;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, La23/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-static {p2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v4

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;-><init>(Ljava/lang/String;Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final controller_delegate$lambda$1(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->_init_$lambda$0(Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    move-result-object p0

    return-object p0
.end method

.method private final getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->controller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->events:Landroidx/lifecycle/p0;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;)V

    return-void
.end method
