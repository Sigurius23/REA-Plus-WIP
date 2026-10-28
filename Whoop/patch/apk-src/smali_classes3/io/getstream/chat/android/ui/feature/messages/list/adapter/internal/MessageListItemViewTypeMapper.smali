.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u000c\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002J\u000c\u0010\u0010\u001a\u00020\u000e*\u00020\u000fH\u0002J\u000c\u0010\u0011\u001a\u00020\u000e*\u00020\u000fH\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;",
        "",
        "<init>",
        "()V",
        "getViewTypeValue",
        "",
        "messageListItem",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "attachmentFactoryManager",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "messageItemToViewType",
        "messageItem",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "isPoll",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "isMediaAttachment",
        "containsOnlyLinkAttachments",
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final containsOnlyLinkAttachments(Lio/getstream/chat/android/models/Message;)Z
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_3
    return v2
.end method

.method private final isMediaAttachment(Lio/getstream/chat/android/models/Message;)Z
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->isUploading(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->isFailed(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_3
    const/4 p1, 0x0

    return p1
.end method

.method private final isPoll(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final messageItemToViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)I
    .locals 5

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v4}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v0, v1, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isGiphy(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;->containsOnlyLinkAttachments(Lio/getstream/chat/android/models/Message;)Z

    move-result v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v3

    if-eqz v3, :cond_5

    const/16 p1, 0x3fa

    return p1

    :cond_5
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 p1, 0x3ea

    return p1

    :cond_6
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isError(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationBounce(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-nez v3, :cond_7

    const/16 p1, 0x3f2

    return p1

    :cond_7
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isSystem(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 p1, 0x3f1

    return p1

    :cond_8
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isGiphyEphemeral(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-eqz v3, :cond_9

    const/16 p1, 0x3f0

    return p1

    :cond_9
    if-nez v0, :cond_e

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;->canHandle(Lio/getstream/chat/android/models/Message;)Z

    move-result p2

    if-eqz p2, :cond_a

    const/16 p1, 0x3ec

    return p1

    :cond_a
    if-eqz v2, :cond_b

    const/16 p1, 0x3f4

    return p1

    :cond_b
    if-eqz v1, :cond_c

    const/16 p1, 0x3f7

    return p1

    :cond_c
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;->isMediaAttachment(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_d

    const/16 p1, 0x3f5

    return p1

    :cond_d
    const/16 p1, 0x3f6

    return p1

    :cond_e
    const/16 p1, 0x3eb

    return p1
.end method


# virtual methods
.method public final getViewTypeValue(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)I
    .locals 1

    const-string v0, "messageListItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentFactoryManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    if-eqz v0, :cond_0

    const/16 p1, 0x3e9

    return p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;

    if-eqz v0, :cond_1

    const/16 p1, 0x3ed

    return p1

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;

    if-eqz v0, :cond_2

    const/16 p1, 0x3ee

    return p1

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;->messageItemToViewType(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)I

    move-result p1

    return p1

    :cond_3
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    if-eqz p2, :cond_4

    const/16 p1, 0x3ef

    return p1

    :cond_4
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;

    if-eqz p2, :cond_5

    const/16 p1, 0x3f3

    return p1

    :cond_5
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    if-eqz p2, :cond_6

    const/16 p1, 0x3f8

    return p1

    :cond_6
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;

    if-eqz p1, :cond_7

    const/16 p1, 0x3f9

    return p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
