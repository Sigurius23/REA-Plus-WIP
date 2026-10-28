.class public abstract Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0008\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u0082\u0001\u0004\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;",
        "",
        "<init>",
        "()V",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "ownCapabilities",
        "",
        "",
        "getOwnCapabilities",
        "()Ljava/util/Set;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageFailedModerationState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageOptionsState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsPickerState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsState;",
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


# virtual methods
.method public abstract getChannel()Lio/getstream/chat/android/models/Channel;
.end method

.method public abstract getMessage()Lio/getstream/chat/android/models/Message;
.end method

.method public final getOwnCapabilities()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
