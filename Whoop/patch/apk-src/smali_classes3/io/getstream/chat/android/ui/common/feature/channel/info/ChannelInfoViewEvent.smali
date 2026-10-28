.class public interface abstract Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$AddMembersError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BlockUser;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BlockUserError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelModal;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelModal;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MemberInfoModal;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteChannelError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteUser;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteUserError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToChannel;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToDraftChannel;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToFilesAttachments;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToMediaAttachments;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToPinnedMessages;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateUp;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberModal;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RenameChannelError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnbanMemberError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnblockUser;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnblockUserError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteChannelError;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteUser;,
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteUserError;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u001f\u0002\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0082\u0001\u0007!\"#$%&\'\u00a8\u0006(\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;",
        "",
        "Modal",
        "LeaveChannelModal",
        "DeleteChannelModal",
        "MemberInfoModal",
        "BanMemberModal",
        "RemoveMemberModal",
        "MuteUser",
        "UnmuteUser",
        "BlockUser",
        "UnblockUser",
        "Navigation",
        "NavigateUp",
        "NavigateToPinnedMessages",
        "NavigateToMediaAttachments",
        "NavigateToFilesAttachments",
        "NavigateToChannel",
        "NavigateToDraftChannel",
        "Error",
        "RenameChannelError",
        "MuteChannelError",
        "MuteUserError",
        "UnmuteUserError",
        "BlockUserError",
        "UnblockUserError",
        "UnmuteChannelError",
        "LeaveChannelError",
        "DeleteChannelError",
        "BanMemberError",
        "UnbanMemberError",
        "RemoveMemberError",
        "AddMembersError",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BlockUser;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteUser;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnblockUser;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteUser;",
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
