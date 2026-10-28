.class public final Lio/getstream/chat/android/client/utils/internal/MessageUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "getMessageType",
        "",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "stream-chat-android-client_release"
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
.method public static final getMessageType(Lio/getstream/chat/android/models/Message;)Ljava/lang/String;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->hasPendingAttachments(Lio/getstream/chat/android/models/Message;)Z

    move-result v1

    if-nez v0, :cond_0

    if-eqz v1, :cond_0

    const-string p0, "ephemeral"

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "system"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-object v0

    :cond_1
    const-string p0, "regular"

    return-object p0
.end method
