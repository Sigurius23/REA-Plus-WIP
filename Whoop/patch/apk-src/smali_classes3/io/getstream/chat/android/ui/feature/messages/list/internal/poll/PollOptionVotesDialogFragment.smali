.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;
.super Lm/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0000\u0018\u0000 E2\u00020\u0001:\u0003EFGB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u000f\u0010\u000c\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0003R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001b\u0010+\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010 \u001a\u0004\u0008)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010 \u001a\u0004\u0008.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010 \u001a\u0004\u00083\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010>\u001a\u00020$8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0014\u0010D\u001a\u00020?8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010A\u00a8\u0006H"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;",
        "Lm/d0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupEdgeToEdge",
        "Landroidx/appcompat/widget/Toolbar;",
        "toolbar",
        "setupToolbar",
        "(Landroidx/appcompat/widget/Toolbar;)V",
        "setupVotesList",
        "observeState",
        "observeEvents",
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
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;",
        "Lio/getstream/chat/android/models/Poll;",
        "poll$delegate",
        "getPoll",
        "()Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Lio/getstream/chat/android/models/Option;",
        "option$delegate",
        "getOption",
        "()Lio/getstream/chat/android/models/Option;",
        "option",
        "Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;",
        "viewModel$delegate",
        "getViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;",
        "viewModel",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;",
        "votesAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "scrollListener",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;",
        "binding",
        "",
        "getPollId",
        "()Ljava/lang/String;",
        "pollId",
        "getOptionId",
        "optionId",
        "Companion",
        "PollOptionVotesListItem",
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
.field private static final ARG_OPTION:Ljava/lang/String; = "arg_option"

.field private static final ARG_POLL:Ljava/lang/String; = "arg_poll"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;

.field private static final LOAD_MORE_THRESHOLD:I = 0x3

.field public static final TAG:Ljava/lang/String; = "PollOptionVotesDialogFragment"

.field private static final VIEW_TYPE_HEADER:I = 0x0

.field private static final VIEW_TYPE_VOTE:I = 0x1

.field private static final options:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Option;",
            ">;"
        }
    .end annotation
.end field

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
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

.field private final logger$delegate:Ll83/h;

.field private final option$delegate:Ll83/h;

.field private final poll$delegate:Ll83/h;

.field private final scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

.field private final viewModel$delegate:Ll83/h;

.field private final votesAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->polls:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->options:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/d0;-><init>()V

    const-string v0, "Chat:PollOptionVotesDialogFragment"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->logger$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->poll$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->option$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;I)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$4;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v1, Landroidx/lifecycle/y1;

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->viewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->votesAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;

    new-instance v0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;I)V

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;-><init>(ILc93/a;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->poll_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->observeEvents$lambda$10(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;)Ll83/a0;

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel$Factory;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->viewModel_delegate$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Landroidx/lifecycle/a2;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel$Factory;

    return-object p0
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->observeState$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;)Ll83/a0;

    return-void
.end method

.method public static synthetic E(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->scrollListener$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$getOptions$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->options:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic access$getPolls$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->polls:Ljava/util/Map;

    return-object v0
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getOption()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->option$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method private final getOptionId()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg_option"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Option ID not found in arguments"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getPoll()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->poll$delegate:Ll83/h;

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

.method private final getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->viewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;

    return-object v0
.end method

.method private final observeEvents()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->getEvents()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;I)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final observeEvents$lambda$10(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;)Ll83/a0;
    .locals 5

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent$LoadError;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent$LoadError;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent$LoadError;->getError()Ln23/e;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[observeEvents] error loading poll option results: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v3, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget p1, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_option_results_error:I

    invoke-virtual {p0, p1}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private final observeState()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->getState()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;I)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final observeState$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;)Ll83/a0;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Option;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->voteList:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "voteList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->loadingContainer:Landroid/widget/FrameLayout;

    const-string v1, "loadingContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading()Z

    move-result v1

    const/16 v3, 0x8

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->loadingMoreProgress:Landroid/widget/ProgressBar;

    const-string v1, "loadingMoreProgress"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isWinner()Z

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->getVoteCount()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;-><init>(ZI)V

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->getResults()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Vote;

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;

    invoke-direct {v4, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;-><init>(Lio/getstream/chat/android/models/Vote;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v2}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->votesAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoading()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->isLoadingMore()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;->getCanLoadMore()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->enablePagination()V

    goto :goto_4

    :cond_4
    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->disablePagination()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final option_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Lio/getstream/chat/android/models/Option;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->options:Ljava/util/Map;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getOptionId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Option;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getOptionId()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Option not found for ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final poll_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Lio/getstream/chat/android/models/Poll;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->polls:Ljava/util/Map;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getPollId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getPollId()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Poll not found for ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final scrollListener$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction$LoadMoreRequested;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction$LoadMoreRequested;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;->onViewAction(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setupEdgeToEdge()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

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

    const/16 v1, 0x17

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
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Option;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final setupToolbar$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private final setupVotesList()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->voteList:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->votesAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->voteList:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    return-void
.end method

.method private static final viewModel_delegate$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Landroidx/lifecycle/a2;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel$Factory;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel$Factory;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V

    return-object v0
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Lio/getstream/chat/android/models/Option;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->option_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;)Lio/getstream/chat/android/models/Option;

    move-result-object p0

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

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

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
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->polls:Ljava/util/Map;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getPollId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->options:Ljava/util/Map;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->getOptionId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->setupEdgeToEdge()V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    const-string p2, "toolbar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->setupToolbar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->setupVotesList()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->observeState()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->observeEvents()V

    return-void
.end method
