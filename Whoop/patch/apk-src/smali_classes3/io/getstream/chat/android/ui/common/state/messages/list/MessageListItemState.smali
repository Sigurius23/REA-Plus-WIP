.class public abstract Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0007\t\n\u000b\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
        "",
        "<init>",
        "()V",
        "id",
        "",
        "getId$annotations",
        "getId",
        "()Ljava/lang/String;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/EmptyThreadPlaceholderItemState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 3

    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-string v2, "date-separator-"

    invoke-static {v0, v1, v2}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-string v2, "thread-date-separator-"

    invoke-static {v0, v1, v2}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    if-eqz v0, :cond_3

    const-string v0, "typing-indicator"

    return-object v0

    :cond_3
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/EmptyThreadPlaceholderItemState;

    if-eqz v0, :cond_4

    const-string v0, "empty-thread-placeholder"

    return-object v0

    :cond_4
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;

    if-eqz v0, :cond_5

    const-string v0, "unread-separator"

    return-object v0

    :cond_5
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;

    if-eqz v0, :cond_6

    const-string v0, "start-of-the-channel"

    return-object v0

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
