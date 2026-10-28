.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntityUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "lastMessageInfo",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
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
.method public static final lastMessageInfo(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;)Ljava/lang/String;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getLastMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getLastMessageAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCid()Ljava/lang/String;

    move-result-object p0

    const-string v2, ", lastMessageAt: "

    const-string v3, ", cid: "

    const-string v4, "ChannelEntity(lastMessageId: "

    invoke-static {v4, v0, v2, v1, v3}, Lc13/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {p0, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
