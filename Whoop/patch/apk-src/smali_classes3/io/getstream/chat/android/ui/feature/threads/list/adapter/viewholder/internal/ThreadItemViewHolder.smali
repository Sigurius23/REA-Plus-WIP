.class public final Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;
.super Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 %2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\r2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;",
        "Landroid/view/ViewGroup;",
        "parentView",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;",
        "clickListener",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;)V",
        "Ll83/a0;",
        "applyStyle",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "bindThreadTitle",
        "(Lio/getstream/chat/android/models/User;)V",
        "bindReplyTo",
        "()V",
        "bindUnreadCountBadge",
        "bindLatestReply",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "",
        "formatMessage",
        "(Lio/getstream/chat/android/models/Message;)Ljava/lang/CharSequence;",
        "item",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;)V",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;",
        "Lio/getstream/chat/android/models/Thread;",
        "thread",
        "Lio/getstream/chat/android/models/Thread;",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder$Companion;

.field private static final MAX_UNREAD_COUNT:I = 0x63


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

.field private final clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

.field private thread:Lio/getstream/chat/android/models/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;)V
    .locals 1

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "style"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p4}, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;-><init>(Landroid/view/View;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    .line 7
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->applyStyle(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V

    .line 8
    invoke-virtual {p4}, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    new-instance p2, Lb30/k3;

    const/16 p3, 0x1b

    invoke-direct {p2, p0, p3}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p4

    const/4 p5, 0x0

    .line 2
    invoke-static {p4, p1, p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    move-result-object p4

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

    if-eqz p1, :cond_1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->thread:Lio/getstream/chat/android/models/Thread;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;->onThreadClick(Lio/getstream/chat/android/models/Thread;)V

    return-void

    :cond_0
    const-string p0, "thread"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private final applyStyle(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->threadImage:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getThreadIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->threadTitleTextView:Landroid/widget/TextView;

    const-string v1, "threadTitleTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getThreadTitleStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->replyToTextView:Landroid/widget/TextView;

    const-string v1, "replyToTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getThreadReplyToStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getLatestReplyStyle()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->styleView(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->unreadCountBadge:Landroid/widget/TextView;

    const-string v1, "unreadCountBadge"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getUnreadCountBadgeTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->unreadCountBadge:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getUnreadCountBadgeBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final bindLatestReply()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->thread:Lio/getstream/chat/android/models/Thread;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    const-string v2, "latestReplyMessageView"

    if-eqz v0, :cond_0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object v3

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v6, v5, v1}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object v3

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->senderNameLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    invoke-static {v4, v1, v6, v5, v1}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->bold$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object v1

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->messageLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->formatMessage(Lio/getstream/chat/android/models/Message;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object v1

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->messageTimeLabel:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v3

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->latestReplyMessageView:Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const-string v0, "thread"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final bindReplyTo()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_thread_list_replied_to:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->thread:Lio/getstream/chat/android/models/Thread;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->formatMessage(Lio/getstream/chat/android/models/Message;)Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->replyToTextView:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string v0, "thread"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final bindThreadTitle(Lio/getstream/chat/android/models/User;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->thread:Lio/getstream/chat/android/models/Thread;

    const/4 v1, 0x0

    const-string v2, "thread"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Thread;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;->formatChannelName(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->thread:Lio/getstream/chat/android/models/Thread;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Thread;->getTitle()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->threadTitleTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final bindUnreadCountBadge(Lio/getstream/chat/android/models/User;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->thread:Lio/getstream/chat/android/models/Thread;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Thread;->getRead()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v1, v2

    :cond_2
    check-cast v1, Lio/getstream/chat/android/models/ChannelUserRead;

    const/4 p1, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v0

    goto :goto_1

    :cond_3
    move v0, p1

    :goto_1
    const-string v1, "unreadCountBadge"

    if-lez v0, :cond_5

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->unreadCountBadge:Landroid/widget/TextView;

    const/16 v3, 0x63

    if-le v0, v3, :cond_4

    const-string v0, "99+"

    goto :goto_2

    :cond_4
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->unreadCountBadge:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;->unreadCountBadge:Landroid/widget/TextView;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_6
    const-string p1, "thread"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final formatMessage(Lio/getstream/chat/android/models/Message;)Ljava/lang/CharSequence;
    .locals 7

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->hasAudioRecording(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_audio_reply_info:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-static {p1, v2, v1, v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->italicize$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getAttachmentsText(Lio/getstream/chat/android/models/Message;)Landroid/text/SpannableString;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {p1, v2, v3, v2}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getTranslatedText$default(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/helper/CurrentUserProvider;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/CharSequence;

    aput-object p1, v2, v1

    aput-object v0, v2, v3

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    const/4 v5, 0x0

    const/16 v6, 0x7c

    const-string v2, " "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    return-object v1
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;->getThread()Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->thread:Lio/getstream/chat/android/models/Thread;

    .line 3
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->bindThreadTitle(Lio/getstream/chat/android/models/User;)V

    .line 5
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->bindReplyTo()V

    .line 6
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->bindUnreadCountBadge(Lio/getstream/chat/android/models/User;)V

    .line 7
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->bindLatestReply()V

    return-void
.end method

.method public final bridge synthetic bind(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->bind(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;)V

    return-void
.end method
