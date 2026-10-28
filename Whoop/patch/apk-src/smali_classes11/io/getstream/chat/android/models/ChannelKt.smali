.class public final Lio/getstream/chat/android/models/ChannelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u00a8\u0006\u0005"
    }
    d2 = {
        "mergeChannelFromEvent",
        "Lio/getstream/chat/android/models/Channel;",
        "that",
        "toChannelData",
        "Lio/getstream/chat/android/models/ChannelData;",
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
.method public static final mergeChannelFromEvent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;
    .locals 40
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "that"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getHidden()Ljava/lang/Boolean;

    move-result-object v21

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getFrozen()Z

    move-result v7

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getFilterTags()Ljava/util/List;

    move-result-object v34

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getTeam()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v17

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v36

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v11

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getHiddenMessagesBefore()Ljava/util/Date;

    move-result-object v22

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v12

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCreatedAt()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getUpdatedAt()Ljava/util/Date;

    move-result-object v10

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getDeletedAt()Ljava/util/Date;

    move-result-object v9

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMessageCount()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMessageCount()Ljava/lang/Integer;

    move-result-object v0

    :cond_0
    move-object/from16 v32, v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getLastMessageAt()Ljava/util/Date;

    move-result-object v35

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const v37, -0x401c97ed

    invoke-static/range {v1 .. v39}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    return-object v0
.end method

.method public static final toChannelData(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/ChannelData;
    .locals 22

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getFilterTags()Ljava/util/List;

    move-result-object v20

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getFrozen()Z

    move-result v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCooldown()I

    move-result v7

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getUpdatedAt()Ljava/util/Date;

    move-result-object v10

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getDeletedAt()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v12

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v14

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getTeam()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v15

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object v16

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v17

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMessageCount()Ljava/lang/Integer;

    move-result-object v18

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getPushPreference()Lio/getstream/chat/android/models/PushPreference;

    move-result-object v19

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getLastMessageAt()Ljava/util/Date;

    move-result-object v21

    new-instance v1, Lio/getstream/chat/android/models/ChannelData;

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/models/ChannelData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)V

    return-object v1
.end method
