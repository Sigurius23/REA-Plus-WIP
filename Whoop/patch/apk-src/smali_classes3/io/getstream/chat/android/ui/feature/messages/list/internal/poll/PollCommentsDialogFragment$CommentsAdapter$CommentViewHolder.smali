.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CommentViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;",
        "binding",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;",
        "item",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;)V
    .locals 6

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->getAnswer()Lio/getstream/chat/android/models/Answer;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->answerText:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Answer;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Answer;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;->getShowUser()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string p1, "userAvatarView"

    if-eqz v1, :cond_1

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->name:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, v1, v5, v4, v2}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->name:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x4

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->date:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Answer;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    invoke-interface {v1, v2}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatRelativeDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->time:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Answer;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    invoke-interface {v1, v0}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
