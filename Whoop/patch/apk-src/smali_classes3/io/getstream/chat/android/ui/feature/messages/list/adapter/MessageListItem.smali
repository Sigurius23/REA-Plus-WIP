.class public abstract Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00102\u00020\u0001:\t\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H&\u0082\u0001\u0008\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "",
        "<init>",
        "()V",
        "getStableId",
        "",
        "stringify",
        "",
        "DateSeparatorItem",
        "MessageItem",
        "TypingItem",
        "ThreadSeparatorItem",
        "LoadingMoreIndicatorItem",
        "ThreadPlaceholderItem",
        "UnreadSeparatorItem",
        "StartOfTheChannelItem",
        "Companion",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$Companion;

.field private static final LOADING_MORE_INDICATOR_STABLE_ID:J = 0x3L

.field private static final START_OF_THE_CHANNEL_STABLE_ID:J = 0x6L

.field private static final THREAD_PLACEHOLDER_STABLE_ID:J = 0x4L

.field private static final THREAD_SEPARATOR_ITEM_STABLE_ID:J = 0x2L

.field private static final TYPING_ITEM_STABLE_ID:J = 0x1L

.field private static final UNREAD_SEPARATOR_STABLE_ID:J = 0x5L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$Companion;

    return-void
.end method

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


# virtual methods
.method public final getStableId()J
    .locals 2

    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x1

    return-wide v0

    :cond_0
    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x2

    return-wide v0

    :cond_1
    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->uniqueIdentifier$stream_chat_android_ui_components_release()J

    move-result-wide v0

    return-wide v0

    :cond_2
    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0

    :cond_3
    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x3

    return-wide v0

    :cond_4
    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;

    if-eqz v0, :cond_5

    const-wide/16 v0, 0x4

    return-wide v0

    :cond_5
    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    if-eqz v0, :cond_6

    const-wide/16 v0, 0x5

    return-wide v0

    :cond_6
    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;

    if-eqz v0, :cond_7

    const-wide/16 v0, 0x6

    return-wide v0

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public abstract stringify()Ljava/lang/String;
.end method
