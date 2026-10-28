.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;
.super Lm/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 :2\u00020\u0001:\u0002:;B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010&\u001a\u0004\u0008,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u0010&\u001a\u0004\u00081\u00102R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00109\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u00108\u00a8\u0006<"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;",
        "Lm/d0;",
        "<init>",
        "()V",
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
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;",
        "createPollDialogListener",
        "setCreatePollDialogListener",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;",
        "applyFeatureDefaults",
        "applyFeatureVisibility",
        "setupDialog",
        "Landroidx/appcompat/widget/Toolbar;",
        "toolbar",
        "setupToolbar",
        "(Landroidx/appcompat/widget/Toolbar;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;",
        "createPollViewModel$delegate",
        "Ll83/h;",
        "getCreatePollViewModel",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;",
        "createPollViewModel",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;",
        "pollsConfig$delegate",
        "getPollsConfig",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;",
        "pollsConfig",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;",
        "optionsAdapter$delegate",
        "getOptionsAdapter",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;",
        "optionsAdapter",
        "Landroid/view/MenuItem;",
        "sendMenuItem",
        "Landroid/view/MenuItem;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;",
        "binding",
        "Companion",
        "CreatePollDialogListener",
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
.field private static final ARG_POLLS_CONFIG:Ljava/lang/String; = "arg_polls_config"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "create_poll_dialog_fragment"


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

.field private createPollDialogListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;

.field private final createPollViewModel$delegate:Ll83/h;

.field private final optionsAdapter$delegate:Ll83/h;

.field private final pollsConfig$delegate:Ll83/h;

.field private sendMenuItem:Landroid/view/MenuItem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lm/d0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const-class v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$4;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$5;

    invoke-direct {v4, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/m0;Ll83/h;)V

    new-instance v0, Landroidx/lifecycle/y1;

    invoke-direct {v0, v1, v2, v4, v3}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->createPollViewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->pollsConfig$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->optionsAdapter$delegate:Ll83/h;

    return-void
.end method

