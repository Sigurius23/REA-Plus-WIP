.class public final Lio/getstream/chat/android/models/ChannelDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "mergeFromEvent",
        "Lio/getstream/chat/android/models/ChannelData;",
        "that",
        "stream-chat-android-core"
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
.method public static final mergeFromEvent(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "that"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getFilterTags()Ljava/util/List;

    move-result-object v20

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getFrozen()Z

    move-result v8

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getCooldown()I

    move-result v7

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getTeam()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getExtraData()Ljava/util/Map;

    move-result-object v14

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getMemberCount()I

    move-result v12

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getUpdatedAt()Ljava/util/Date;

    move-result-object v10

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getDeletedAt()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getMessageCount()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelData;->getMessageCount()Ljava/lang/Integer;

    move-result-object v0

    :cond_0
    move-object/from16 v18, v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelData;->getLastMessageAt()Ljava/util/Date;

    move-result-object v21

    const v22, 0x2e003

    const/16 v23, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0
.end method
