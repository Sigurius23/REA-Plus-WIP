.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010)\u00a8\u0006,"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "bindTitle",
        "(Lio/getstream/chat/android/models/Message;)V",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "bindReactionList",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)V",
        "setMessage",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;",
        "userReactionClickListener",
        "setOnUserReactionClickListener$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;)V",
        "setOnUserReactionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "messageListViewStyle",
        "configure$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V",
        "configure",
        "Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;",
        "userReactionsAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "gridLayoutManager",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;",
        "Companion",
        "UserReactionClickListener",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$Companion;

.field private static final MAX_COLUMNS_COUNT:I = 0x4


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

.field private final gridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

.field private userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;

.field private final userReactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;

    new-instance p3, Lhn/p;

    const/16 v0, 0xa

    invoke-direct {p3, p0, v0}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->userReactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;

    .line 7
    iget-object p3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    .line 8
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->gridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->userReactionsAdapter$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V

    return-void
.end method

.method private final bindReactionList(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)V
    .locals 7

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getSupportedLatestReactions(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getSupportedReactions()Lio/getstream/chat/android/ui/helper/SupportedReactions;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/ui/helper/SupportedReactions;->getReactionDrawable(Ljava/lang/String;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object v3

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    invoke-direct {v4, v2, v1, v5, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_0

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->gridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x4

    if-le p2, v1, :cond_3

    move p2, v1

    :cond_3
    const/4 v1, 0x1

    if-ge p2, v1, :cond_4

    move p2, v1

    :cond_4
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->y(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->userReactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    return-void
.end method

.method private final bindTitle(Lio/getstream/chat/android/models/Message;)V
    .locals 4

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getSupportedLatestReactions(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->userReactionsTitleTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$plurals;->stream_ui_message_list_message_reactions:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, p1, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final userReactionsAdapter$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->getReaction()Lio/getstream/chat/android/models/Reaction;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;->onUserReactionClick(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final configure$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V
    .locals 2

    const-string v0, "messageListViewStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->userReactionsContainer:Landroidx/cardview/widget/CardView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getUserReactionsBackgroundColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->userReactionsTitleTextView:Landroid/widget/TextView;

    const-string v1, "userReactionsTitleTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getUserReactionsTitleText()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->userReactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getMessageOptionsUserReactionAlignment()I

    move-result p1

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignmentKt;->getUserReactionAlignment(I)Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;->setMessageOptionsUserReactionAlignment(Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V

    return-void
.end method

.method public final setMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->bindTitle(Lio/getstream/chat/android/models/Message;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->bindReactionList(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method public final setOnUserReactionClickListener$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;)V
    .locals 1

    const-string v0, "userReactionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;

    return-void
.end method
