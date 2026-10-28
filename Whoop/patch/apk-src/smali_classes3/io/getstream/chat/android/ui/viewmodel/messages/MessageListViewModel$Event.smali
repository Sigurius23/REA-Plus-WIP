.class public abstract Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Event"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BlockUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BottomEndRegionReached;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$EndRegionReached;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$LastMessageRead;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MarkAsUnreadMessage;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MuteUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$OpenThread;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PinMessage;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollClosed;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveShadowBanFromUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ThreadModeEntered;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ToggleOriginalText;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnbanUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnblockUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnflagUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnmuteUser;,
        Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnpinMessage;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:#\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001#\'()*+,-./0123456789:;<=>?@ABCDEFGHI\u00a8\u0006J"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;",
        "",
        "<init>",
        "()V",
        "BackButtonPressed",
        "EndRegionReached",
        "BottomEndRegionReached",
        "LastMessageRead",
        "ThreadModeEntered",
        "OpenThread",
        "ToggleOriginalText",
        "DeleteMessage",
        "FlagMessage",
        "PinMessage",
        "UnpinMessage",
        "MarkAsUnreadMessage",
        "GiphyActionSelected",
        "RetryMessage",
        "MessageReaction",
        "MuteUser",
        "UnmuteUser",
        "BanUser",
        "UnbanUser",
        "ShadowBanUser",
        "RemoveShadowBanFromUser",
        "FlagUser",
        "UnflagUser",
        "ReplyMessage",
        "ReplyAttachment",
        "DownloadAttachment",
        "ShowMessage",
        "RemoveAttachment",
        "HideUnreadLabel",
        "BlockUser",
        "UnblockUser",
        "PollOptionUpdated",
        "PollClosed",
        "PollOptionSuggested",
        "PollAnswerCast",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BanUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BlockUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BottomEndRegionReached;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DownloadAttachment;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$EndRegionReached;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$FlagUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$GiphyActionSelected;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$HideUnreadLabel;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$LastMessageRead;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MarkAsUnreadMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MessageReaction;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$MuteUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$OpenThread;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PinMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollAnswerCast;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollClosed;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionSuggested;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$PollOptionUpdated;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveAttachment;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RemoveShadowBanFromUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyAttachment;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ReplyMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShadowBanUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ShowMessage;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ThreadModeEntered;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$ToggleOriginalText;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnbanUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnblockUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnflagUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnmuteUser;",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$UnpinMessage;",
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
