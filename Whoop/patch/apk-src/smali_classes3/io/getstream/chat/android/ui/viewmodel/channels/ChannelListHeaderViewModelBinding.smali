.class public final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;",
        "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;",
        "view",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Landroidx/lifecycle/g0;)V",
        "bindView",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Lio/getstream/chat/android/models/ConnectionState;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding;->bindView$lambda$2$lambda$1(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Lio/getstream/chat/android/models/ConnectionState;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Lio/getstream/chat/android/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding;->bindView$lambda$2$lambda$0(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Lio/getstream/chat/android/models/User;)Ll83/a0;

    return-void
.end method

.method public static final bind(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;->getCurrentUser()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;I)V

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;->getConnectionState()Landroidx/lifecycle/p0;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;I)V

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final bindView$lambda$2$lambda$0(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Lio/getstream/chat/android/models/User;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->setUser(Lio/getstream/chat/android/models/User;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$2$lambda$1(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Lio/getstream/chat/android/models/ConnectionState;)Ll83/a0;
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/models/ConnectionState$Connected;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->showOnlineTitle()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/models/ConnectionState$Connecting;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->showConnectingTitle()V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lio/getstream/chat/android/models/ConnectionState$Offline;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->showOfflineTitle()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
