.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UserVoteViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;",
        "binding",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;)V",
        "Lio/getstream/chat/android/models/Vote;",
        "vote",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/models/Vote;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    return-void
.end method

.method private static final bind$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->name:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v0, "userAvatarView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/Vote;)V
    .locals 5

    const-string v0, "vote"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Vote;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->name:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v0, v4, v2, v3}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->date:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Vote;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    invoke-interface {v1, v2}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatRelativeDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->time:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Vote;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    invoke-interface {v1, p1}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
