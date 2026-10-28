.class public final Lio/getstream/chat/android/ui/common/state/messages/MessageActionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "updateMessage",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
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
.method public static final updateMessage(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/MessageAction;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/React;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/React;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/state/messages/React;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/React;Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/React;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v3, p1

    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/Resend;

    if-eqz p1, :cond_1

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/Resend;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/Resend;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/Resend;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    if-eqz p1, :cond_2

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/Reply;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/Reply;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    if-eqz p1, :cond_3

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/Copy;

    if-eqz p1, :cond_4

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/Copy;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/Copy;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/Copy;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;

    if-eqz p1, :cond_5

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;

    move-result-object p0

    return-object p0

    :cond_5
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-eqz p1, :cond_6

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/Edit;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/Edit;

    move-result-object p0

    return-object p0

    :cond_6
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/Pin;

    if-eqz p1, :cond_7

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/Pin;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/Pin;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/Pin;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/Delete;

    if-eqz p1, :cond_8

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/Delete;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/Delete;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/Delete;

    move-result-object p0

    return-object p0

    :cond_8
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/Flag;

    if-eqz p1, :cond_9

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/Flag;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/Flag;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/Flag;

    move-result-object p0

    return-object p0

    :cond_9
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/CustomAction;

    if-eqz p1, :cond_a

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/CustomAction;

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v3, v0, p1, v0}, Lio/getstream/chat/android/ui/common/state/messages/CustomAction;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/CustomAction;Lio/getstream/chat/android/models/Message;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/CustomAction;

    move-result-object p0

    return-object p0

    :cond_a
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/MuteUser;

    if-eqz p1, :cond_b

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/MuteUser;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/MuteUser;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/MuteUser;

    move-result-object p0

    return-object p0

    :cond_b
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;

    if-eqz p1, :cond_c

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/UnmuteUser;

    move-result-object p0

    return-object p0

    :cond_c
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;

    if-eqz p1, :cond_d

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/BlockUser;

    move-result-object p0

    return-object p0

    :cond_d
    instance-of p1, p0, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;

    if-eqz p1, :cond_e

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;->copy(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
