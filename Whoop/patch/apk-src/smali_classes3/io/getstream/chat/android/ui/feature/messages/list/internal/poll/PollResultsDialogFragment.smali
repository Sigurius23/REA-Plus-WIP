.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;
.super Lm/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u0000 82\u00020\u0001:\u000389:B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0003R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010%\u001a\u0004\u0008+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00103\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u00106\u00a8\u0006;"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;",
        "Lm/d0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupEdgeToEdge",
        "Landroidx/appcompat/widget/Toolbar;",
        "toolbar",
        "setupToolbar",
        "(Landroidx/appcompat/widget/Toolbar;)V",
        "observeState",
        "Lio/getstream/chat/android/models/Option;",
        "option",
        "onShowAllVotesClick",
        "(Lio/getstream/chat/android/models/Option;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "",
        "getTheme",
        "()I",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "onDestroy",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;",
        "Lio/getstream/chat/android/models/Poll;",
        "poll$delegate",
        "Ll83/h;",
        "getPoll",
        "()Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;",
        "viewModel$delegate",
        "getViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;",
        "viewModel",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;",
        "resultsAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;",
        "binding",
        "",
        "getPollId",
        "()Ljava/lang/String;",
        "pollId",
        "Companion",
        "ResultsAdapter",
        "UserVoteAdapter",
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
.field private static final ARG_POLL:Ljava/lang/String; = "arg_poll"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "PollResultsDialogFragment"

.field private static final polls:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Poll;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

.field private final poll$delegate:Ll83/h;

.field private final resultsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;

.field private final viewModel$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$Companion;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->polls:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/d0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->poll$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/g;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;I)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$4;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v1, Landroidx/lifecycle/y1;

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->viewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$resultsAdapter$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$resultsAdapter$1;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->resultsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->poll_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method public static B(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;-><init>(Lio/getstream/chat/android/models/Poll;)V

    return-object v0
.end method

.method public static final synthetic access$getPolls$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->polls:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic access$onShowAllVotesClick(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;Lio/getstream/chat/android/models/Option;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->onShowAllVotesClick(Lio/getstream/chat/android/models/Option;)V

    return-void
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getPoll()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->poll$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method

.method private final getPollId()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg_poll"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Poll ID not found in arguments"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->viewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;

    return-object v0
.end method

.method private final observeState()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;->getState()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    new-instance v2, Lhb2/c;

    const/16 v3, 0x1b

    invoke-direct {v2, p0, v3}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final observeState$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;->question:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;->getPollName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->resultsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;->getResults()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;->loadingContainer:Landroid/widget/FrameLayout;

    const-string p1, "loadingContainer"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final onShowAllVotesClick(Lio/getstream/chat/android/models/Option;)V
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;->newInstance(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "PollOptionVotesDialogFragment"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    return-void
.end method

.method private static final poll_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;)Lio/getstream/chat/android/models/Poll;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->polls:Ljava/util/Map;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->getPollId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->getPollId()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Poll not found for ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final setupEdgeToEdge()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    return-void
.end method

.method private final setupToolbar(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    new-instance v0, Lb30/k3;

    const/16 v1, 0x18

    invoke-direct {v0, p0, v1}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_arrow_left:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_results_title:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final setupToolbar$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private static final viewModel_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;)Landroidx/lifecycle/a2;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;-><init>(Lio/getstream/chat/android/models/Poll;)V

    return-object v0
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->observeState$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;)Ll83/a0;

    return-void
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

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->polls:Ljava/util/Map;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->getPollId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->setupEdgeToEdge()V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    const-string p2, "toolbar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->setupToolbar(Landroidx/appcompat/widget/Toolbar;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;->optionList:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->resultsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->observeState()V

    return-void
.end method
