.class public final Lio/getstream/chat/android/client/utils/channel/ChannelUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004H\u0007\u001a$\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "generateChannelIdIfNeeded",
        "",
        "channelId",
        "memberIds",
        "",
        "calculateNewLastMessageAt",
        "Ljava/util/Date;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "currentLastMessageAt",
        "skipLastMsgUpdateForSystemMsgs",
        "",
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
.method public static final calculateNewLastMessageAt(Lio/getstream/chat/android/models/Message;Ljava/util/Date;Z)Ljava/util/Date;
    .locals 2

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "system"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object p2

    if-nez p2, :cond_3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object p2

    if-nez p2, :cond_3

    :goto_0
    return-object p1

    :cond_3
    if-eqz p1, :cond_5

    invoke-virtual {p2, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    return-object p1

    :cond_5
    :goto_1
    return-object p2
.end method

.method public static final generateChannelIdIfNeeded(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "channelId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/16 v6, 0x3d

    const/4 v2, 0x0

    const-string v3, "!members-"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method
