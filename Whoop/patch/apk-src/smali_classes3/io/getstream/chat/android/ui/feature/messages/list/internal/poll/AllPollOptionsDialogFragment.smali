.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;
.super Lm/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 &2\u00020\u0001:\u0003&\'(B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0003R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0014\u0010%\u001a\u00020\u001a8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;",
        "Lm/d0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupDialog",
        "Landroidx/appcompat/widget/Toolbar;",
        "toolbar",
        "setupToolbar",
        "(Landroidx/appcompat/widget/Toolbar;)V",
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
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;",
        "viewModel$delegate",
        "Ll83/h;",
        "getViewModel",
        "()Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;",
        "viewModel",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;",
        "binding",
        "Companion",
        "OptionsAdapter",
        "AllPollOptionsViewModel",
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
.field private static final ARG_CHANNEL_ID:Ljava/lang/String; = "channel_id"

.field private static final ARG_CHANNEL_TYPE:Ljava/lang/String; = "channel_type"

.field private static final ARG_MESSAGE_ID:Ljava/lang/String; = "message_id"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "create_all_poll_options_dialog"


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

.field private final viewModel$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/d0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$4;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v1, Landroidx/lifecycle/y1;

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->viewModel$delegate:Ll83/h;

    return-void
.end method

.method public static final access$getBinding(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getViewModel()Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->viewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;

    return-object v0
.end method

.method private final setupDialog()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    const-string v1, "toolbar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->setupToolbar(Landroidx/appcompat/widget/Toolbar;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter;

    new-instance v1, Lhb2/c;

    const/16 v2, 0x1a

    invoke-direct {v1, p0, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter;-><init>(Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;->optionList:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$setupDialog$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$setupDialog$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v3, v3, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private static final setupDialog$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;Lio/getstream/chat/android/models/Option;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->onOptionClick(Lio/getstream/chat/android/models/Option;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setupToolbar(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    new-instance v0, Lb30/k3;

    const/16 v1, 0x15

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
    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_options_title:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final setupToolbar$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private static final viewModel_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;)Landroidx/lifecycle/a2;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;)V

    return-object v0
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;Lio/getstream/chat/android/models/Option;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->setupDialog$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;Lio/getstream/chat/android/models/Option;)Ll83/a0;

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

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x7

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;->setupDialog()V

    return-void
.end method
