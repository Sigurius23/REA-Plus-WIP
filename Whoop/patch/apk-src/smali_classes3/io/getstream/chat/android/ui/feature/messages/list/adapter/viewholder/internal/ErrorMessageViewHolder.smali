.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0011R\u001a\u0010\u0008\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "Landroid/view/ViewGroup;",
        "parent",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;)V",
        "data",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "Ll83/a0;",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;",
        "getBinding$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "style"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;->getRoot()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;-><init>(Landroid/view/View;)V

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p3

    const/4 p4, 0x0

    .line 2
    invoke-static {p3, p1, p4}, Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;

    move-result-object p3

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;)V

    return-void
.end method


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->getSyncStatus()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getTranslatedText$default(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/helper/CurrentUserProvider;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    :cond_2
    :goto_0
    if-nez v0, :cond_3

    .line 5
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_error_blocked_by_moderation:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string p1, "getString(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;->messageTextView:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;->messageTextView:Landroid/widget/TextView;

    const-string p2, "messageTextView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleErrorMessage()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;

    return-object v0
.end method
