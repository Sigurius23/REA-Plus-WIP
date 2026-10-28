.class public final Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;
.super Lpq/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 ?2\u00020\u0001:\u0003@A?B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010+R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010,R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010-R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010:\u001a\u00020(8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=\u00a8\u0006B"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;",
        "Lpq/l;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupDialog",
        "bindChannelInfo",
        "bindChannelOptions",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "",
        "getTheme",
        "()I",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "setChannel",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
        "style",
        "setStyle",
        "(Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)V",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;",
        "channelOptionClickListener",
        "setChannelOptionClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;",
        "channelMemberClickListener",
        "setChannelMemberClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
        "Lio/getstream/chat/android/models/Channel;",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;",
        "channelActionsViewModel$delegate",
        "Ll83/h;",
        "getChannelActionsViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;",
        "channelActionsViewModel",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;",
        "membersAdapter",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;",
        "binding",
        "",
        "getCid",
        "()Ljava/lang/String;",
        "cid",
        "Companion",
        "ChannelMemberClickListener",
        "ChannelOptionClickListener",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

.field private channel:Lio/getstream/chat/android/models/Channel;

.field private final channelActionsViewModel$delegate:Ll83/h;

.field private channelMemberClickListener:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;

.field private channelOptionClickListener:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;

.field private final membersAdapter:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;

.field private style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lpq/l;-><init>()V

    new-instance v0, Lh02/n0;

    const/16 v1, 0x1b

    invoke-direct {v0, p0, v1}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$4;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v1, Landroidx/lifecycle/y1;

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channelActionsViewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;I)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->membersAdapter:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;

    return-void
.end method

.method public static A(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModelFactory;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModelFactory;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->getCid()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModelFactory;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic B(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Member;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->membersAdapter$lambda$1(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Member;)Ll83/a0;

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->setupDialog$lambda$3(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Channel;)Ll83/a0;

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->bindChannelOptions$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;Landroid/view/View;)V

    return-void
.end method

.method private final bindChannelInfo()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelMembersTextView:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    const-string v3, "channel"

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v5

    invoke-interface {v5}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-interface {v1, v2, v5}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;->formatChannelName(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelMembersInfoTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "requireContext(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    invoke-static {v1, v2, v4, v5, v4}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->getMembersStatusText$default(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v1, :cond_3

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->isDirectMessaging(Lio/getstream/chat/android/models/Channel;)Z

    move-result v1

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/UserKt;->isCurrentUser(Lio/getstream/chat/android/models/User;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v0, v1

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->membersAdapter:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    return-void

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method

.method private final bindChannelOptions()V
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->optionsContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;->Companion:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;->defaultFactory(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    const-string v6, "style"

    if-eqz v5, :cond_5

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;

    invoke-virtual {v0, v1, v4, v5}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;->createChannelOptionItems(Lio/getstream/chat/android/models/Channel;Ljava/util/Set;Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    sget v5, Lio/getstream/chat/android/ui/R$layout;->stream_ui_channel_option_item:I

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v7, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->optionsContainer:Landroid/widget/LinearLayout;

    const/4 v8, 0x0

    invoke-virtual {v4, v5, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/TextView;

    invoke-interface {v1}, Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;->isDestructive()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getWarningItemTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v5

    goto :goto_1

    :cond_0
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_1
    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getItemTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v5

    :goto_1
    invoke-interface {v1}, Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;->getLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;->getIcon()I

    move-result v8

    invoke-static {v7, v8}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle;->getColor()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_2

    :cond_2
    move-object v7, v3

    :goto_2
    invoke-static {v4, v7}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    new-instance v7, Lb13/a;

    const/4 v8, 0x2

    invoke-direct {v7, v8, p0, v1}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->optionsContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_3
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_4
    return-void

    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    const-string v0, "channel"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private static final bindChannelOptions$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;Landroid/view/View;)V
    .locals 0

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channelOptionClickListener:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;->onChannelOptionClick(Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;)V

    :cond_0
    invoke-virtual {p0}, Lpq/l;->dismiss()V

    return-void
.end method

.method private static final channelActionsViewModel_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;)Landroidx/lifecycle/a2;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModelFactory;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->getCid()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModelFactory;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getChannelActionsViewModel()Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channelActionsViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;

    return-object v0
.end method

.method private final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "channel"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final membersAdapter$lambda$1(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Member;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channelMemberClickListener:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;->onMemberClick(Lio/getstream/chat/android/models/Member;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setupDialog()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->membersAdapter:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelActionsContainer:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    const/4 v2, 0x0

    const-string v3, "style"

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelMembersTextView:Landroid/widget/TextView;

    const-string v1, "channelMembersTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getMemberNamesTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelMembersInfoTextView:Landroid/widget/TextView;

    const-string v1, "channelMembersInfoTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getMemberInfoTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->getChannelActionsViewModel()Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->getChannel()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;I)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private static final setupDialog$lambda$3(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/models/Channel;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->bindChannelInfo()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->bindChannelOptions()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final getTheme()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/R$style;->StreamUiBottomSheetDialogTheme:I

    return v0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    const-string p3, "requireContext(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p2, :cond_1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->setupDialog()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lpq/l;->dismiss()V

    return-void
.end method

.method public final setChannel(Lio/getstream/chat/android/models/Channel;)V
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channel:Lio/getstream/chat/android/models/Channel;

    return-void
.end method

.method public final setChannelMemberClickListener(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;)V
    .locals 1

    const-string v0, "channelMemberClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channelMemberClickListener:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;

    return-void
.end method

.method public final setChannelOptionClickListener(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;)V
    .locals 1

    const-string v0, "channelOptionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->channelOptionClickListener:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;

    return-void
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->style:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    return-void
.end method
