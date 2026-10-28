.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008Q\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0008\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0008\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030#\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u000b\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008(\u0010)J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0008H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010]\u001a\u00020\rH\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u00107J\u000b\u0010_\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0015\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010a\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\t\u0010c\u001a\u00020\u0008H\u00c6\u0003J\u0015\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0012H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0015\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u00c6\u0003J\t\u0010k\u001a\u00020 H\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010m\u001a\u0008\u0012\u0004\u0012\u00020\u00030#H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000f\u0010o\u001a\u0008\u0012\u0004\u0012\u00020&0\u000bH\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010PJ\u00ea\u0002\u0010q\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00082\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00122\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0014\u0008\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00122\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\u00032\u000e\u0008\u0002\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030#2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00132\u000e\u0008\u0002\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u000b2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\r2\u0008\u0010t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010u\u001a\u00020\u0008H\u00d6\u0001J\t\u0010v\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010+R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010+R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010+R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010+R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\u00086\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0011\u0010\u0014\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u00100R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u00103R\u0011\u0010\u0016\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u00100R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010:R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010:R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010:R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010:R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010<R\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010+R\u0017\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0013\u0010$\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010MR\u0017\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u00103R\u0015\u0010\'\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010Q\u001a\u0004\u0008O\u0010PR\u001e\u0010R\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008S\u0010+\"\u0004\u0008T\u0010U\u00a8\u0006w"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
        "",
        "type",
        "",
        "channelId",
        "name",
        "image",
        "cooldown",
        "",
        "createdByUserId",
        "filterTags",
        "",
        "frozen",
        "",
        "hidden",
        "hideMessagesBefore",
        "Ljava/util/Date;",
        "members",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
        "memberCount",
        "watcherIds",
        "watcherCount",
        "reads",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
        "lastMessageAt",
        "lastMessageId",
        "createdAt",
        "updatedAt",
        "deletedAt",
        "extraData",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "team",
        "ownCapabilities",
        "",
        "membership",
        "activeLiveLocations",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
        "messageCount",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V",
        "getType",
        "()Ljava/lang/String;",
        "getChannelId",
        "getName",
        "getImage",
        "getCooldown",
        "()I",
        "getCreatedByUserId",
        "getFilterTags",
        "()Ljava/util/List;",
        "getFrozen",
        "()Z",
        "getHidden",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getHideMessagesBefore",
        "()Ljava/util/Date;",
        "getMembers",
        "()Ljava/util/Map;",
        "getMemberCount",
        "getWatcherIds",
        "getWatcherCount",
        "getReads",
        "getLastMessageAt",
        "getLastMessageId",
        "getCreatedAt",
        "getUpdatedAt",
        "getDeletedAt",
        "getExtraData",
        "getSyncStatus",
        "()Lio/getstream/chat/android/models/SyncStatus;",
        "getTeam",
        "getOwnCapabilities",
        "()Ljava/util/Set;",
        "getMembership",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
        "getActiveLiveLocations",
        "getMessageCount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "cid",
        "getCid",
        "setCid",
        "(Ljava/lang/String;)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field private final activeLiveLocations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final channelId:Ljava/lang/String;

.field private cid:Ljava/lang/String;

.field private final cooldown:I

.field private final createdAt:Ljava/util/Date;

.field private final createdByUserId:Ljava/lang/String;

.field private final deletedAt:Ljava/util/Date;

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final filterTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final frozen:Z

.field private final hidden:Ljava/lang/Boolean;

.field private final hideMessagesBefore:Ljava/util/Date;

.field private final image:Ljava/lang/String;

.field private final lastMessageAt:Ljava/util/Date;

.field private final lastMessageId:Ljava/lang/String;

.field private final memberCount:I

.field private final members:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

.field private final messageCount:Ljava/lang/Integer;

.field private final name:Ljava/lang/String;

.field private final ownCapabilities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final reads:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private final team:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;

.field private final watcherCount:I

