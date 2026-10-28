.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;",
        "Lio/getstream/chat/android/models/ChannelConfig;",
        "toModel",
        "Lio/getstream/chat/android/models/Command;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
        "channelType",
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
.method public static final toEntity(Lio/getstream/chat/android/models/ChannelConfig;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;
    .locals 26

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelConfig;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v0

    .line 2
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    .line 3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelConfig;->getType()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    .line 5
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getUpdatedAt()Ljava/util/Date;

    move-result-object v5

    .line 6
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getName()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getTypingEventsEnabled()Z

    move-result v7

    .line 8
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getReadEventsEnabled()Z

    move-result v8

    .line 9
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getDeliveryEventsEnabled()Z

    move-result v9

    .line 10
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getConnectEventsEnabled()Z

    move-result v10

    .line 11
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getSearchEnabled()Z

    move-result v11

    .line 12
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->isReactionsEnabled()Z

    move-result v12

    .line 13
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->isThreadEnabled()Z

    move-result v13

    .line 14
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getMuteEnabled()Z

    move-result v14

    .line 15
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getUploadsEnabled()Z

    move-result v15

    .line 16
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getUrlEnrichmentEnabled()Z

    move-result v16

    .line 17
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getCustomEventsEnabled()Z

    move-result v17

    .line 18
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getPushNotificationsEnabled()Z

    move-result v18

    .line 19
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getMessageRetention()Ljava/lang/String;

    move-result-object v19

    .line 20
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getMaxMessageLength()I

    move-result v20

    .line 21
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getAutomod()Ljava/lang/String;

    move-result-object v21

    .line 22
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getAutomodBehavior()Ljava/lang/String;

    move-result-object v22

    .line 23
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getBlocklistBehavior()Ljava/lang/String;

    move-result-object v23

    .line 24
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getMessageRemindersEnabled()Z

    move-result v24

    .line 25
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getMarkMessagesPending()Z

    move-result v25

    .line 26
    invoke-direct/range {v2 .. v25}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 27
    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelConfig;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getCommands()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 28
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 30
    check-cast v4, Lio/getstream/chat/android/models/Command;

    .line 31
    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelConfig;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigMapperKt;->toEntity(Lio/getstream/chat/android/models/Command;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;

    move-result-object v4

    .line 32
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)V

    return-object v0
.end method

.method private static final toEntity(Lio/getstream/chat/android/models/Command;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;
    .locals 6

    .line 34
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;

    .line 35
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Command;->getName()Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Command;->getDescription()Ljava/lang/String;

    move-result-object v2

    .line 37
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Command;->getArgs()Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Command;->getSet()Ljava/lang/String;

    move-result-object v4

    move-object v5, p1

    .line 39
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;)Lio/getstream/chat/android/models/ChannelConfig;
    .locals 32

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->getChannelConfigInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getChannelType()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->getChannelConfigInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    .line 4
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v5

    .line 5
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getName()Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isTypingEvents()Z

    move-result v7

    .line 7
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isReadEvents()Z

    move-result v8

    .line 8
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getDeliveryEventsEnabled()Z

    move-result v9

    .line 9
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isConnectEvents()Z

    move-result v10

    .line 10
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isSearch()Z

    move-result v11

    .line 11
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isReactionsEnabled()Z

    move-result v12

    .line 12
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isThreadEnabled()Z

    move-result v13

    .line 13
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isMutes()Z

    move-result v14

    .line 14
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getUploadsEnabled()Z

    move-result v15

    .line 15
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getUrlEnrichmentEnabled()Z

    move-result v16

    .line 16
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getCustomEventsEnabled()Z

    move-result v17

    .line 17
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getPushNotificationsEnabled()Z

    move-result v18

    .line 18
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMessageRetention()Ljava/lang/String;

    move-result-object v21

    .line 19
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMaxMessageLength()I

    move-result v22

    .line 20
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getAutomod()Ljava/lang/String;

    move-result-object v23

    .line 21
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getAutomodBehavior()Ljava/lang/String;

    move-result-object v24

    .line 22
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getBlocklistBehavior()Ljava/lang/String;

    move-result-object v25

    .line 23
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->getCommands()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 24
    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v19, v2

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 26
    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;

    .line 27
    invoke-static {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;)Lio/getstream/chat/android/models/Command;

    move-result-object v2

    .line 28
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual/range {v19 .. v19}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMessageRemindersEnabled()Z

    move-result v27

    .line 30
    invoke-virtual/range {v19 .. v19}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMarkMessagesPending()Z

    move-result v29

    move-object/from16 v26, v3

    .line 31
    new-instance v3, Lio/getstream/chat/android/models/Config;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v28, 0x0

    const v30, 0x1018000

    const/16 v31, 0x0

    invoke-direct/range {v3 .. v31}, Lio/getstream/chat/android/models/Config;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    new-instance v1, Lio/getstream/chat/android/models/ChannelConfig;

    invoke-direct {v1, v0, v3}, Lio/getstream/chat/android/models/ChannelConfig;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Config;)V

    return-object v1
.end method

.method private static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;)Lio/getstream/chat/android/models/Command;
    .locals 4

    .line 33
    new-instance v0, Lio/getstream/chat/android/models/Command;

    .line 34
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;->getName()Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;->getDescription()Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;->getArgs()Ljava/lang/String;

    move-result-object v3

    .line 37
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;->getSet()Ljava/lang/String;

    move-result-object p0

    .line 38
    invoke-direct {v0, v1, v2, v3, p0}, Lio/getstream/chat/android/models/Command;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
