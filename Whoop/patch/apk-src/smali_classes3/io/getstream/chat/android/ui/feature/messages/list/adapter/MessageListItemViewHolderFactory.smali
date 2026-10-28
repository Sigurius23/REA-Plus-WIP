.class public Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u00062\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u001f\u0010$\u001a\u00020#2\u000e\u0010\'\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020!0&H\u0016\u00a2\u0006\u0004\u0008$\u0010(J\'\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010.\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00100\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00080\u0010/J\u001f\u00101\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00081\u0010/J\u001d\u00103\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00083\u0010/J\u001d\u00105\u001a\u0008\u0012\u0004\u0012\u0002040&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00085\u0010/J\u001d\u00107\u001a\u0008\u0012\u0004\u0012\u0002060&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00087\u0010/J\u001d\u00109\u001a\u0008\u0012\u0004\u0012\u0002080&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00089\u0010/J\u001d\u0010:\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008:\u0010/J\u001d\u0010;\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008;\u0010/J\u001d\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<0&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008=\u0010/J\u001d\u0010>\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008>\u0010/J\u001d\u0010?\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008?\u0010/J\u001d\u0010@\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008@\u0010/J%\u0010A\u001a\u0008\u0012\u0004\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008A\u0010-J\u001d\u0010B\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008B\u0010/J\u001d\u0010C\u001a\u0008\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008C\u0010/R\"\u0010E\u001a\u00020D8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR$\u0010\u000b\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n8\u0004@BX\u0084.\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010L\u001a\u0004\u0008M\u0010NR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010OR\u0016\u0010P\u001a\u00020\u00148\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0016\u0010R\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u001c\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010K\u001a\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010V\u001a\u0004\u0008W\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\u00a8\u0006_"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "listeners",
        "Ll83/a0;",
        "setListeners$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;)V",
        "setListeners",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "attachmentFactoryManager",
        "setAttachmentFactoryManager$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V",
        "setAttachmentFactoryManager",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "setMessageListItemStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "setMessageListItemStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;",
        "setReplyMessageListItemViewStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V",
        "setReplyMessageListItemViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;",
        "setGiphyViewHolderStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;)V",
        "setGiphyViewHolderStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;",
        "setAudioRecordViewStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;)V",
        "setAudioRecordViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "item",
        "",
        "getItemViewType",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "viewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I",
        "Landroid/view/ViewGroup;",
        "parentView",
        "viewType",
        "createViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "createCustomAttachmentsViewHolder",
        "(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "createGiphyAttachmentViewHolder",
        "createMediaAttachmentsViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "createPollItemViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;",
        "createUnreadSeparatorViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;",
        "createDateDividerViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;",
        "createLoadingMoreViewHolder",
        "createMessageDeletedViewHolder",
        "createPlainTextViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;",
        "createThreadSeparatorViewHolder",
        "createGiphyMessageItemViewHolder",
        "createSystemMessageItemViewHolder",
        "createErrorMessageItemViewHolder",
        "createEmptyMessageItemViewHolder",
        "createFileAttachmentsViewHolder",
        "createLinkAttachmentsViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
        "decoratorProvider",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
        "getDecoratorProvider$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
        "setDecoratorProvider$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V",
        "value",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "getAttachmentFactoryManager",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "messageReplyStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;",
        "giphyViewHolderStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;",
        "audioRecordViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "getListeners",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "textTransformer$delegate",
        "Ll83/h;",
        "getTextTransformer",
        "()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "textTransformer",
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
.field private attachmentFactoryManager:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

.field private audioRecordViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle<",
            "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;",
            ">;"
        }
    .end annotation
.end field

.field public decoratorProvider:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

.field private giphyViewHolderStyle:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

.field private listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private messageReplyStyle:Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

.field private style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

.field private final textTransformer$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->textTransformer$delegate:Ll83/h;

    return-void
.end method

.method private final createCustomAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    move-result-object v5

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final createDateDividerViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v3, :cond_0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemDateDividerBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createEmptyMessageItemViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;-><init>(Landroid/view/ViewGroup;I)V

    return-object v0
.end method

