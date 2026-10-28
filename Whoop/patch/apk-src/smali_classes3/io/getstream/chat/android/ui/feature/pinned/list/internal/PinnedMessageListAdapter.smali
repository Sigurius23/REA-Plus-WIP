.class public final Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$Companion;,
        Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;,
        Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$PinnedMessageLoadingMoreView;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001f !B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "Landroidx/recyclerview/widget/o2;",
        "<init>",
        "()V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Landroidx/recyclerview/widget/o2;I)V",
        "getItemViewType",
        "(I)I",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;",
        "pinnedMessageSelectedListener",
        "setPinnedMessageSelectedListener",
        "(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;)V",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "messagePreviewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "getMessagePreviewStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "setMessagePreviewStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V",
        "Companion",
        "PinnedMessageLoadingMoreView",
        "MessagePreviewViewHolder",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$Companion;

.field private static final ITEM_LOADING_MORE:I = 0x1

.field private static final ITEM_MESSAGE:I


# instance fields
.field private messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

.field private pinnedMessageSelectedListener:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->Companion:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/internal/MessageResultDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/internal/MessageResultDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    return-void
.end method

.method public static final synthetic access$getPinnedMessageSelectedListener$p(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;)Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->pinnedMessageSelectedListener:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;

    return-object p0
.end method


# virtual methods
.method public final getItemViewType(I)I
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/model/MessageResult;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v0, 0x1

    if-lez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/2addr p1, v0

    return p1
.end method

.method public final getMessagePreviewStyle()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-object v0
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/common/model/MessageResult;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->bind$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/common/model/MessageResult;)V

    :cond_0
    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_1

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->styleView(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V

    :cond_0
    new-instance p2, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;

    invoke-direct {p2, p0, p1}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;-><init>(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;)V

    return-object p2

    :cond_1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$PinnedMessageLoadingMoreView;

    invoke-direct {p2, p0, p1}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$PinnedMessageLoadingMoreView;-><init>(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V

    return-object p2
.end method

.method public final setMessagePreviewStyle(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-void
.end method

.method public final setPinnedMessageSelectedListener(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->pinnedMessageSelectedListener:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;

    return-void
.end method