.method public static A(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAllowAnswers(Z)V

    return-void
.end method

.method public static B(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAnnonymousPoll(Z)V

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/MenuItem;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->setupToolbar$lambda$14(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/MenuItem;)Z

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->setupDialog$lambda$5(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static E(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setSuggestAnOption(Z)V

    return-void
.end method

.method public static synthetic F(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->setupToolbar$lambda$12(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static G(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->createOption()V

    return-void
.end method

.method public static synthetic H(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;ILjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->optionsAdapter_delegate$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;ILjava/lang/String;)Ll83/a0;

    return-void
.end method

.method public static synthetic I(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->pollsConfig_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object p0

    return-object p0
.end method

.method public static final access$getBinding(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final synthetic access$getCreatePollDialogListener$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->createPollDialogListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;

    return-object p0
.end method

.method public static final synthetic access$getCreatePollViewModel(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOptionsAdapter(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getOptionsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSendMenuItem$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Landroid/view/MenuItem;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->sendMenuItem:Landroid/view/MenuItem;

    return-object p0
.end method

.method public static final access$setCreatePollDialogListener(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->createPollDialogListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;

    return-object p0
.end method

.method private final applyFeatureDefaults()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getMultipleVotes()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAllowMultipleVotes(Z)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getMultipleVotes()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getMultipleVotes()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAnonymousPoll()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAnnonymousPoll(Z)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAnonymousPoll()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->anonymousPollSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAnonymousPoll()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getSuggestAnOption()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setSuggestAnOption(Z)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getSuggestAnOption()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->suggestAnOptionSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getSuggestAnOption()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :cond_2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAllowComments()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAllowAnswers(Z)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAllowComments()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addACommentLabelSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAllowComments()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getDefaultValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :cond_3
    return-void
.end method

.method private final applyFeatureVisibility()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersLabel:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v1, "multipleAnswersLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getMultipleVotes()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    const-string v1, "multipleAnswersSwitch"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getMultipleVotes()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersCount:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v1, "multipleAnswersCount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getMultipleVotes()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    if-eqz v1, :cond_3

    move v1, v3

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->anonymousPollLabel:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v1, "anonymousPollLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAnonymousPoll()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_4

    :cond_4
    move v1, v2

    :goto_4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->anonymousPollSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    const-string v1, "anonymousPollSwitch"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAnonymousPoll()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_5

    :cond_5
    move v1, v2

    :goto_5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->suggestAnOptionLabel:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v1, "suggestAnOptionLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getSuggestAnOption()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_6

    move v1, v3

    goto :goto_6

    :cond_6
    move v1, v2

    :goto_6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->suggestAnOptionSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    const-string v1, "suggestAnOptionSwitch"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getSuggestAnOption()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_7

    move v1, v3

    goto :goto_7

    :cond_7
    move v1, v2

    :goto_7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addACommentLabel:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v1, "addACommentLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAllowComments()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_8

    move v1, v3

    goto :goto_8

    :cond_8
    move v1, v2

    :goto_8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addACommentLabelSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    const-string v1, "addACommentLabelSwitch"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getAllowComments()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->getConfigurable()Z

    move-result v1

    if-eqz v1, :cond_9

    move v2, v3

    :cond_9
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->createPollViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    return-object v0
.end method

.method private final getOptionsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->optionsAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;

    return-object v0
.end method

.method private final getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->pollsConfig$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    return-object v0
.end method

.method private static final optionsAdapter_delegate$lambda$3(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getOptionTextLimit()Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lhb2/f;

    const/16 v3, 0xe

    invoke-direct {v2, p0, v3}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;-><init>(Ljava/lang/Integer;Lc93/m;)V

    return-object v0
.end method

.method private static final optionsAdapter_delegate$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;ILjava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->onOptionTextChanged(ILjava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final pollsConfig_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "arg_polls_config"

    const-class v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    invoke-static {p0, v1, v0}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object p0

    return-object p0
.end method

.method private final setCreatePollDialogListener(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->createPollDialogListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;

    return-object p0
.end method

.method private final setupDialog()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    const-string v1, "toolbar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->setupToolbar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->getQuestionTextLimit()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->question:Landroidx/appcompat/widget/AppCompatEditText;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    filled-new-array {v2}, [Landroid/text/InputFilter$LengthFilter;

    move-result-object v0

    check-cast v0, [Landroid/text/InputFilter;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->question:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v1, "question"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$$inlined$addTextChangedListener$default$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$$inlined$addTextChangedListener$default$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->anonymousPollSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->suggestAnOptionSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addACommentLabelSwitch:Lcom/google/android/material/switchmaterial/SwitchMaterial;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->addOption:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->optionList:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getOptionsAdapter()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersCount:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v1, "multipleAnswersCount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$$inlined$addTextChangedListener$default$2;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$$inlined$addTextChangedListener$default$2;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$9;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$9;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$10;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$10;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Lq83/d;)V

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$11;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$11;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Lq83/d;)V

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$12;

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$setupDialog$12;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Lq83/d;)V

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private static final setupDialog$lambda$10(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->createOption()V

    return-void
.end method

.method private static final setupDialog$lambda$5(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersCount:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v0, "multipleAnswersCount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAllowMultipleVotes(Z)V

    if-eqz p2, :cond_1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->multipleAnswersCount:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    :cond_1
    return-void
.end method

.method private static final setupDialog$lambda$7(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAnnonymousPoll(Z)V

    return-void
.end method

.method private static final setupDialog$lambda$8(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setSuggestAnOption(Z)V

    return-void
.end method

.method private static final setupDialog$lambda$9(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->setAllowAnswers(Z)V

    return-void
.end method

.method private final setupToolbar(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;I)V

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
    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_create_a_poll_title:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    sget v0, Lio/getstream/chat/android/ui/R$menu;->stream_ui_create_poll_menu:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->t(I)V

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    sget v0, Lio/getstream/chat/android/ui/R$id;->action_create_poll:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    const-string v0, "findItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->sendMenuItem:Landroid/view/MenuItem;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    return-void
.end method

.method private static final setupToolbar$lambda$12(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->createPollDialogListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;->onDismiss()V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private static final setupToolbar$lambda$14(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;Landroid/view/MenuItem;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->getCreatePollViewModel()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->createPollConfig()V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->optionsAdapter_delegate$lambda$3(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;

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

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->createPollDialogListener:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->setupDialog()V

    if-nez p2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->applyFeatureDefaults()V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;->applyFeatureVisibility()V

    return-void
.end method
