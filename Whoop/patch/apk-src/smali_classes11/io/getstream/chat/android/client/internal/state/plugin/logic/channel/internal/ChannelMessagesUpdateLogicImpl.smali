.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "state",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "upsertMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "()Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "repliedMessage",
        "setRepliedMessage",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "stream-chat-android-client_release"
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
.field private final state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    return-void
.end method


# virtual methods
.method public final channelState()Lio/getstream/chat/android/client/channel/state/ChannelState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    return-object v0
.end method

.method public final setRepliedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setRepliedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final upsertMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method
