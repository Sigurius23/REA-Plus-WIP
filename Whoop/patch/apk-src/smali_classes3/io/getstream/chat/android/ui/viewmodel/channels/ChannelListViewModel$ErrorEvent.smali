.class public abstract Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ErrorEvent"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;,
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0002\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;",
        "",
        "Ln23/e;",
        "streamError",
        "<init>",
        "(Ln23/e;)V",
        "Ln23/e;",
        "getStreamError",
        "()Ln23/e;",
        "LeaveChannelError",
        "DeleteChannelError",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;",
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
.field private final streamError:Ln23/e;


# direct methods
.method private constructor <init>(Ln23/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;->streamError:Ln23/e;

    return-void
.end method

.method public synthetic constructor <init>(Ln23/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;-><init>(Ln23/e;)V

    return-void
.end method


# virtual methods
.method public getStreamError()Ln23/e;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;->streamError:Ln23/e;

    return-object v0
.end method
