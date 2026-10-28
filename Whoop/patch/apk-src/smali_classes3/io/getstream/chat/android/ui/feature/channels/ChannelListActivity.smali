.class public Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0019\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupEdgeToEdge",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;",
        "createChannelListFragment",
        "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;


# instance fields
.field private binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/m;-><init>()V

    return-void
.end method

.method private static final createChannelListFragment$lambda$0(Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;)Ll83/a0;
    .locals 1

    const-string v0, "$this$newInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;-><init>()V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->setFragment(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;

    sget v0, Lio/getstream/chat/android/ui/R$style;->StreamUiTheme_ChannelListScreen:I

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->customTheme(I)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showSearch(Z)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showHeader(Z)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_header_connected:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->headerTitle(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final createIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;->createIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final createIntent(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "+",
            "Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;",
            ">;)",
            "Landroid/content/Intent;"
        }
    .end annotation

    .line 2
    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;->createIntent(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->createChannelListFragment$lambda$0(Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;)Ll83/a0;

    return-void
.end method

.method private final setupEdgeToEdge()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final createChannelListFragment()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;

    new-instance v1, Lhb2/c;

    const/16 v2, 0x17

    invoke-direct {v1, p0, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;->newInstance(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    move-result-object v0

    return-object v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->setupEdgeToEdge()V

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    invoke-static {p1, p1}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object p1

    sget v0, Lio/getstream/chat/android/ui/R$id;->container:I

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;->createChannelListFragment()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v2}, Landroidx/fragment/app/c2;->e(ILandroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/a;->j()I

    :cond_1
    return-void
.end method
