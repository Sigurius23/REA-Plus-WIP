.class public final Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MessagePreviewViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000cR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
        "binding",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;)V",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "messageResult",
        "Ll83/a0;",
        "bind$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/common/model/MessageResult;)V",
        "bind",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
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

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->this$0:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object p2

    new-instance v0, Lb13/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1, p0}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->access$getPinnedMessageSelectedListener$p(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;)Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;

    move-result-object p0

    if-eqz p0, :cond_1

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->message:Lio/getstream/chat/android/models/Message;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;->onPinnedMessageSelected(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_0
    const-string p0, "message"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final bind$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/common/model/MessageResult;)V
    .locals 1

    const-string v0, "messageResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->message:Lio/getstream/chat/android/models/Message;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;->getRoot()Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->renderMessageResult(Lio/getstream/chat/android/ui/common/model/MessageResult;)V

    return-void
.end method
