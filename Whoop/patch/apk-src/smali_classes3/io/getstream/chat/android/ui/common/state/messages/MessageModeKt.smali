.class public final Lio/getstream/chat/android/ui/common/state/messages/MessageModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "stringify",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final stringify(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Normal"

    return-object p0

    :cond_0
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v0, :cond_1

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p0

    const-string v0, "MessageThread(parentMessage.id="

    const-string v1, ")"

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
