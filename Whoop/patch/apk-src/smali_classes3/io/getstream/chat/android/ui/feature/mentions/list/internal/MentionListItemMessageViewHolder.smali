.class public final Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;
.super Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0011R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;",
        "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "style",
        "Landroid/view/ViewGroup;",
        "parentView",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;",
        "clickListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V",
        "item",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
        "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;",
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

.field private final clickListener:Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;

.field private message:Lio/getstream/chat/android/models/Message;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V
    .locals 1

    const-string v0, "parentView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "binding"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object p2

    const-string v0, "getRoot(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    .line 7
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->clickListener:Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->styleView(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V

    .line 9
    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance p2, Lb30/k3;

    const/16 p3, 0xd

    invoke-direct {p2, p0, p3}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 1
    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p3

    const/4 p5, 0x0

    .line 2
    invoke-static {p3, p2, p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    move-result-object p3

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;-><init>(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->clickListener:Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;

    if-eqz p1, :cond_1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->message:Lio/getstream/chat/android/models/Message;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;->onMentionSelected(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_0
    const-string p0, "message"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;->getMessage()Lio/getstream/chat/android/ui/common/model/MessageResult;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->message:Lio/getstream/chat/android/models/Message;

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;->getMessage()Lio/getstream/chat/android/ui/common/model/MessageResult;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->renderMessageResult(Lio/getstream/chat/android/ui/common/model/MessageResult;)V

    return-void
.end method

.method public final bridge synthetic bind(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->bind(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;)V

    return-void
.end method
