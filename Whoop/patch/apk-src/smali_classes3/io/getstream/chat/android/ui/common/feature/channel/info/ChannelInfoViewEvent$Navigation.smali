.class public abstract Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Navigation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0001\u0008B\u0013\u0008\u0004\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0006\t\n\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;",
        "reason",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;)V",
        "getReason",
        "()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;",
        "Reason",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToChannel;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToDraftChannel;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToFilesAttachments;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToMediaAttachments;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToPinnedMessages;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateUp;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final reason:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;


# direct methods
.method private constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;->reason:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;)V

    return-void
.end method


# virtual methods
.method public getReason()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;->reason:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;

    return-object v0
.end method
