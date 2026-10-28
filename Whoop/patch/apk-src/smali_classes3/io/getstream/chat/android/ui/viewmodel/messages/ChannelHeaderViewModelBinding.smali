.class public final Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;",
        "view",
        "Landroidx/lifecycle/g0;",
        "lifecycle",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Landroidx/lifecycle/g0;)V",
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
.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/ConnectionState;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding;->bindView$lambda$1(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/ConnectionState;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding;->bindView$lambda$2(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/Message;)Ll83/a0;

    return-void
.end method

.method public static final bind(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->getChannel()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;I)V

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->getOnline()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/a;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;I)V

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->getTypingUsers()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$bindView$3;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$bindView$3;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->getActiveThread()Landroidx/lifecycle/p0;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/a;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;I)V

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/Channel;)Ll83/a0;
    .locals 3

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;->formatChannelName(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->setTitle(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->setAvatar(Lio/getstream/chat/android/models/Channel;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->getMembersStatusText$default(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->setOnlineStateSubtitle(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$1(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/ConnectionState;)Ll83/a0;
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/models/ConnectionState$Connected;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->showOnlineStateSubtitle()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/models/ConnectionState$Connecting;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->showSearchingForNetworkLabel()V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lio/getstream/chat/android/models/ConnectionState$Offline;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->showOfflineStateLabel()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final bindView$lambda$2(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/Message;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->setThreadMode()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->setNormalMode()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding;->bindView$lambda$0(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Lio/getstream/chat/android/models/Channel;)Ll83/a0;

    return-void
.end method
