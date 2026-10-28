.class public final Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MessagePreviewViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "messageResult",
        "Ll83/a0;",
        "bind$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/common/model/MessageResult;)V",
        "bind",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

.field private message:Lio/getstream/chat/android/models/Message;

.field private final style:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
            "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->this$0:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object v0

    new-instance v1, Lb13/a;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p1, p0}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object p1

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getMessagePreviewStyle()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->styleView(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object p1

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->contentRoot:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v0, "contentRoot"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    if-eqz v0, :cond_4

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemHeight()I

    move-result v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v0, "userAvatarView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v0, :cond_3

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemMarginStart()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->senderNameLabel:Landroid/widget/TextView;

    const-string v0, "senderNameLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemTitleMarginStart()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemMarginEnd()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->messageTimeLabel:Landroid/widget/TextView;

    const-string v0, "messageTimeLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemMarginEnd()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->spacer:Landroid/view/View;

    const-string v0, "spacer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemVerticalSpacerHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->guideline:Landroidx/constraintlayout/widget/Guideline;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemVerticalSpacerPosition()F

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/widget/Guideline;->setGuidelinePercent(F)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->access$getSearchResultSelectedListener$p(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;)Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;

    move-result-object p0

    if-eqz p0, :cond_1

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->message:Lio/getstream/chat/android/models/Message;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;->onSearchResultSelected(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_0
    const-string p0, "message"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final bind$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/common/model/MessageResult;)V
    .locals 1

    const-string v0, "messageResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->message:Lio/getstream/chat/android/models/Message;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->renderMessageResult(Lio/getstream/chat/android/ui/common/model/MessageResult;)V

    return-void
.end method