.field private final watcherIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p11

    move-object/from16 v8, p13

    move-object/from16 v9, p15

    move-object/from16 v10, p21

    move-object/from16 v11, p22

    move-object/from16 v12, p23

    move-object/from16 v13, p24

    move-object/from16 v14, p26

    const-string v15, "type"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "channelId"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "name"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "image"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "createdByUserId"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "filterTags"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "members"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "watcherIds"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "reads"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "extraData"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "syncStatus"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "team"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "ownCapabilities"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "activeLiveLocations"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    move/from16 v3, p5

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    move/from16 v3, p8

    iput-boolean v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    move-object/from16 v3, p9

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    move-object/from16 v3, p10

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    move/from16 v3, p12

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    move/from16 v3, p14

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    move-object/from16 v3, p16

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    move-object/from16 v3, p17

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    move-object/from16 v3, p18

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    move-object/from16 v3, p19

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    move-object/from16 v3, p20

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    iput-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    iput-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iput-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    iput-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    move-object/from16 v3, p25

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    iput-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    move-object/from16 v3, p27

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    const/4 v3, 0x2

    filled-new-array/range {p1 .. p2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%s:%s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cid:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p28

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p28, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p28, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p28, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p28, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p28, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p28, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p28, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p28, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p28, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p28, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p28, v16

    if-eqz v16, :cond_1a

    move-object/from16 p12, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    move-object/from16 p27, p12

    move-object/from16 p28, v1

    :goto_1a
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1b

    :cond_1a
    move-object/from16 p28, p27

    move-object/from16 p27, v1

    goto :goto_1a

    :goto_1b
    invoke-virtual/range {p1 .. p28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    return v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    return v0
.end method

.method public final component15()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    return-object v0
.end method

.method public final component16()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component19()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component21()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component22()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final component25()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    return-object v0
.end method

.method public final component26()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    return-object v0
.end method

.method public final component27()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    return v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;"
        }
    .end annotation

    const-string v0, "type"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdByUserId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterTags"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watcherIds"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reads"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v6, p21

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    move-object/from16 v9, p22

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "team"

    move-object/from16 v10, p23

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v11, p24

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeLiveLocations"

    move-object/from16 v13, p26

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v26, p25

    move-object/from16 v28, p27

    move-object/from16 v22, v6

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    move-object/from16 v25, v11

    move-object/from16 v27, v13

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v13, p12

    invoke-direct/range {v1 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    return v2

    :cond_1c
    return v0
.end method

.method public final getActiveLiveLocations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    return-object v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCooldown()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    return v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedByUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getFilterTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    return-object v0
.end method

.method public final getFrozen()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    return v0
.end method

.method public final getHidden()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHideMessagesBefore()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getLastMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMemberCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    return v0
.end method

.method public final getMembers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    return-object v0
.end method

.method public final getMembership()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    return-object v0
.end method

.method public final getMessageCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final getReads()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    return-object v0
.end method

.method public final getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final getTeam()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getWatcherCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    return v0
.end method

.method public final getWatcherIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public final setCid(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cid:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->type:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->channelId:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->name:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->image:Ljava/lang/String;

    iget v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->cooldown:I

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdByUserId:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->filterTags:Ljava/util/List;

    iget-boolean v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->frozen:Z

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hidden:Ljava/lang/Boolean;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->hideMessagesBefore:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->members:Ljava/util/Map;

    iget v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->memberCount:I

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherIds:Ljava/util/List;

    iget v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->watcherCount:I

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->reads:Ljava/util/Map;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageAt:Ljava/util/Date;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->lastMessageId:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->createdAt:Ljava/util/Date;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->updatedAt:Ljava/util/Date;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->deletedAt:Ljava/util/Date;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->extraData:Ljava/util/Map;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->team:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->ownCapabilities:Ljava/util/Set;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->membership:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-object/from16 v26, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->activeLiveLocations:Ljava/util/List;

    move-object/from16 v27, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->messageCount:Ljava/lang/Integer;

    const-string v0, ", channelId="

    move-object/from16 v28, v15

    const-string v15, ", name="

    move/from16 v29, v14

    const-string v14, "ChannelEntity(type="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    const-string v2, ", cooldown="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", createdByUserId="

    const-string v2, ", filterTags="

    invoke-static {v5, v1, v6, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", frozen="

    const-string v2, ", hidden="

    invoke-static {v1, v2, v0, v7, v8}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hideMessagesBefore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", members="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memberCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", watcherIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", watcherCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastMessageAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastMessageId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    const-string v2, ", updatedAt="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", deletedAt="

    const-string v2, ", extraData="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", syncStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", team="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ownCapabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activeLiveLocations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v28

    invoke-static {v0, v2, v1}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
