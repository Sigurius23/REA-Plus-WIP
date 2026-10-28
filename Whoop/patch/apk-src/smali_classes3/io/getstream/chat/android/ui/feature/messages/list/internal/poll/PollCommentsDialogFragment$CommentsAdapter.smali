.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CommentsAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentDiffCallback;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;",
        "<init>",
        "()V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;I)V",
        "CommentDiffCallback",
        "CommentViewHolder",
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


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;

    move-result-object p1

    .line 4
    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;)V

    return-object p2
.end method