.method private final createErrorMessageItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v2, :cond_0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemErrorMessageBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createFileAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v4

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final createGiphyAttachmentViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v4

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final createGiphyMessageItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->giphyViewHolderStyle:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    if-eqz v4, :cond_0

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "giphyViewHolderStyle"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createLinkAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v3

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v7, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v4

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createLoadingMoreViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/LoadingMoreViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v1, :cond_0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/LoadingMoreViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createMediaAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->audioRecordViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;

    if-eqz v5, :cond_0

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "audioRecordViewStyle"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createMessageDeletedViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v4, :cond_0

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createPlainTextViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v4

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final createPollItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v4, :cond_0

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createSystemMessageItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/SystemMessageViewHolder;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v2, :cond_0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/SystemMessageViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemSystemMessageBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createThreadSeparatorViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ThreadSeparatorViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v3, :cond_0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ThreadSeparatorViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadDividerBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final createUnreadSeparatorViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;->getDecorators()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    if-eqz v4, :cond_0

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final getTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->textTransformer$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    return-object v0
.end method

.method private static final textTransformer_delegate$lambda$0()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getMessageTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unhandled MessageList view type: "

    invoke-static {p2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createPollItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;-><init>(Landroid/view/ViewGroup;I)V

    return-object v0

    :pswitch_2
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createUnreadSeparatorViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createLinkAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createFileAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createMediaAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createGiphyAttachmentViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_7
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;-><init>(Landroid/view/ViewGroup;I)V

    return-object v0

    :pswitch_8
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createErrorMessageItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createSystemMessageItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createGiphyMessageItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_b
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;-><init>(Landroid/view/ViewGroup;I)V

    return-object v0

    :pswitch_c
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createThreadSeparatorViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createLoadingMoreViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createCustomAttachmentsViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createPlainTextViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createMessageDeletedViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->createDateDividerViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->attachmentFactoryManager:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "attachmentFactoryManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getDecoratorProvider$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->decoratorProvider:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "decoratorProvider"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;)I"
        }
    .end annotation

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/DateDividerViewHolder;

    if-eqz v0, :cond_0

    const/16 p1, 0x3e9

    return p1

    .line 3
    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;

    if-eqz v0, :cond_1

    const/16 p1, 0x3ea

    return p1

    .line 4
    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;

    if-eqz v0, :cond_2

    const/16 p1, 0x3eb

    return p1

    .line 5
    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;

    if-eqz v0, :cond_3

    const/16 p1, 0x3ec

    return p1

    .line 6
    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/LoadingMoreViewHolder;

    if-eqz v0, :cond_4

    const/16 p1, 0x3ed

    return p1

    .line 7
    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ThreadSeparatorViewHolder;

    if-eqz v0, :cond_5

    const/16 p1, 0x3ee

    return p1

    .line 8
    :cond_5
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;

    if-eqz v0, :cond_6

    const/16 p1, 0x3f0

    return p1

    .line 9
    :cond_6
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/SystemMessageViewHolder;

    if-eqz v0, :cond_7

    const/16 p1, 0x3f1

    return p1

    .line 10
    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/ErrorMessageViewHolder;

    if-eqz v0, :cond_8

    const/16 p1, 0x3f2

    return p1

    .line 11
    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;

    if-eqz v0, :cond_9

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/EmptyViewHolder;->getViewType()I

    move-result p1

    return p1

    .line 12
    :cond_9
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;

    if-eqz v0, :cond_a

    const/16 p1, 0x3f7

    return p1

    .line 13
    :cond_a
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;

    if-eqz v0, :cond_b

    const/16 p1, 0x3f4

    return p1

    .line 14
    :cond_b
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;

    if-eqz v0, :cond_c

    const/16 p1, 0x3f6

    return p1

    .line 15
    :cond_c
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;

    if-eqz v0, :cond_d

    const/16 p1, 0x3f5

    return p1

    .line 16
    :cond_d
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;

    if-eqz v0, :cond_e

    const/16 p1, 0x3f8

    return p1

    .line 17
    :cond_e
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;

    if-eqz v0, :cond_f

    const/16 p1, 0x3fa

    return p1

    .line 18
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unhandled MessageList view holder: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getItemViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->getAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;->getViewTypeValue(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)I

    move-result p1

    return p1
.end method

.method public final getListeners()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    return-object v0
.end method

.method public final setAttachmentFactoryManager$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V
    .locals 1

    const-string v0, "attachmentFactoryManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->attachmentFactoryManager:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    return-void
.end method

.method public final setAudioRecordViewStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle<",
            "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;",
            ">;)V"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->audioRecordViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;

    return-void
.end method

.method public final setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->decoratorProvider:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;

    return-void
.end method

.method public final setGiphyViewHolderStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->giphyViewHolderStyle:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    return-void
.end method

.method public final setListeners$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    return-void
.end method

.method public final setMessageListItemStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    return-void
.end method

.method public final setReplyMessageListItemViewStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->messageReplyStyle:Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    return-void
.end method
