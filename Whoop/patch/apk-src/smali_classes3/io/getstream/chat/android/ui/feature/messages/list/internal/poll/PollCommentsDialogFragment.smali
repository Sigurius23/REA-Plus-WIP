.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;
.super Lm/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0000\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\'\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R\u0014\u0010-\u001a\u00020(8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010*\u00a8\u00061"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;",
        "Lm/d0;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Ll83/a0;",
        "render",
        "(Lio/getstream/chat/android/models/Poll;)V",
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
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;",
        "viewModel$delegate",
        "Ll83/h;",
        "getViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;",
        "viewModel",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;",
        "commentsAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;",
        "binding",
        "",
        "getCid",
        "()Ljava/lang/String;",
        "cid",
        "getMessageId",
        "messageId",
        "Companion",
        "CommentItem",
        "CommentsAdapter",
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
.field private static final ARG_CID:Ljava/lang/String; = "arg_cid"

.field private static final ARG_MESSAGE_ID:Ljava/lang/String; = "arg_message_id"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "PollCommentsDialogFragment"


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

.field private final commentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;

.field private final viewModel$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/d0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$4;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v1, Landroidx/lifecycle/y1;

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->viewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->commentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Answer;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->render$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Answer;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$render(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->render(Lio/getstream/chat/android/models/Poll;)V

    return-void
.end method

.method private final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getCid()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg_cid"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Channel cid not found in arguments"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getMessageId()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg_message_id"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Message ID not found in arguments"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->viewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;

    return-object v0
.end method

.method private static final onViewCreated$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-void
.end method

.method private final render(Lio/getstream/chat/android/models/Poll;)V
    .locals 7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getVotingVisibility()Lio/getstream/chat/android/models/VotingVisibility;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/models/VotingVisibility;->PUBLIC:Lio/getstream/chat/android/models/VotingVisibility;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->commentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Answer;

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;

    invoke-direct {v6, v5, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;-><init>(Lio/getstream/chat/android/models/Answer;Z)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->ctaContainer:Landroid/widget/FrameLayout;

    const-string v1, "ctaContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0x8

    :goto_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Answer;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Answer;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_5
    move-object v4, v1

    :goto_3
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v1, v3

    :cond_6
    check-cast v1, Lio/getstream/chat/android/models/Answer;

    :cond_7
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->ctaButton:Landroidx/appcompat/widget/AppCompatTextView;

    if-nez v1, :cond_8

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_add_a_comment_label:I

    goto :goto_4

    :cond_8
    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_update_comment_label:I

    :goto_4
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->ctaButton:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final render$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Answer;Landroid/view/View;)V
    .locals 1

    sget-object p3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Answer;->getText()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p3, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AddPollCommentDialogFragment;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p0

    const-string p2, "AddPollCommentDialogFragment"

    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    return-void
.end method

.method private static final viewModel_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;)Landroidx/lifecycle/a2;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$Factory;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->getMessageId()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$Factory;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$Factory;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->viewModel_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;)Landroidx/lifecycle/a2;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$Factory;

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

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x7

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    new-instance p2, Lb30/k3;

    const/16 v0, 0x16

    invoke-direct {p2, p0, v0}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;->commentList:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->commentsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->getViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;->getPoll()Landroidx/lifecycle/p0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p2

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$onViewCreated$2;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$onViewCreated$2;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method
